package tarefa7;

public class Tecnico extends Superior {
    
    @Override
    public double calculaMedia() {
        //Média = (N1 + N2*2 + N3*2)/5;
        return (this.getN1() + this.getN2() * 2 + this.getN3() * 2) / 5;
    }
}
