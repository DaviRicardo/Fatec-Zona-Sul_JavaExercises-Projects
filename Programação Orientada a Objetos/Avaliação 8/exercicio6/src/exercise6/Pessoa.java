package exercise6;

public class Pessoa {
    private String nome, sexo;
    private int idade;
    private float altura;

    public Pessoa() {
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "nome = " + nome + ", sexo = " + sexo + ", idade = " + idade + ", altura = " + altura + '}';
    }
}
