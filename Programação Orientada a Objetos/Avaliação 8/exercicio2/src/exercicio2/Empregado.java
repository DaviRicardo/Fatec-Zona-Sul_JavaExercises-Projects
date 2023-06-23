package exercicio2;

public class Empregado {
    private String nome;
    private String sobrenome;
    private float salarioMensal;

    public Empregado() {
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSobrenome() {
        return this.sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }

    public float getSalarioMensal() {
        return this.salarioMensal;
    }

    public void setSalarioMensal(float salarioMensal) {
        if (salarioMensal < 0) {
            this.salarioMensal = 0;
        } else {
            this.salarioMensal = salarioMensal;
        }
    }
    
    public float calculoSalarioAnual () {
        return (this.getSalarioMensal() * 12);
    }
    
    public float calcSalaAnulAume () {
        return (float) ((this.getSalarioMensal() + (this.getSalarioMensal() * 0.10)) * 12);
    }
}
