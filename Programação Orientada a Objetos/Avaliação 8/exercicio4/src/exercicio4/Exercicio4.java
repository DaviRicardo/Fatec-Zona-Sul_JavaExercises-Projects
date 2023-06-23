package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
           Data dataTeste = new Data();
        
           dataTeste.setDia(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o dia")));
           dataTeste.setMes(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o mês")));
           dataTeste.setAno(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o ano")));
        
           dataTeste.displayData();
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números", "Entrada inválida", 1);
        }
    }
}
