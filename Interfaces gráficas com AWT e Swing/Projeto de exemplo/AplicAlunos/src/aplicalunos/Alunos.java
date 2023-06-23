package aplicalunos;

import java.sql.Date;

public class Alunos {
    private int aRA;
    private String aNome;
    private Date aData;

    
    public int getRA() {
        return aRA;
    }
    
    public void setRA(int aRA) {
        this.aRA = aRA;
    }
    
    public String getNome() {
        return aNome;
    }

    public void setNome(String aNome) {
        this.aNome = aNome;
    }
    
    public Date getData() {
        return aData;
    }

    public void setData(Date aData) {
        this.aData = aData;
    }
}
