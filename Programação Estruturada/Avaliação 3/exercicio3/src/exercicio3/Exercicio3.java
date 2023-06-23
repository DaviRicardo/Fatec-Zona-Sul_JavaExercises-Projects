/* Um programa capaz de imprimir todos os números primos em um intervalo de números informados pelo usuário */

package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static boolean isPrime (int num) {
        if (num <= 1) {
           return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Se um número não for divisível por nenhum número no intervalo entre 2 e a raíz quadrada dele mesmo, ele é primo.
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void main(String[] args) {
        try { 
            int inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o início do intervalo"));
            int fim = Integer.parseInt(JOptionPane.showInputDialog("Digite o fim do intervalo"));
            
            if (inicio <= 1) {
                throw new Exception("Nova_Exceção");
            }
            for (int i = inicio; i <= fim; i++) {
                if (isPrime(i)) {
                    System.out.println(i);
                } 
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        } catch (Exception Nova_Exceção){
            JOptionPane.showMessageDialog(null, "Números primos não podem ser menores ou iguais a 1!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }   
}
