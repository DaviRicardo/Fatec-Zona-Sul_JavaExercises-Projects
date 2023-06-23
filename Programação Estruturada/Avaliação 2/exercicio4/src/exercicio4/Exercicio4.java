/*4º) Ler a idade de uma pessoa e informar a sua classe eleitoral:
Não-eleitor (abaixo de 16 anos)
Eleitor obrigatório (entre 18 e 65 anos)
Eleitor facultativo (entre 16 e 18 anos e maior de 65 anos*/

package exercicio4;

import javax.swing.JOptionPane;

public class Exercicio4 {
    public static void main(String[] args) {
        try {
            String idade = JOptionPane.showInputDialog(null, "Digite a idade");
            int valorIdade = Integer.parseInt(idade);
            
            if (valorIdade < 16) {
                JOptionPane.showMessageDialog(null , "A classe eleitoral é: Não-eleitor (abaixo de 16 anos)", "Classe Eleitoral", 1);
            } else if (valorIdade >= 18 && valorIdade <= 65) {
                JOptionPane.showMessageDialog(null, "A classe eleitoral é: Eleitor obrigatório (entre 18 e 65 anos)", "Classe Eleitoral", 1);
            } else if ((valorIdade >=  16 && valorIdade <= 18) || valorIdade > 65) {
                JOptionPane.showMessageDialog(null, "A classe eleitoral é: Eleitor Facultativo (entre 16 e 18 e maior de 65 anos)", "Classe Eleitoral", 1);
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}
