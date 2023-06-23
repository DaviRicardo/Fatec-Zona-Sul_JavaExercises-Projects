package avaliacao11.model.bean;

public class ItensPedidos {
    private int codItensPed;
    private int codProd;
    private int codPed;
    private float qtde;

    
    public int getCodItensPed() {
        return codItensPed;
    }

    public void setCodItensPed(int codItensPed) {
        this.codItensPed = codItensPed;
    }

    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public int getCodPed() {
        return codPed;
    }

    public void setCodPed(int codPed) {
        this.codPed = codPed;
    }

    public float getQtde() {
        return qtde;
    }

    public void setQtde(float qtde) {
        this.qtde = qtde;
    }
}
