package exercicio5;

public class Cachorro extends Animal {
    private String nome, raca;

    public Cachorro() {
        
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRaca() {
        return this.raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Cachorro{" + "tipo = " + this.getTipo() + ", nome = " + this.getNome() + ", raça = " + this.getRaca() 
                + ", cor = " + this.getCor() + '}';
    }
}
