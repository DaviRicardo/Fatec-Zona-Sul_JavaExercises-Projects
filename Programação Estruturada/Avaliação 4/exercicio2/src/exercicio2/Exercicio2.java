/*2ª) Criar um programa que receba 4 notas e calcule a média aritmética, através de um 
método.*/

package exercicio2;

import javax.swing.JOptionPane;
import java.math.*;

public class Exercicio2 {
    public static double calcMediArit (float val1, float val2, float val3, float val4) {
        return (val1 + val2 + val3 + val4) / 4;
    }
    
    public static void main(String[] args) {
        try {
            float nota1 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite primeira nota"));
            float nota2 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite segunda nota"));
            float nota3 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite terceira nota"));
            float nota4 = Float.parseFloat(JOptionPane.showInputDialog(null, "Digite quarta nota"));
            
            BigDecimal bd = new BigDecimal(calcMediArit(nota1,nota2,nota3,nota4)).setScale(1, RoundingMode.HALF_EVEN);
            double media = bd.doubleValue();
            JOptionPane.showMessageDialog(null, "A média das 4 notas é: " + media , "Resultado da média aritmética", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida!", JOptionPane.WARNING_MESSAGE);
        }
    }
}
