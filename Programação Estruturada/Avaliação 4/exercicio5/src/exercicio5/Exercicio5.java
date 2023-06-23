//5ª) Criar um programa que mostre qual o maior valor entre dois números, utilizando um método do tipo void (que não retorna valores).

package exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void maiorValor (float num1, float num2) {
        if (num1 > num2) {
            JOptionPane.showMessageDialog(null, "O maior valor é: " + num1, "Maior valor", 1);
        } else {
            JOptionPane.showMessageDialog(null, "O maior valor é: " + num2, "Maior valor", 1);
        }
    }

    public static void main(String[] args) {
        try {
            float val1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o primeiro valor"));
            float val2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o segundo valor"));

            maiorValor(val1, val2);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}