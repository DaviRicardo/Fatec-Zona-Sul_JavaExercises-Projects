/*1ª) Criar um programa que permita a entrada de um número inteiro e retorne o seu dobro, 
através de um método.*/

package exercicio1;

import javax.swing.JOptionPane;

public class exercicio1 {
    public static int calculaDobro (int num) {
        return (num * 2);
    }
    
    public static void main(String[] args) {
        try {
            int valor = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite um valor"));
            JOptionPane.showMessageDialog(null, "O dobro de " + valor + " é igual a: " + calculaDobro(valor), "Valor dobrado", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inváida", JOptionPane.WARNING_MESSAGE);
        }
    }
}

