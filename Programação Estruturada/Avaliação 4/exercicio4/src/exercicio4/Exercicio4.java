/*4ª) Criar um programa que receba um grau e o converta para radianos através de ummétodo.
Fórmula: radiano = grau * pi / 180*/

package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static final float pi = 3.14f;

    public static float converterRadiano (int anguloGrau) {
        return (anguloGrau * pi) / 180;
    }

    public static void main(String[] args) {
        try {
            int grau = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o valor  do grau"));

            JOptionPane.showMessageDialog(null, "Conversão do ângulo em radiano: " + converterRadiano(grau), "Grau em Radiano", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}