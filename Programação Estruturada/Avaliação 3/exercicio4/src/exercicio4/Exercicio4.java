/* 4) Um programa que calcule a média de um aluno nos moldes da Fatec Zona Sul.
 Fórmula padrão utilizada pela Fatec Zona Sul:  p1 * 0.35 + p2 * 0.50 + t * 0.15 */

package exercicio4;

import javax.swing.JOptionPane;
import java.math.*;

public class Exercicio4 {
    public static void main(String[] args) {
       try {
           double media;
           String p1 = JOptionPane.showInputDialog(null, "Digite a nota da p1");
           p1 = p1.replace(',','.');
           float valorP1 = Float.parseFloat(p1);
           
           String p2 = JOptionPane.showInputDialog(null, "Digite a nota da p2");
           p2 = p2.replace(',','.');
           float valorP2 = Float.parseFloat(p2);
           
           String t = JOptionPane.showInputDialog(null, "Digite a nota de trabalho");
           t = t.replace(',','.');
           float valorT = Float.parseFloat(t);
           
           media = (valorP1 * 0.35) + (valorP2 * 0.50) + (valorT * 0.15);
           BigDecimal bd = new BigDecimal (media).setScale(1, RoundingMode.HALF_EVEN);
           media = bd.doubleValue();
           JOptionPane.showMessageDialog(null, "A média é: " + media, "Resultado da média", 1);
       } catch (NumberFormatException e) {
           JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
       }
    }
}
