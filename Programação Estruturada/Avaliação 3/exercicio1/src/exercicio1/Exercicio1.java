/* Um programa capaz de imprimir todos os números pares em um intervalo de
números informados pelo usuário;*/

package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main(String[] args) {
        try {
            int inicio = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o início do intervalo"));
            int fim = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o fim do intervalo"));
            
            for (int i = inicio; i <= fim; i++) {
                if (i % 2 == 0) {
                System.out.println(i);
                }
            }
        } catch (NumberFormatException E) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada Inválida!", JOptionPane.WARNING_MESSAGE);
        }
    }    
 }
