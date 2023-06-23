/*5º) Depois da liberação do governo para as mensalidades dos planos de saúde, as 
pessoas começaram a fazer pesquisas para descobrir um bom plano, não muito caro. 
Um vendedor de um plano de saúde apresentou a tabela a seguir. Criar um programa 
que entre com o nome e a idade de uma pessoa e mostre o valor que ela deverá pagar.
Até 10 anos – R$ 30,00
Acima de 10 até 29 anos – R$ 60,00
Acima de 29 até 45 anos – R$ 120,00
Acima de 45 até 59 anos – R$ 150,00
Acima de 59 até 65 anos – R$ 250,00
Maior que 65 anos – R$ 400,00 */

package exercicio5;

import javax.swing.JOptionPane;

public class Exercicio5 {
    public static void main(String[] args) {
        try {
            String nome = JOptionPane.showInputDialog(null, "Digite o nome");
            String idade = JOptionPane.showInputDialog(null, "Digite a idade");
            int valorIdade = Integer.parseInt(idade);
           
            if (valorIdade <= 10) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$30,00 para idades até 10 anos." );
            } else if (valorIdade > 10 && valorIdade <= 29) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$60,00 para idades acima de 10 até 29 anos.");
            } else if (valorIdade > 29 && valorIdade <= 45 ) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$120,00 para idades acima de 29 até 45 anos.");
            } else if (valorIdade > 45 && valorIdade <= 59) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$150,00 para idades acima de 45 até 59 anos.");
            } else if (valorIdade > 59 && valorIdade <= 65) {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$250,00 para idades acima de 59 até 65 anos.");
            } else {
                JOptionPane.showMessageDialog(null, "Nome: " + nome + "\nIdade: " + valorIdade +  "\nO valor a ser pago é de R$400,00 para idades acima de 65 anos.");
            } 
        } catch (NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }  
  }
