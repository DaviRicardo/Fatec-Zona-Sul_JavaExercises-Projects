/* 3) Criar um frame contendo uma caixa de texto onde o usuário digita um valor 
numérico qualquer referente à venda. Calcular o ICMS, que corresponde a 18% 
do valor da venda e o IPI, correspondente a 5%. Em outra caixa exibir o Valor 
Total, que é a soma de todos os valores, isto é, Valor da Venda + ICMS + IPI */

package exercicio3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Exercicio3 {
    private JFrame frame;
    private JPanel painel;
    private TextField t1;
    private Label lb1, lb2, lb3, lb4, lb5, lb6, lb7;
    
    public static void main(String[] args) {
        new Exercicio3().montaTela();
    }
    
    private void montaTela() {
        prepararFrame();
        mostrarFrame();
        prepararPainelPrincipal();
        prepararTexto();
        prepararBotaoCalcular();
        prepararBotaoLimpar();
    }
    
    private void prepararFrame(){
        frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    private void mostrarFrame() {
        frame.pack();
        frame.setSize(200, 280);
        frame.setVisible(true);
    }
    
    private void prepararPainelPrincipal () {
        painel = new JPanel();
        painel.setLayout(new GridLayout(5, 2));
        frame.setContentPane(painel);
    }
    
    private void prepararTexto() {
        t1 = new TextField("");
        lb1 = new Label ("Valor a Venda:");
        lb2 = new Label ("ICMS(18%):");
        lb3 = new Label ("IPI (5%):");
        lb4 = new Label ("Valor Total:");
        lb5 = new Label (" ");
        lb6 = new Label (" ");
        lb7 = new Label (" ");
        
        painel.add(lb1);
        painel.add(t1);
        painel.add(lb2);
        painel.add(lb5);
        painel.add(lb3);
        painel.add(lb6);
        painel.add(lb4);
        painel.add(lb7); 
    }
    
    private void prepararBotaoCalcular() {
        JButton botaoCalcular = new JButton ("Calcular");
        botaoCalcular.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                double icms = Double.parseDouble(t1.getText()) * 0.18;
                double ipi = Double.parseDouble(t1.getText()) * 0.05;
                double valorTotal = Double.parseDouble(t1.getText()) + icms + ipi;
                String icmsString = Double.toString(icms);
                String ipiString = Double.toString(ipi);
                String valorTotalString = Double.toString(valorTotal);
                lb5.setText(icmsString);
                lb6.setText(ipiString);
                lb7.setText(valorTotalString);
            }
        });
        painel.add(botaoCalcular);
    }
    
    private void prepararBotaoLimpar() {
        JButton botaoLimpar = new JButton ("Limpar");
        botaoLimpar.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed (ActionEvent e) {
                t1.setText(" ");
                lb5.setText(" ");
                lb6.setText(" ");
                lb7.setText(" ");
            }
        });
        painel.add(botaoLimpar);
    }
}
