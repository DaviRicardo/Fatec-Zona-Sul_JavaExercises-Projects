package avaliacao11.model.dao;

import java.sql.*;
import avaliacao11.model.bean.Clientes;
import avaliacao11.util.ConexaoBd;

public class ClientesDao {
    public Clientes cliente;
    public final Connection c;
    private PreparedStatement stmt;
    private String msg, sql;
    private int numero;
    public static final byte INCLUSAO = 1;
    public static final byte ALTERACAO = 2;
    public static final byte EXCLUSAO = 3;

    public ClientesDao() throws SQLException, ClassNotFoundException {
        this.c = ConexaoBd.getConexaoMySQL();
        this.cliente = new Clientes();
    }
    
    public boolean localizar () {
        sql = "select * from clientes where codCliente = ?";
        
        try {
            stmt = c.prepareStatement(sql);
            stmt.setInt(1, cliente.getCodCliente());
            ResultSet rs = stmt.executeQuery();
            rs.next();
            cliente.setCodCliente(rs.getInt(1));
            cliente.setNome(rs.getString(2));
            cliente.setEndereco(rs.getString(3));
            cliente.setBairro(rs.getString(4));
            cliente.setCidade(rs.getString(5));
            cliente.setCep(rs.getString(6));
            cliente.setUf(rs.getString(7));
            cliente.setEmail(rs.getString(8));
            cliente.setFone(rs.getString(9));
            cliente.setCelular(rs.getString(10));
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
                sql = "insert into clientes (nome, ender, bairro, cidade, cep, uf, email, fone, celular)"
                        + "values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
                stmt = c.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getEndereco());
                stmt.setString(3, cliente.getBairro());
                stmt.setString(4, cliente.getCidade());
                stmt.setString(5, cliente.getCep());
                stmt.setString(6, cliente.getUf());
                stmt.setString(7, cliente.getEmail());
                stmt.setString(8, cliente.getFone());
                stmt.setString(9, cliente.getCelular());  
                
                stmt.executeUpdate();
                ResultSet rs = stmt.getGeneratedKeys();
                rs.next();
                cliente.setCodCliente( rs.getInt(1));
                stmt.close();
            } else if (operacao == ALTERACAO) {
                sql = "update clientes set nome = ?, ender = ?, bairro = ?, cidade = ?, cep = ?, uf = ?, email = ?, fone = ?, celular = ? where codCliente = ?";
                stmt = c.prepareStatement(sql);
                stmt.setString(1, cliente.getNome());
                stmt.setString(2, cliente.getEndereco());
                stmt.setString(3, cliente.getBairro());
                stmt.setString(4, cliente.getCidade());
                stmt.setString(5, cliente.getCep());
                stmt.setString(6, cliente.getUf());
                stmt.setString(7, cliente.getEmail());
                stmt.setString(8, cliente.getFone());
                stmt.setString(9, cliente.getCelular());
                stmt.setInt(10, cliente.getCodCliente()); 
                stmt.execute();
                stmt.close();
            } else if (operacao == EXCLUSAO) {       
                sql = "delete from clientes where codCliente = ?";
                stmt = c.prepareStatement(sql);
                stmt.setInt(1, cliente.getCodCliente());
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