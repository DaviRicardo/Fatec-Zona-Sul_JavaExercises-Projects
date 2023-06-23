package avaliacao11.model.dao;

import java.sql.*;
import avaliacao11.model.bean.Pedidos;
import avaliacao11.model.bean.Produtos;
import avaliacao11.model.bean.ItensPedidos;
import avaliacao11.util.ConexaoBd;


public class ItensPedidosDao {
    public Produtos produto;
    public Pedidos pedido;
    public ItensPedidos itensped;
    public final Connection c;
    private PreparedStatement stmt;
    private String msg, sql;
    private int numero;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ItensPedidosDao() throws SQLException, ClassNotFoundException {
        this.c = ConexaoBd.getConexaoMySQL();
        this.produto = new Produtos();
        this.pedido = new Pedidos();
        this.itensped = new ItensPedidos();
    }
    
    public boolean localizar () {
        sql = """
              select * from itensped 
              inner join produtos on produtos.codProd = itensped.Produtos_codProd 
              inner join pedidos on pedidos.codPed = itensped.Pedidos_codPed 
              where codItensPed = ?;
              """;
  
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, itensped.getCodItensPed());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            itensped.setCodItensPed(rs.getInt(1));
            itensped.setCodProd(rs.getInt(2));
            itensped.setCodPed(rs.getInt(3));
            itensped.setQtde(rs.getFloat(4));
            produto.setCodProd(rs.getInt(5));
            produto.setDescricao(rs.getString(6));
            produto.setPreco(rs.getFloat(7));
            produto.setUnidade(rs.getString(8));
            produto.setQtdeInicial(rs.getFloat(9));
            produto.setDataCad(rs.getDate(10));
            produto.setQtdeAtual(rs.getFloat(11));
            pedido.setCodPed(rs.getInt(12));
            pedido.setCodCliente(rs.getInt(13));
            pedido.setData(rs.getDate(14));
            stmt.close();
            return true;
        } catch (SQLException error) {
            return false;
        }  
    }
    
    public String atualizar (int operacao) {
        msg = "Operação realizada com sucesso!!!";
        
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into itensped (Produtos_codProd, Pedidos_codPed, qtde) values (?, ?, ?)";
                stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                
                stmt.setInt(1, itensped.getCodProd());
                stmt.setInt(2, itensped.getCodPed());
                stmt.setFloat(3, itensped.getQtde());
                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                itensped.setCodItensPed(rs.getInt(1));
                stmt.close();
            } else if (operacao == ALTERACAO) {
                sql = "update itensped set Produtos_codProd = ?, Pedidos_codPed = ?, qtde = ? where codItensPed = ?";
                stmt = c.prepareStatement(sql);
                stmt.setInt(1, itensped.getCodProd());
                stmt.setInt(2, itensped.getCodPed());
                stmt.setFloat(3, itensped.getQtde());
                stmt.setInt(4, itensped.getCodItensPed());
                stmt.execute();
                stmt.close();
            } else if (operacao == EXCLUSAO) {
                sql = "delete from itensped where codItensPed = ?";
                stmt = c.prepareStatement(sql);
                stmt.setInt(1, itensped.getCodItensPed());
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
    