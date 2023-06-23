package exercise6;

public class Empregado extends Pessoa {
    private float salario;

    public Empregado() {
        
    }

    public float getSalario() {
        return this.salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" + "nome = " + this.getNome() + ", sexo = " + this.getSexo() + ", idade = " 
                + this.getIdade() + ", altura = " +  this.getAltura() + ", salario = " + this.getSalario() + "}";
    } 
}
