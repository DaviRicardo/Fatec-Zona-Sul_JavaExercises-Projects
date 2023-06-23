package aplicalunos;

import javax.swing.*;
import java.awt.event.*;
import java.sql.*;
import javax.swing.table.*;

/**
 *
 * @author luciana
 */
public class ConsultaAluno extends JFrame {
    private AlunosDAO alunos;
    private ResultSet resultSet;
    private JLabel label1;
    private JTextField tfSQL;
    private JButton btExec, btRA, btSair;
    private JScrollPane scrollTable;
    private JTable table;
    //private JPanel panel;
    private PreparedStatement statement;
    private String vSQL;
    public JFrame frame1;
    
    
    public void inicializacomp() {
        frame1 = new ConsultaAluno();
        JPanel panel = new JPanel();
        frame1.add(panel);
        setLayout(null);
        frame1.setSize(600, 600);
        frame1.setTitle("Consultas");
        frame1.setResizable(true);
        
        btExec = new JButton("Ordem alfabética");
        btRA = new JButton("Ordem RA");
        btSair=new JButton("Sair");
        scrollTable = new JScrollPane();
       
        panel.add(scrollTable);
        panel.add(btExec);
        panel.add(btRA);
        panel.add(btSair);
        frame1.pack();
        frame1.setVisible(true);
}
    
    public void windowOpened(){
        
    try{
       alunos = new AlunosDAO();
       if (!alunos.bd.getConnection()){
            JOptionPane.showMessageDialog(null,"Falha na conexão!");
            System.exit(0);  
                              
        }

                    vSQL = "select * from aluno";
                   
                    statement = alunos.bd.connection.prepareStatement(vSQL);
                    resultSet = statement.executeQuery();
                                     
                    DefaultTableModel tableModel = new DefaultTableModel();
                  
                    int qtcolunas = resultSet.getMetaData().getColumnCount();
                    for (int indice=1;indice<=qtcolunas;indice++){
                        tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
                    }
                    table = new JTable(tableModel);
                    
                    table.getColumnModel().getColumn(0).setPreferredWidth(10);
                    table.getColumnModel().getColumn(1).setPreferredWidth(50);
                    
                    
                    while (resultSet.next()){
                        try{
                        String[] dados = new String[qtcolunas];
                        for (int i=1; i<=qtcolunas;i++){
                        dados[i-1]= resultSet.getString(i);                                             
                        }
                        tableModel.addRow(dados);
                        System.out.println();
                        
                    }
                        catch (SQLException erro){
                            
                        }
                    scrollTable.setViewportView(table);
                    
                    
                    }
                    resultSet.close();
                    statement.close();
                    alunos.bd.close();
                    
                    }
                    catch (Exception erro){
                      JOptionPane.showMessageDialog(null,"Comando SQL inválido!"+erro.toString());  
                    }


}
 public void defineEvento(){  
    
     btExec.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    vSQL = "select * from aluno order by Nome";
                    carregaTable();
                }});
     btRA.addActionListener(new ActionListener(){
                public void actionPerformed(ActionEvent e){
                    vSQL = "select * from aluno order by RA";
                    carregaTable();
                }});
     
     btSair.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
             
             setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
             
             frame1.setVisible(false);
             frame1.dispose(); // libera os recurss
           
             //alunos.bd.close();
                  
            //Runtime.getRuntime().exit(0);
                    
                }});
            /*        try{
                         alunos = new AlunosDAO();
                    if (!alunos.bd.g0etConnection()){
                         JOptionPane.showMessageDialog(null,"Falha na conexão!");
                         System.exit(0);  
                              
                    }
                    
                  
                    vSQL = "select * from aluno order by RA";
                   
                    statement = alunos.bd.connection.prepareStatement(vSQL);
                    resultSet = statement.executeQuery();
                                     
                    DefaultTableModel tableModel = new DefaultTableModel();
                  
                    int qtcolunas = resultSet.getMetaData().getColumnCount();
                    for (int indice=1;indice<=qtcolunas;indice++){
                        tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
                    }
                    table = new JTable(tableModel);
                    
                    table.getColumnModel().getColumn(0).setPreferredWidth(10);
                    table.getColumnModel().getColumn(1).setPreferredWidth(50);
                    
                    
                    while (resultSet.next()){
                        try{
                        String[] dados = new String[qtcolunas];
                        for (int i=1; i<=qtcolunas;i++){
                        dados[i-1]= resultSet.getString(i);                                             
                        }
                        tableModel.addRow(dados);
                        System.out.println();
                        
                    }
                        catch (SQLException erro){
                            
                        }
                    scrollTable.setViewportView(table);
                    
                    
                    }
                    resultSet.close();
                    statement.close();
                    alunos.bd.close();
                    
                    }
                    catch (Exception erro){
                      JOptionPane.showMessageDialog(null,"Comando SQL inválido!"+erro.toString());  
                    }
                }
            });
        
     
 }*/
}
    public void carregaTable(){     
        try {
         alunos = new AlunosDAO();
         
         if (!alunos.bd.getConnection()) {
             JOptionPane.showMessageDialog(null,"Falha na conexão!");
             System.exit(0);  
                              
         }

                    //vSQL = "select * from aluno order by Nome";
        statement = alunos.bd.connection.prepareStatement(vSQL);
        resultSet = statement.executeQuery();
                                     
       DefaultTableModel tableModel = new DefaultTableModel();
                  
                    int qtcolunas = resultSet.getMetaData().getColumnCount();
                    for (int indice=1;indice<=qtcolunas;indice++){
                        tableModel.addColumn(resultSet.getMetaData().getColumnName(indice));
                    }
                    table = new JTable(tableModel);
                    
                    table.getColumnModel().getColumn(0).setPreferredWidth(10);
                    table.getColumnModel().getColumn(1).setPreferredWidth(50);
                    
                    
                    while (resultSet.next()){
                        try{
                        String[] dados = new String[qtcolunas];
                        for (int i=1; i<=qtcolunas;i++){
                        dados[i-1]= resultSet.getString(i);                                             
                        }
                        tableModel.addRow(dados);
                        System.out.println();
                        
                    }
                        catch (SQLException erro){
                            
                        }
                    scrollTable.setViewportView(table);
                    
                    
                    }
                    resultSet.close();
                    statement.close();
                    alunos.bd.close();
                    
                    }
                    catch (Exception erro){
                      JOptionPane.showMessageDialog(null,"Comando SQL inválido!"+erro.toString());  
                    }
                }
}