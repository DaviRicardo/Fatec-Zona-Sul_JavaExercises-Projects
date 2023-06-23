package fatec;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Fatec {
    private JFrame janela; 
    private JPanel painelPrincipal; 
    private Label label1, lblr, t3; 
    private TextField t1,t2; 
    
    public static void main (String[] args) {
        new Fatec().montaTela(); 
    }
    
    private void montaTela() {
        preparaJanela();
        preparaPainelPrincipal();
        preparaLabel();
        preparaText();
        preparaBotaoCarregar();
        preparaBotaoSubtrair();
        preparaBotaoDividir();
        preparaBotaoMultiplicar();
        preparaBotaoSair();
        mostraJanela();
    }
    
    private void preparaJanela() {
        janela = new JFrame ("Exemplo"); 
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
    }

    private void mostraJanela () {
       janela.pack(); 
       janela.setSize(600, 300); 
       janela.setVisible(true);
   }
     
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new BoxLayout(painelPrincipal, BoxLayout.PAGE_AXIS));
        janela.add(painelPrincipal);
        
    }
    
    private void preparaLabel() {
        label1 = new Label("Calculando a soma de 2 números");
        painelPrincipal.add(label1);
    }
    
    private void preparaText() {
        t1 = new TextField("");
        t2 = new TextField("");
        lblr = new Label("Resultado = ");
        t3 = new Label (" ");
        painelPrincipal.add(t1);
        painelPrincipal.add(t2);
        painelPrincipal.add(lblr);
        painelPrincipal.add(t3);
    }
    
    private void preparaBotaoCarregar() {
        JButton botaoCarregar = new JButton ("SOMA");
        botaoCarregar.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed (ActionEvent e) {
                int soma = Integer.parseInt(t1.getText()) + Integer.parseInt(t2.getText());
                String r = Integer.toString(soma);
                t3.setText(r);
            }
        });
        painelPrincipal.setLocation(50,100); 
        painelPrincipal.add(botaoCarregar); 
    }
    
    private void preparaBotaoSubtrair() {
        JButton botaoSubtrair = new JButton ("SUBTRAÇÃO");
        botaoSubtrair.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                int subtracao = Integer.parseInt(t1.getText()) - Integer.parseInt(t2.getText());
                String r = Integer.toString(subtracao);
                t3.setText(r);
            }
        });
        painelPrincipal.add(botaoSubtrair);
    }
    
    private void preparaBotaoDividir() {
        JButton botaoDividir = new JButton ("DIVISÃO");
        botaoDividir.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                int divisao = Integer.parseInt(t1.getText()) / Integer.parseInt(t2.getText());
                String r = Integer.toString(divisao);
                t3.setText(r);
            }
        });
        painelPrincipal.add(botaoDividir);
    }
    
    private void preparaBotaoMultiplicar() {
        JButton botaoMultiplicar = new JButton ("MULTIPLICAÇÃO");
        botaoMultiplicar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                int multiplicacao = Integer.parseInt(t1.getText()) * Integer.parseInt(t2.getText());
                String r = Integer.toString(multiplicacao);
                t3.setText(r);
            }
        });
        painelPrincipal.add(botaoMultiplicar);
    }
     
    private void preparaBotaoSair() {
        JButton botaoSair = new JButton ("Sair");
        botaoSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                System.exit(0);
            }
        });
        painelPrincipal.add(botaoSair);
    }
}
