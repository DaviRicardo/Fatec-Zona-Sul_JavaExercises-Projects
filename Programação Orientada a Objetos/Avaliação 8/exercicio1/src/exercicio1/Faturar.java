package exercicio1;

public class Faturar {
    private int numItem;
    private int quantidadeCompraItem;
    private String descricaoItem;
    private double precoUnitarioItem;

    public Faturar() {
        
    }

    public int getNumItem() {
        return this.numItem;
    }

    public void setNumItem(int numItem) {
        this.numItem = numItem;
    }

    public int getQuantidadeCompraItem() {
        return this.quantidadeCompraItem;
    }

    public void setQuantidadeCompraItem(int quantidadeCompraItem) {
        if (quantidadeCompraItem < 0) {
            this.quantidadeCompraItem = 0;
        } else {
            this.quantidadeCompraItem = quantidadeCompraItem;
        }
    }

    public String getDescricaoItem() {
        return this.descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public double getPrecoUnitarioItem() {
        return this.precoUnitarioItem;
    }

    public void setPrecoUnitarioItem(double precoUnitarioItem) {
        if (precoUnitarioItem < 0) {
            this.precoUnitarioItem = 0;
        } else {
            this.precoUnitarioItem = precoUnitarioItem;
        }
    }
    
    public double getFaturarTotal () {  
        return (this.getQuantidadeCompraItem() * this.getPrecoUnitarioItem());   
    }

    @Override
    public String toString() {
        return "Faturar{" + "numItem = " + this.getNumItem() + ", quantidadeCompraItem = " + this.getQuantidadeCompraItem() 
                + ", descricaoItem = " + this.getDescricaoItem() + ", precoUnitarioItem = " + this.getPrecoUnitarioItem() 
                + ", fatura = " + this.getFaturarTotal() + '}';
    }
}
