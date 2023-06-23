package exercicio5;

public class Cocker extends Cachorro {
    private boolean tosa;

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }
    
    public boolean precisaTosa () {
        if (this.tosa) {
            return true;
        } else {
            return false;
        }
    }   
}
