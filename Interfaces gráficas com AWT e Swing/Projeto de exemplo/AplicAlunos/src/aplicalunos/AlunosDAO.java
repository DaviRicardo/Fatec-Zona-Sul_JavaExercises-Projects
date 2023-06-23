package aplicalunos;

import java.sql.*;

public class AlunosDAO {
    public Alunos aluno;
    public BD bd;
    private PreparedStatement statement;
    private ResultSet resultSet;
    private String men, sql;
    private int numero;
    public static final byte INCLUSAO=1;
    public static final byte ALTERACAO=2;
    public static final byte EXCLUSAO=3;
    
    public AlunosDAO(){
        bd = new BD();
        aluno = new Alunos();
    }
    
    
    public boolean localizar(){
        sql = "select * from aluno where RA = ?" ;
        try{
            statement = bd.connection.prepareStatement(sql);
            statement.setInt(1,aluno.getRA());
            resultSet = statement.executeQuery();
            resultSet.next();
            aluno.setRA(Integer.parseInt(resultSet.getString(1)));
            aluno.setNome(resultSet.getString(2));
            aluno.setData(resultSet.getDate(3));
            return true;
        }
        catch (SQLException erro)
        {
            return false;
        }
        
    }
    
    public String atualizar(int operacao) {
        men= "Operação realizada com sucesso!!!";
        try{
            if (operacao==INCLUSAO){
                sql = "insert into aluno (RA, Nome, Data) values (?,?,?)";
                statement = bd.connection.prepareStatement(sql);
                statement.setInt(1,(aluno.getRA()));
                statement.setString(2,aluno.getNome());
                statement.setDate(3,aluno.getData());  
            }
            
            else if (operacao==ALTERACAO) {
                sql ="update aluno set Nome=?, Data=? where RA = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1,aluno.getNome());
                statement.setDate(2,aluno.getData());
                statement.setInt(3,aluno.getRA());
                
            }
            
            else if (operacao==EXCLUSAO) {
                sql ="delete from aluno where RA = ?";
                statement = bd.connection.prepareStatement(sql);
                statement.setString(1,Integer.toString(aluno.getRA()));
                
            }
            if (statement.executeUpdate()== 0){
                 men = "Falha na operação!!";
            }
        } catch (SQLException erro){
               numero = erro.getErrorCode();
               
               if (numero==1062)
                   men="Este RA já existe!";
               else
               men="Falha na operação"+ erro.toString();
        }
        return men;
    }
}

