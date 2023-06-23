package exercicio1;

import javax.swing.JOptionPane;

public class Triangulo {
    private float base, altura;

    
    public Triangulo () {
	this.base = 0;
	this.altura = 0; 
    }

    private float getBase () {
	return this.base;
    }

    private void setBase (float base) {
	this.base = base;
    }

    private float getAltura () {
	return this.altura;
    }

    private void setAltura (float altura) {
	this.altura = altura;
    }
    
    // Método de leitura da base e altura
    public void input () {
        this.setBase (Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da base")));
        this.setAltura (Float.parseFloat(JOptionPane.showInputDialog("Digite o valor da altura")));
    }
    
    public float calcArea () {
	return (this.getBase() * this.getAltura()) / 2;
    }
 
    @Override
    public String toString() {
        return "base = " + this.getBase() + ", altura = " + this.getAltura() + ", área = " + this.calcArea();
    }
}

