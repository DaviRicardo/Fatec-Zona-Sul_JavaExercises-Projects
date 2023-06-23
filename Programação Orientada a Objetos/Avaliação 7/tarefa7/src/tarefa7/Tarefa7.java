package tarefa7;

import javax.swing.JOptionPane;
import java.math.*;

public class Tarefa7 {
    public static void main(String[] args) {
        try {
            Superior sup = new Superior();
            
            sup.setN1(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da P1")));
            sup.setN2(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota da P2")));
            sup.setN3(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota de trabalho")));

            BigDecimal bd = new BigDecimal(sup.calculaMedia()).setScale(1, RoundingMode.HALF_EVEN);
            double mediaSup = bd.doubleValue();
            JOptionPane.showMessageDialog(null, "A média é: " + mediaSup, "Média do nível superior", 1);

            Tecnico tec = new Tecnico();

            tec.setN1(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do 1° Trimestre")));
            tec.setN2(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do 2° Trimestre")));
            tec.setN3(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a nota do 3° Trimestre")));
            
            BigDecimal bd2 = new BigDecimal(tec.calculaMedia()).setScale(1, RoundingMode.HALF_EVEN);
            double mediaTec = bd2.doubleValue();
            JOptionPane.showMessageDialog(null, "A média é: " + mediaTec, "Média do nível técnico", 1);      
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}