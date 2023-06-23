package exercicio2;
        
import javax.swing.*;

public class Equacao {
    private int a, b, c;
    private double delta, r1, r2;

    public Equacao() {

    }

    private int getA() {
        return this.a;
    }

    private void setA(int a) {
        this.a = a;
    }

    private int getB() {
        return this.b;
    }

    private void setB(int b) {
        this.b = b;
    }

    private int getC() {
        return this.c;
    }

    private void setC(int c) {
        this.c = c;
    }

    private double getDelta() {
        return this.delta;
    }

    private void setDelta(double delta) {
        this.delta = delta;
    }

    private double getR1() {
        return this.r1;
    }

    private void setR1(double r1) {
        this.r1 = r1;
    }

    private double getR2() {
        return this.r2;
    }

    private void setR2(double r2) {
        this.r2 = r2;
    }

    public void input () {
        this.setB(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de B")));
        this.setA(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de A")));
        this.setC(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor de C")));
    }

     public void calcRaiz () {
        this.setDelta(Math.pow(this.getB(), 2) - 4 * this.getA() * this.getC());

        if (this.getDelta() == 0) {
            this.setR1((-1 * this.getB() + Math.sqrt(this.getDelta())) / (2 * this.getA()));
        } else if (this.getDelta() > 0) {
            this.setR1((-1 * this.getB() + Math.sqrt(this.getDelta())) / (2 * this.getA()));
            this.setR2((-1 * this.getB() - Math.sqrt(this.getDelta())) / (2 * this.getA()));
        } else {
            this.setR1(0);
            this.setR2(0);
        }
    }

    public void output () {
        if (this.getDelta() == 0) {
            JOptionPane.showMessageDialog(null, "Raiz 1 / Raiz 2 = " + this.getR1(), "Duaz raízes iguais", 1);
        } else if (this.getDelta() > 0) {
            JOptionPane.showMessageDialog(null, "Raiz 1 = " + this.getR1() + "\nRaiz 2 = " + this.getR2(), "Duas raízes diferentes", 1);
        } else {
            JOptionPane.showMessageDialog(null, "Sem raízes reais...", "Nenhuma raíz", 1);
        }
    }
}
