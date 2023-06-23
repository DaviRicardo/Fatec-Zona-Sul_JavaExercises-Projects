package exercicio3;

import javax.swing.JOptionPane;

public class Calculadora {
    private double numero1, numero2;
    private char operacao;

    public Calculadora(double numero1, double numero2, char operacao) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.operacao = operacao;
    }

    private double getNumero1() {
        return this.numero1;
    }

    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }

    private double getNumero2() {
        return this.numero2;
    }

    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }

    private char getOperacao() {
        return this.operacao;
    }

    public void setOperacao(char operacao) {
        this.operacao = operacao;
    }

    public double soma () {
        return this.getNumero1() + this.getNumero2();
    }
    
    public double subtracao () {
        return this.getNumero1() - this.getNumero2();
    }
    
    public double multiplicacao () {
        return this.getNumero1() * this.getNumero2();
    }
    
    public double divisao () {
        if (this.getNumero2() == 0) {
           JOptionPane.showMessageDialog(null, "Não é possível a divisão por 0", "Entrada inválida", JOptionPane.WARNING_MESSAGE);
           return 0;
        } else {
            return this.getNumero1() / this.getNumero2();
        }
    }
    
    public void localizarOperacao () {
        switch (this.getOperacao()) {
            case '+':
                JOptionPane.showMessageDialog(null, "O resultado da soma é: " + this.soma(), "Soma", 1);
                break;
            case '-':
                JOptionPane.showMessageDialog(null, "O resultado da substração é: " + this.subtracao(), "Subtração", 1);
                break;
            case '*':
                JOptionPane.showMessageDialog(null, "O resultado da multiplicação é: " + this.multiplicacao(), "Multiplicação", 1);
                break;
            case '/':
                JOptionPane.showMessageDialog(null, "O resultado da divisão é: " + this.divisao(), "Divisão", 1);
                break;
        }
    }
}
