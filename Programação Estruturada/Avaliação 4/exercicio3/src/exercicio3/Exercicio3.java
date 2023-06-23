//3ª) Criar um programa que receba 2 valores e calcule o produto através de um método que retorna valores

package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static float calculaProduto(float num1, float num2) {
        return num1 * num2;
    }

    public static void main(String[] args) {
        try {
            float val1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            float val2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor"));

            JOptionPane.showMessageDialog(null, "O produto de ambos os valores é: " + calculaProduto (val1, val2), "Produto", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}