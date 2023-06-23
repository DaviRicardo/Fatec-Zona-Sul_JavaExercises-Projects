package avaliacao11.model.dao;

import java.sql.*;
import avaliacao11.model.bean.Clientes;
import avaliacao11.model.bean.Pedidos;
import avaliacao11.util.ConexaoBd;

public class PedidosDao {
    public Clientes cliente;
    public Pedidos pedido;
    public final Connection c;
    private PreparedStatement stmt;
    private String msg, sql;
    private int numero;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public PedidosDao() throws SQLException, ClassNotFoundException {
        this.c = ConexaoBd.getConexaoMySQL();
        this.cliente = new Clientes();
        this.pedido = new Pedidos();
    }
    
    public boolean localizar () {
        sql = "select * from pedidos inner join clientes on clientes.codCliente = pedidos.Clientes_codCliente where codPed = ?";
        
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, pedido.getCodPed());
            ResultSet rs = stmt.executeQuery();
            rs.next(); // Verifica se há pelo menos um resultado retornado pela consulta
            pedido.setCodPed(rs.getInt(1));
            pedido.setCodCliente(rs.getInt(2));
            pedido.setData(rs.getDate(3));
            cliente.setCodCliente(rs.getInt(4));
            cliente.setNome(rs.getString(5));
            cliente.setEndereco(rs.getString(6));
            cliente.setBairro(rs.getString(7));
            cliente.setCidade(rs.getString(8));
            cliente.setCep(rs.getString(9));
            cliente.setUf(rs.getString(10));
            cliente.setEmail(rs.getString(11));
            cliente.setFone(rs.getString(12));
            cliente.setCelular(rs.getString(13));
      
            return true;
        } catch (SQLException error) {
            return false;
        }
    }
    
    public String atualizar (int operacao) {
        msg = "Operação realizada com sucesso!!!";
        
        try {
            if (operacao == INCLUSAO) {
                sql = "insert into pedidos (Clientes_codCliente, data) values (?, ?)";
                stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setInt(1, pedido.getCodCliente());
                stmt.setDate(2, pedido.getData());
                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next(); 
                pedido.setCodPed(rs.getInt(1));
                stmt.close();
            } else if (operacao == ALTERACAO) {
                //sql = "update pedidos set Clientes_codCliente = ?, data = ? where codPed = ?";
                sql = "update pedidos set data = ? where pedidos.codPed = ? and pedidos.Clientes_codCliente = ?";
                stmt = c.prepareStatement(sql);
                
                stmt.setDate(1, pedido.getData());
                stmt.setInt(2, pedido.getCodPed());
                stmt.setInt(3, pedido.getCodCliente());
               
                stmt.execute();
                stmt.close();
            } else if (operacao == EXCLUSAO) {
                sql = "delete from pedidos where codPed = ?";
                stmt = c.prepareStatement(sql);
                stmt.setInt(1, pedido.getCodPed());
                stmt.execute();
                stmt.close();
            }
            c.close();
        } catch (SQLException error) {
            numero = error.getErrorCode();
            if (numero == 1062) { // 1062 erro de violação de restrição de chave única (PK)
                msg = "Este ID já existe!";
            } else {
                msg = "Falha na operação '" + error.toString() + "'";
            }
        }
        return msg;
    }
}
