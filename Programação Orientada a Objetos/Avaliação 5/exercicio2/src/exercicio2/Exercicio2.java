package exercicio2;

import javax.swing.*;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            Equacao equa = new Equacao();
            equa.input();
            equa.calcRaiz();
            equa.output();
        } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}