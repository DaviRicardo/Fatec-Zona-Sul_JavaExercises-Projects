/*6ª) Criar um programa que receba um número que corresponda a um mês do 1º trimestre e escreva o mês correspondente;
caso o usuário digite um número fora do intervalo deverá aparecer inválido, mas utilizando um método do tipo void
Os meses do primeiro trimestre de um ano são: janeiro, fevereiro e março. O primeiro trimestre é composto pelos primeiros três meses do ano civil.*/

package exercicio6;

import javax.swing.JOptionPane;

public class Exercicio6 {
    public static void primTrimMes (int valMes) throws Exception {
        switch (valMes) {
            case 1:
                JOptionPane.showMessageDialog(null, "O mês " + valMes + " corresponde ao mês de Janeiro", "Correspondência encontrada", 1);
                break;
                case 2:
                    JOptionPane.showMessageDialog(null, "O mês " + valMes + " corresponde ao mês de Fevereiro", "Correspondência encontrada", 1);
                    break;
                    case 3:
                        JOptionPane.showMessageDialog(null, "O mês " + valMes + " corresponde ao mês de Março", "Correspondência encontrada", 1);
                        break;
                        default:
                            throw new Exception("Nova_Exceção");
            }
        }

    public static void main (String[] args) {
        try {
            int mes = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite o número de um mês do 1° trimestre"));
            primTrimMes(mes);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Digite apenas números!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        } catch (Exception Nova_Exceção) {
            JOptionPane.showMessageDialog(null, "O número do mês não pode ser menor do que 1 ou maior do que 3!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}