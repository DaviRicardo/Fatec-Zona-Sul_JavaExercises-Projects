package exercicio2;

import javax.swing.JOptionPane;

public class Exercicio2 {
    public static void main(String[] args) {
        try {
            Empregado emp1 = new Empregado ();
            emp1.setNome(JOptionPane.showInputDialog("Digite o nome"));
            emp1.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome"));
            emp1.setSalarioMensal(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário anual")));
            
            // Exibição das informações do empregado com salário anual
            JOptionPane.showMessageDialog(null, "Nome: " + emp1.getNome() + " " + emp1.getSobrenome() 
                    + "\nSalário anual: " + emp1.calculoSalarioAnual(), "Informações do primeiro empregado", 1);
            
            // Exibição do salário anual do empregado com aumento de 10%
            JOptionPane.showMessageDialog(null, "Salário anual: " + emp1.calcSalaAnulAume(), "Salário anual com aumento de 10%", 1);
            
            Empregado emp2 = new Empregado ();
            emp2.setNome(JOptionPane.showInputDialog("Digite o nome"));
            emp2.setSobrenome(JOptionPane.showInputDialog("Digite o sobrenome"));
            emp2.setSalarioMensal(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o salário anual")));
            
            // Exibição das informações do empregado com salário anual
            JOptionPane.showMessageDialog(null, "Nome: " + emp2.getNome() + " " + emp2.getSobrenome() 
                    + "\nSalário anual: " + emp2.calculoSalarioAnual(), "Informações do segundo empregado", 1);
            
            // Exibição do salário anual do empregado com aumento de 10%
            JOptionPane.showMessageDialog(null, "Salário anual: " + emp2.calcSalaAnulAume(), "Salário anual com aumento de 10%", 1);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida!", JOptionPane.WARNING_MESSAGE);
        } 
    }
}
