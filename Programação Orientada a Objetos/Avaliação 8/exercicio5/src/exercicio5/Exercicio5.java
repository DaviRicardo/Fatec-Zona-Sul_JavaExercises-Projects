package exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        Cocker cockerTeste = new Cocker();
        cockerTeste.setTosa(true);
        
        if (cockerTeste.precisaTosa()) {
            JOptionPane.showMessageDialog(null, "Precisa de tosa", "Tosa necessária", 1);     
        } else {
            JOptionPane.showMessageDialog(null, "Não precisa de tosa", "Tosa não necessária", 1);
        }
        
        cockerTeste.setTipo(JOptionPane.showInputDialog(null, "Digite o tipo"));
        cockerTeste.setNome(JOptionPane.showInputDialog(null, "Digite o nome"));
        cockerTeste.setRaca(JOptionPane.showInputDialog(null, "Digite a raça"));
        cockerTeste.setCor(JOptionPane.showInputDialog(null, "Digite a cor"));

        
        JOptionPane.showMessageDialog(null, cockerTeste.toString(), "Informações do animal", 1);
    }
}
