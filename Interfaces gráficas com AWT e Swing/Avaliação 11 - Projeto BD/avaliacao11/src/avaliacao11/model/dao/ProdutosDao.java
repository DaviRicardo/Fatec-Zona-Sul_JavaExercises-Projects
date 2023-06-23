package avaliacao11.model.dao;

import java.sql.*;
import avaliacao11.model.bean.Produtos;
import avaliacao11.util.ConexaoBd;

public class ProdutosDao {
    public Produtos produto;
    public final Connection c;
    private PreparedStatement stmt;
    private String msg, sql;
    private int numero;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ProdutosDao() {
        this.c = ConexaoBd.getConexaoMySQL();
        this.produto = new Produtos();
    }
    
    public boolean localizar () {
        sql = "select * from produtos where codProd = ?";
        
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, produto.getCodProd());
            ResultSet rs = stmt.executeQuery();
            rs.next(); // Verifica se há pelo menos uma linha de resultado retornado pela consulta SQL
            produto.setCodProd(rs.getInt(1));
            produto.setDescricao(rs.getString(2));
            produto.setPreco(rs.getFloat(3));
            produto.setUnidade(rs.getString(4));
            produto.setQtdeInicial(rs.getFloat(5));
            produto.setDataCad(rs.getDate(6));
            produto.setQtdeAtual(rs.getFloat(7));
            return true;
        } catch (SQLException error) {
            return false;
        }
    }
    
    public String atualizar (int operacao) {
        msg = "Operação realizada com sucesso !!!";
        
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into produtos (descricao, preco, unidade, qtdeInicial, dataCad, qtdeAtual) values (?, ?, ?, ?, ?, ?)";
                stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, produto.getDescricao());
                stmt.setFloat(2, produto.getPreco());
                stmt.setString(3, produto.getUnidade());
                stmt.setFloat(4, produto.getQtdeInicial());
                stmt.setDate(5, produto.getDataCad());
                stmt.setFloat(6, produto.getQtdeAtual());
                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                produto.setCodProd(rs.getInt(1));
                stmt.close();
            } else if (operacao == ALTERACAO) {
                sql = "update produtos set descricao = ?, preco = ?, unidade = ?, qtdeInicial = ?, dataCad = ?, qtdeAtual = ? where codProd = ?";
                stmt = c.prepareStatement(sql);
                stmt.setString(1, produto.getDescricao());
                stmt.setFloat(2, produto.getPreco());
                stmt.setString(3, produto.getUnidade());
                stmt.setFloat(4, produto.getQtdeInicial());
                stmt.setDate(5, produto.getDataCad());
                stmt.setFloat(6, produto.getQtdeAtual());
                stmt.setInt(7, produto.getCodProd());
                stmt.execute();
                stmt.close();
            } else if (operacao == EXCLUSAO) {
                sql = "delete from produtos where codProd = ?";
                stmt = c.prepareStatement(sql);
                stmt.setInt(1, produto.getCodProd());
                stmt.execute();
                stmt.close();
            }
            c.close(); 
        } catch (SQLException error) {
            numero = error.getErrorCode();
            if (numero == 1062) {
                msg = "Este ID já existe!";
            } else {
                msg = "Falha na operação '" + error.toString() + "'";
            }
        }
        return msg;
    }
    
}
