/*1ª) Criar uma Classe chamada Triangulo que contenha como atributos a base e altura de um triângulo. 
Na classe definir um método para leitura da base e altura, um método construtor e um método para Calcular a área do triângulo (Area=Base * Altura)/2.*/

package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {
    public static void main (String[] args) {
        try {
            Triangulo tri = new Triangulo ();
            tri.input();
            JOptionPane.showMessageDialog(null, tri.toString(), "Área do triângulo", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        } 
    }
}