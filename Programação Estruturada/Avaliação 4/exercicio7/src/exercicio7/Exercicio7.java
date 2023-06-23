/*7ª) Criar um programa que retorne o fatorial de um número, usando um método que receba um valor e retorne o fatorial desse valor.
Fatorial de 5 = 5 x 4 x 3 x 2 x 1 = 120*/

package exercicio7;

import javax.swing.JOptionPane;

public class Exercicio7 {
    public static int calculoFatorial (int num) {
        int aux = 1;
        for (int i = 1; i <= num; i++) {
            aux = aux * i;
        }
        return aux;
    }
    public static void main (String[] args) {
        try {
            int fatorial = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));

            JOptionPane.showMessageDialog(null, "O fatorial do valor informado é: " + calculoFatorial(fatorial), "Cálculo fatorial", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}