package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
       try {
           Faturar fatura = new Faturar();
           fatura.setNumItem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número do item")));
           fatura.setDescricaoItem(JOptionPane.showInputDialog(null, "Digite a descrição do item"));
           fatura.setQuantidadeCompraItem(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a quantidade do item")));
           fatura.setPrecoUnitarioItem(Double.parseDouble(JOptionPane.showInputDialog(null, "Digite o preço unitário do item")));
           
           JOptionPane.showMessageDialog(null, fatura.toString(), "Fatura do item", 1);
          
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
       }
    }  
}
