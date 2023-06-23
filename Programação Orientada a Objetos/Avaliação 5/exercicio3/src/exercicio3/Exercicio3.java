package exercicio3;

import javax.swing.*;

public class Exercicio3 {
    public static void main(String[] args) {
        try {
            Pessoa albertEinstein = new Pessoa();
            albertEinstein.setNome("Albert Einstein");
            albertEinstein.ajustaDataDeNascimento("14","03","1879");
            albertEinstein.calculaIdade();

            Pessoa isaacNewton = new Pessoa();
            isaacNewton.setNome("Isaac Newton");
            isaacNewton.ajustaDataDeNascimento("04","01","1643");
            isaacNewton.calculaIdade();

            JOptionPane.showMessageDialog(null, "Nome: " + albertEinstein.getNome() + ", " + albertEinstein.getIdade() + " anos" +
                    "\nNome: " + isaacNewton.getNome() + ", " + isaacNewton.getIdade() + " anos", "Informações", 1);
        } catch (Exception NovaExcecao) {
            JOptionPane.showMessageDialog(null, "Digite apenas datas válidas!", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
        }
    }
}