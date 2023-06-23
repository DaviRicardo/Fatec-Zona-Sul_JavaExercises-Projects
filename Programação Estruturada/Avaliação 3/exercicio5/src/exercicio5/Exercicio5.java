 /* Criar um programa que leia um número que será o limite superior de um intervalo e 
o incremento. Exibir todos os números naturais no intervalo de 0 até esse número. 
Suponha que os dois números lidos são maiores que zero. Exemplo:
Limite superior: 20
Incremento: 5
Saída: 0 5 10 15 20*/ 

package exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        try {
            int limiteSuperior = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o limite superior"));
            int incremento = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o incremento"));
            
            for (int i = 0; i <= limiteSuperior; i += incremento) {
                System.out.println(i);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada Inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}
