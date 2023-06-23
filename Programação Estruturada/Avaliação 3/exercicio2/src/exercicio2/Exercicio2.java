/* Um programa que imprima até o “n” termo a seqüência de Fibonacci. Série: 
1,1,2,3,5,8,13,21....... */

package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor de n"));
            int[] vet = new int[n];
            
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    vet[0] = 1;
                } else {
                    vet[i] = i;
                }
                if (i > 3) {
                    vet[i] = vet[i - 2] + vet[i - 1];
                }
            }
            for (int vetFibonacci : vet) {
                System.out.println(vetFibonacci);
            }  
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    } 
}
