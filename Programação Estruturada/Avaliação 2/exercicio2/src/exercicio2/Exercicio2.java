// 2º) Ler três números e mostrá-los em ordem crescente.

package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {

    public static void main(String[] args) {
        try {
            String num1 = JOptionPane.showInputDialog("Digite o 1° número");
            int num1Int = Integer.parseInt(num1);
            String num2 = JOptionPane.showInputDialog("Digite o 2° número");
            int num2Int = Integer.parseInt(num2);
            String num3 = JOptionPane.showInputDialog("Digite o 3° número");  
            int num3Int = Integer.parseInt(num3);
       
            //Situação em que o primeiro valor é maior do que todos os outros
            if (num1Int > num2Int && num1Int > num3Int) {
                if (num2Int > num3Int) {
                    JOptionPane.showMessageDialog(null, num3Int + "\n" + num2Int + "\n" + num1Int, "Valores em ordem crescente", 1);
                } else {
                    JOptionPane.showMessageDialog(null, num2Int + "\n" + num3Int + "\n" + num1Int, "Valores em ordem crescente", 1);
                }
            //Situação em que o segundo valor é maior do que todos os outros
            } else if (num2Int > num1Int && num2Int > num3Int) {
                    if (num1Int > num3Int) {
                    JOptionPane.showMessageDialog(null, num3Int + "\n" + num1Int + "\n" + num2Int, "Valores em ordem crescente", 1);
                } else {
                    JOptionPane.showMessageDialog(null, num1Int + "\n" + num3Int + "\n" + num2Int, "Valores em ordem crescente", 1);
                }
            //Situação em que o terceiro valor é maior do que todos os outros
            } else if (num3Int > num2Int && num3Int > num1Int) {
                if (num2Int > num1Int) {
                    JOptionPane.showMessageDialog(null, num1Int + "\n" + num2Int + "\n" + num3Int, "Valores em ordem crescente", 1);
                } else {
                    JOptionPane.showMessageDialog(null, num2Int + "\n" + num1Int + "\n" + num3Int, "Valores em ordem crescente", 1);
                }
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Input inválido", JOptionPane.WARNING_MESSAGE);
        }
    }     
 }
