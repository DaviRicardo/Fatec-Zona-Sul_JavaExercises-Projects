//1º) Ler um valor e informar se ele é ou não múltiplo de 3.

package exercicio1;

import javax.swing.JOptionPane;

public class Exercicio1 {

    public static void main(String[] args) { // O modificador static diz respeito a um atributo ou um método que só poder ser usado ou acionado uma vez dentro do código; ele ser único e não ter outro igual.
        try {
            String valor = JOptionPane.showInputDialog (null, "Digite um valor");
            int valorInt = Integer.parseInt(valor);
     
            if (valorInt % 3 == 0) {
                JOptionPane.showMessageDialog(null, "O número " + valorInt + " é múltiplo de 3!", "Múltiplo de 3",1);
            } else {
                JOptionPane.showMessageDialog(null, "O número " + valorInt + " não é múltiplo de 3!", "Não múltiplo de 3", JOptionPane.WARNING_MESSAGE);
            }
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "O valor precisa ser um número!", "Erro", JOptionPane.WARNING_MESSAGE);
        }
    }
}
