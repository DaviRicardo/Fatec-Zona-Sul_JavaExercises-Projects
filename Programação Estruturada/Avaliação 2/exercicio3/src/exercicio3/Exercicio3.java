/*3º) Um comerciante comprou um produto e quer vendê-lo com um lucro de 45% se o 
valor da compra for menor que R$20,00; caso contrário, o lucro será de 30%. Entrar 
com o valor do produto e imprimir o valor da venda.*/

package exercicio3;

import javax.swing.JOptionPane;
import java.math.*;

public class Exercicio3 {    
   static final float lucroMenor20 = (float) 0.45;
   static final float lucroMaior20 = (float) 0.30;
   static float valorVenda;

    public static void main(String[] args) {   
        try {
            String produto = JOptionPane.showInputDialog("Digite o valor do produto");
            produto = produto.replace(',', '.');
            float valorProduto = Float.parseFloat(produto);   
      
            if (valorProduto != 0) {
                if (valorProduto < 20.00) {
                    valorVenda = valorProduto + (valorProduto * lucroMenor20);
                    BigDecimal bd = new BigDecimal(valorVenda).setScale(2, RoundingMode.HALF_EVEN); // HALF_EVEN é o método padrão de arredondamento usado em Java que é um objeto percentente a classe RoundingMode (especifica o método de arredondamento).
                    valorVenda = bd.floatValue();
                    JOptionPane.showMessageDialog(null, "Valor do produto: " + valorProduto + " + lucro de 45%" + "\nValor final da venda: " + valorVenda, "Valor final", 1);
                } else {
                    valorVenda = valorProduto + (valorProduto * lucroMaior20);
                    BigDecimal bd = new BigDecimal(valorVenda).setScale(2, RoundingMode.HALF_EVEN);
                    valorVenda = bd.floatValue();
                    JOptionPane.showMessageDialog(null, "Valor do produto: " + valorProduto + " + lucro de 30%" + "\nValor final da venda: " + valorVenda, "Valor final", 1);;
                }
            } else {
                throw new Exception ("Nova_Exceção"); // Uma nova exceção pode ser declarada fazendo-se uma chamada à instância da classe Exception.
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        } catch (Exception Nova_Exceção){
            JOptionPane.showMessageDialog(null, "O valor do produto não pode ser igual a 0!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}
