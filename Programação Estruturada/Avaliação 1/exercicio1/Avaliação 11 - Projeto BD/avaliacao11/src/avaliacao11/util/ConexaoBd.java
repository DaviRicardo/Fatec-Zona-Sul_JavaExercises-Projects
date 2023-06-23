package avaliacao11.util;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;

public class ConexaoBd {    
    public static String status = "Não conectado...";

    public ConexaoBd() {

    }

    public static Connection getConexaoMySQL() {
        Connection connection = null;          
        try {

            String driverName = "com.mysql.jdbc.Driver";
            Class.forName(driverName);
            
            String serverName = "localhost";          
            String mydatabase = "vendas";     
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase + "?useTimezone=true&serverTimezone=UTC";
            
            String username = "root";        
            String password = "";           
            
            connection = DriverManager.getConnection(url, username, password);
            
            if (connection != null) {
                status = ("STATUS--->Conectado com sucesso!");
            } else {
                status = ("STATUS--->Não foi possivel realizar conexão");
            }
            
            return connection;
        } catch (ClassNotFoundException e) {  
            System.out.println("O driver especificado nao foi encontrado.");
            return null;
        } catch (SQLException e) {
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");
            System.out.println("Erro" + e.getMessage());
            return null;
        }
    }
    
    public static String statusConection() {
        return status;
    }
   
    public static boolean FecharConexao() {
        try {
           ConexaoBd.getConexaoMySQL().close();
           return true;
        } catch (SQLException e) {
            return false;
        }
    }
   
    public static Connection ReiniciarConexao() {
        return ConexaoBd.getConexaoMySQL();
    }
}

