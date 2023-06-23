/* 2) Elabore um frame que simule o teclado de um telefone digital, de acordo com a 
Figura. A cada tecla pressionada o número é acumulado na caixa de texto. O botão 
Limpar apaga todos os números digitados.*/

package exercicio2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Exercicio2 {
    private JFrame janela;
    private JPanel painelPrincipal;
    private Label label1;
    private String text;
    
    public static void main(String[] args) {
        new Exercicio2().montaTela();    
    }   
    
    private void montaTela() {
        preparaJanela();
        mostraJanela();
        preparaPainelPrincipal();
        preparaBotao1();
        preparaBotao2();
        preparaBotao3();
        preparaBotao4();
        preparaBotao5();
        preparaBotao6();
        preparaBotao7();
        preparaBotao8();
        preparaBotao9();
        preparaBotaoAste();
        preparaBotao0();
        preparaBotaoCerquilha();
        preparaBotaoLimpar();
        preparaText();
    }
    
    private void preparaJanela() {
        janela = new JFrame ("Telefone digital");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    
    private void mostraJanela() {
        janela.pack(); // Serve para organizar os componentes do Frame para que eles ocupem o menor espaço possível
        janela.setSize(200, 280);
        janela.setVisible(true);
    }
    
    private void preparaPainelPrincipal() {
        painelPrincipal = new JPanel();
        painelPrincipal.setLayout(new FlowLayout (1, 10,10));
        janela.setContentPane(painelPrincipal);
    }
    
    private void preparaBotao1 () {
        JButton botao1 = new JButton ("1");
        botao1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "1";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao1);
    }
    
    private void preparaBotao2 () {
        JButton botao2 = new JButton ("2");
        botao2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "2";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao2);
    }
        
    private void preparaBotao3 () {
        JButton botao3 = new JButton ("3");
        botao3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "3";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao3);
    }
    
    private void preparaBotao4 () {
        JButton botao4 = new JButton ("4");
        botao4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "4";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao4);
    }
                
    private void preparaBotao5 () {
        JButton botao5 = new JButton ("5");
        botao5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "5";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao5);
    }
                    
    private void preparaBotao6 () {
        JButton botao6 = new JButton ("6");
        botao6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "6";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao6);
    }
    
    private void preparaBotao7 () {
        JButton botao7 = new JButton ("7");
        botao7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "7";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao7);
    }
    
    private void preparaBotao8 () {
        JButton botao8 = new JButton ("8");
        botao8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "8";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao8);
    }
    
    private void preparaBotao9 () {
        JButton botao9 = new JButton ("9");
        botao9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "9";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao9);
    }
        
    private void preparaBotaoAste () {
        JButton botaoAste = new JButton ("*");
        botaoAste.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "*";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botaoAste);
    }
            
    private void preparaBotao0 () {
        JButton botao0 = new JButton ("0");
        botao0.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "0";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botao0);
    }
                
    private void preparaBotaoCerquilha () {
        JButton botaoCerquilha = new JButton ("#");
        botaoCerquilha.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = text + "#";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botaoCerquilha);
    }
    
    private void preparaBotaoLimpar () {
        JButton botaoLimpar = new JButton ("Limpar");
        botaoLimpar.setPreferredSize(new Dimension(155,30));
        botaoLimpar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed (ActionEvent e) {
                text = " ";
                label1.setText(text);
            }
        });
        painelPrincipal.add(botaoLimpar);
    }
    
    private void preparaText () {
        label1 = new Label();
        painelPrincipal.add(label1);
        
    }
}
