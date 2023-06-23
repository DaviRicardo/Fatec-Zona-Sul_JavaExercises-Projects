package avaliacao11.model.bean;

import java.sql.Date;

public class Produtos {
    private int codProd;
    private String descricao;
    private float preco;
    private String unidade;
    private float qtdeInicial;
    private Date dataCad;
    private float qtdeAtual;

    
    public int getCodProd() {
        return codProd;
    }

    public void setCodProd(int codProd) {
        this.codProd = codProd;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getQtdeInicial() {
        return qtdeInicial;
    }

    public void setQtdeInicial(float qtdeInicial) {
        this.qtdeInicial = qtdeInicial;
    }

    public Date getDataCad() {
        return dataCad;
    }

    public void setDataCad(Date dataCad) {
        this.dataCad = dataCad;
    }

    public float getQtdeAtual() {
        return qtdeAtual;
    }

    public void setQtdeAtual(float qtdeAtual) {
        this.qtdeAtual = qtdeAtual;
    }
}
