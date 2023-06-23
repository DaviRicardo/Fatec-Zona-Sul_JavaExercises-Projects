package exercicio5;

public class Animal {
    private String tipo, cor;

    public Animal() {
        
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCor() {
        return this.cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Animal{" + "tipo=" + this.getTipo() + ", cor=" + this.getCor() + '}';
    }
}
