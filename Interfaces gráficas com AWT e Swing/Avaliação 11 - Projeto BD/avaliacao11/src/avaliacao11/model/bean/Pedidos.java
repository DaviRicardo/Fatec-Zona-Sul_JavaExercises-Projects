package avaliacao11.model.bean;

import java.sql.Date;

public class Pedidos {
    private int codPed;
    private int codCliente;
    private Date data;

    
    public int getCodPed() {
        return codPed;
    }

    public void setCodPed(int codPed) {
        this.codPed = codPed;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }
}
