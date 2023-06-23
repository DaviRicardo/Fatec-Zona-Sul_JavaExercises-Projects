package tarefa7;

public class Superior {
    private float n1, n2, n3;
    
    
    public Superior () {
        
    }

    public float getN1() {
        return this.n1;
    }

    public void setN1(float n1) {
        this.n1 = n1;
    }

    public float getN2() {
        return this.n2;
    }

    public void setN2(float n2) {
        this.n2 = n2;
    }

    public float getN3() {
        return this.n3;
    }

    public void setN3(float n3) {
        this.n3 = n3;
    }
    
    public double calculaMedia() {
        // Média = (N1*0,35 + N2*0,5 + N3*0,15)
        return (this.getN1() * 0.35 + this.getN2() * 0.5 + this.getN3() * 0.15);
    }
}
