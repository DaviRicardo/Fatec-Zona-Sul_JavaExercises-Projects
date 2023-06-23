package exercise6;

import javax.swing.JOptionPane;

public class Exercise6 {
    public static void main(String[] args) {
        Empregado empregadoTeste = new Empregado ();
        
        empregadoTeste.setNome(JOptionPane.showInputDialog(null, "Digite o nome"));
        empregadoTeste.setSexo(JOptionPane.showInputDialog(null, "Digite o sexo"));
        empregadoTeste.setIdade(Integer.parseInt(JOptionPane.showInputDialog(null, "Digite a idade")));
        empregadoTeste.setAltura(Float.parseFloat(JOptionPane.showInputDialog(null, "Digite o altura")));
        empregadoTeste.setSalario(Float.parseFloat(JOptionPane.showInputDialog("Digite o salário")));
        
        
        JOptionPane.showMessageDialog(null, empregadoTeste.toString(), "Informações do empregado", 1);
        
        
        
    }
}
