package aplicalunos;

import java.sql.*;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author luciana
 */
class GuiCadastroAlunos extends JFrame {
    JLabel label1, label2, label3, label4,lblData;
    JButton btGravar, btAlterar, btExcluir, btNovo, btLocalizar, btCancelar, btSair;
    JButton btPrim, btAnt, btProx, btUlt,btCons;
    JPanel painel,painelBotoes,painelREG;
    JFrame janela;
    static JTextField tfRA, tfNome,tfData;
    private AlunosDAO alunos;
    private ResultSet resultSet;
    private ConsultaAluno consulta; 
    
    public static void main(String args[]){
        JFrame janela = new GuiCadastroAlunos();
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
    
    public GuiCadastroAlunos(){
        inicializacomponentes();
        definirEventos();
        
    }
    
    public void inicializacomponentes(){
        setLayout(new BorderLayout());     //define layout da janela
       
        painel = new JPanel();
        painel.setLayout(new BoxLayout(painel,BoxLayout.PAGE_AXIS));    //define layout do painel
        this.add(painel,BorderLayout.NORTH);
        
        painelBotoes = new JPanel(new FlowLayout()); //define layout do painelBotoes    
        this.add(painelBotoes,BorderLayout.CENTER);
        
        painelREG = new JPanel(new FlowLayout());  //define layout do painelREG
        this.add(painelREG,BorderLayout.SOUTH);
        
        setTitle("Cadastro de alunos");
        setBounds(300,600,750,250);
        label1 = new JLabel("RA : ");
        label2 = new JLabel("Nome: ");
        lblData = new JLabel("Data Nascto:");
        label3 = new JLabel("Movimentação de Registros");
        tfRA = new JTextField(4);
        tfNome= new JTextField(35);
        tfData = new JTextField(8);
        btGravar = new JButton("Gravar");
        btAlterar = new JButton("Alterar");
        btExcluir = new JButton("Excluir");
        btLocalizar = new JButton("Localizar");
        btNovo = new JButton("Novo");
        btCancelar = new JButton("Cancelar");
        btCons = new JButton("Consultar");
        btSair = new JButton("Sair");
        btPrim = new JButton("<<");
        btPrim.setToolTipText("Primeiro");
        btAnt = new JButton("<");
        btAnt.setToolTipText("Anterior");
        btProx = new JButton(">");
        btProx.setToolTipText("Próximo");
        btUlt = new JButton(">>");
        btUlt.setToolTipText("Ultimo");
        painel.add(label1);
        painel.add(tfRA);
        painel.add(label2);
        painel.add(tfNome);
        painel.add(lblData);
        painel.add(tfData);
        painelBotoes.add(btNovo);
        painelBotoes.add(btLocalizar);
        painelBotoes.add(btGravar);
        painelBotoes.add(btAlterar);
        painelBotoes.add(btExcluir);
        painelBotoes.add(btCancelar);
        painelBotoes.add(btCons);
        painelBotoes.add(btSair);
        painelREG.add(label3);
        painelREG.add(btPrim);
        painelREG.add(btAnt);
        painelREG.add(btProx);
        painelREG.add(btUlt);
        setResizable(true);
        
        setBotoes(true,true,false,false,false,false);
        alunos = new AlunosDAO();
        if (!alunos.bd.getConnection()){
            JOptionPane.showMessageDialog(null,"Falha na conexão!");
            System.exit(0);
        }
        tabelaAlunos();
        //tfRA.setEnabled(false);
        //tfNome.setEnabled(false);
        //carregaDados();
    }
        public void setBotoes(boolean bNovo, boolean bLocalizar, boolean bGravar, 
                boolean bAlterar, boolean bExcluir, boolean bCancelar){
        
            btNovo.setEnabled(bNovo);
            btLocalizar.setEnabled(bLocalizar);
            btGravar.setEnabled(bGravar);
            btAlterar.setEnabled(bAlterar);
            btExcluir.setEnabled(bExcluir);
            btCancelar.setEnabled(bCancelar);
        }
   
        public void definirEventos(){
            btSair.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    alunos.bd.close();
                    System.exit(0);
                }
            });
        
        btProx.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               try{
                    resultSet.next();
                    carregaDados();
                } catch (SQLException erro){
                
                }
            }    
        });
        
        btAnt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.previous();
                    carregaDados();
                } catch (SQLException erro){
                }
            }
        });
        
        btPrim.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                try {
                    resultSet.first();
                    carregaDados();
                } catch (SQLException erro){
                
                }
            }
        });
        
        btUlt.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             try{
                resultSet.last();
                carregaDados();
                }
            catch (SQLException erro){
                
            }
            }
        });
       
        btNovo.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //tfRA.setEnabled(true);
                //tfNome.setEnabled(true);
                limparcampos();
            
                setBotoes(false,false,true,false,false,true);
                tfRA.requestFocus();
            }
        });
       
        btCancelar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                //tfRA.setEnabled(false);
                //tfNome.setEnabled(false);
                limparcampos(); 
            }  
        });
        
        btGravar.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                
                if (tfRA.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"O código não pode ser vazio!");
                    tfRA.requestFocus();
                    return;
                }
                if (tfNome.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"O nome não pode ser vazio!");
                    tfNome.requestFocus();
                    return;
                }
                Date data = new Date();
                String dt = tfData.getText();
                alunos.aluno.setRA(Integer.parseInt(tfRA.getText()));
                alunos.aluno.setNome(tfNome.getText());
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");  
               
                try {
                    data = formato.parse(tfData.getText());
                    java.sql.Date DataSQL = new java.sql.Date(data.getTime()); 
                    alunos.aluno.setData((DataSQL));
                } catch (ParseException ex) {
                    Logger.getLogger(GuiCadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
                }
                
                JOptionPane.showMessageDialog(null,alunos.atualizar(AlunosDAO.INCLUSAO));
                limparcampos();
                tabelaAlunos();
            }
        });
        
        btAlterar.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 
                alunos.aluno.setNome(tfNome.getText()); 
                
                Date DataFormatada = new Date();
                //String data=tfData.getText();
                SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy"); 
                 try {
                     DataFormatada = formato.parse(tfData.getText());
                     java.sql.Date DataSQL = new java.sql.Date(DataFormatada.getTime());
                 
                alunos.aluno.setData(DataSQL);
                } catch (ParseException ex) {
                     Logger.getLogger(GuiCadastroAlunos.class.getName()).log(Level.SEVERE, null, ex);
                 }
                JOptionPane.showMessageDialog(null,alunos.atualizar(AlunosDAO.ALTERACAO));
                limparcampos();
                tabelaAlunos();
             }
        });
        
        btExcluir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                alunos.aluno.setRA(Integer.parseInt(tfRA.getText()));
                alunos.localizar();
                int n= JOptionPane.showConfirmDialog(null, alunos.aluno.getNome(),
                        "Excluir o aluno?",JOptionPane.YES_NO_OPTION);
                if (n==JOptionPane.YES_OPTION){
                    JOptionPane.showMessageDialog(null,alunos.atualizar(AlunosDAO.EXCLUSAO));
                    limparcampos();
                    tabelaAlunos();
                }
            }
        });
        
        btLocalizar.addActionListener(new ActionListener(){
             public void actionPerformed(ActionEvent e){
                 atualizarCampos();
             }
        });
        
        btCons.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
               consulta = new ConsultaAluno();
               consulta.inicializacomp();
               consulta.windowOpened();
               consulta.defineEvento();
            }
        });
        
        }
        public void limparcampos(){
            tfRA.setText("");
            tfNome.setText("");
            tfData.setText("");
            setBotoes(true,true,false,false,false,false);
        }
        
        public void atualizarCampos(){
            alunos.aluno.setRA(Integer.parseInt(tfRA.getText()));
            if (alunos.localizar()){
                tfRA.setText(Integer.toString(alunos.aluno.getRA()));
                tfNome.setText(alunos.aluno.getNome());
                tfData.setText(convertedata((alunos.aluno.getData().toString())));                
                
                setBotoes(true,true,false,true,true,true);
            } else {
                JOptionPane.showMessageDialog(null,"Aluno não econtrado!");
                limparcampos();
            }
        }
        
        
        public void tabelaAlunos(){
        try{
            String sql= "select * from aluno";
            PreparedStatement statement = alunos.bd.connection.prepareStatement(sql);
            resultSet = statement.executeQuery();            
        }
        catch (SQLException erro)
        {
            JOptionPane.showMessageDialog(null,"Problemas na conexão!\n"+ erro.toString());
        }
        
    }
        
        public void carregaDados(){
            try{
               String vazio = " ";
                if(resultSet.isAfterLast())
                    resultSet.last();
                if (resultSet.isBeforeFirst())
                    resultSet.first();
                
                tfRA.setText(resultSet.getString("RA"));
                tfNome.setText(resultSet.getString("Nome"));      
                if (resultSet.getDate("Data") == null)
                    tfData.setText("");
                else {
                    tfData.setText(convertedata(resultSet.getDate("Data").toString()));
                    
                }
            } catch (SQLException erro) {
                JOptionPane.showMessageDialog(null,"Problemas na conexão!\n"+ erro.toString());         
            }
        } 
        
        String convertedata(String Dt) {
            String ano=Dt.substring(0,4);
            String mes=Dt.substring(5,7);
            String dia=Dt.substring(8,10);
            String r=dia+"/"+mes+"/"+ano;
        
            return r;
        }
}
        
        
        
    
    
