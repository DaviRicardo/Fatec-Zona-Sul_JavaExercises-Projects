/*8ª) Criar um programa que verifique se um número é primo ou não, através de um método.
Um número primo é divisível somente por 1 e por ele mesmo.*/

package exercicio8;

import javax.swing.JOptionPane;

public class Exercicio8 {
    public static boolean isPrime (int num) throws Exception {
        if (num <= 1) {
            throw new Exception("Nova_Exceção");
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Se um número não for divisível por nenhum número no intervalo entre 2 e a raíz quadrada dele mesmo, ele é primo.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args) {
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um número primo"));

            if (isPrime(valor)) {
                JOptionPane.showMessageDialog(null, "O número " + valor + " é um número primo!", "Número primo", 1);
            } else {
                JOptionPane.showMessageDialog(null, "O número " + valor + " não é um número primo.", "Não número primo", 1);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        } catch (Exception Nova_Exceção) {
            JOptionPane.showMessageDialog(null, "Números primos não podem ser menores ou iguais a 1!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}
