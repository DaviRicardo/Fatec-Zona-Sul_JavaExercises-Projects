package exercicio3;

import javax.swing.JOptionPane;

public class Exercicio3 {
    public static void main(String[] args) {
        try {
            Calculadora calc = new Calculadora (10, 10, '+');   
            calc.localizarOperacao();
            
        } catch (java.lang.RuntimeException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números", "Entrada inválida!", JOptionPane.WARNING_MESSAGE);
        } 
    }
}
