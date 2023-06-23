package exercicio4;

import javax.swing.JOptionPane;

public class Data {
    private int dia, mes, ano;

    public Data() {
        
    }

    public int getDia() {
        return this.dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return this.mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return this.ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void displayData () {
        JOptionPane.showMessageDialog(null, this.getDia() + "/" + this.getMes() + "/" + this.getAno(), "Data no formato dia/mês/ano", 1);
    }
 }
