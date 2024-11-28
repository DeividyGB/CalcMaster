package org.calcmaster;
import java.sql.*;
import java.util.*;

/*@author Skullius*/
public class CalcMasterConecta {
    private static final String URL = "jdbc:derby://localhost:1527/CalcMaster";
    private static final String USERNAME = "Calc";
    private static final String PASSWORD = "calc";
    private Connection connection = null;
    
    private PreparedStatement addUser = null;
    private PreparedStatement logIn = null;
    private PreparedStatement recoverPass = null;
    private PreparedStatement histAdd = null;
    private PreparedStatement histLog = null;
    
    public CalcMasterConecta () throws ClassNotFoundException
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
            
            addUser = connection.prepareStatement (
                    "INSERT INTO CALC.USUARIO (NOME, EMAIL, CPF, SENHA) "
                            + "VALUES (?, ?, ?, ?)");
            
            logIn = connection.prepareStatement(
                    "SELECT EMAIL, SENHA FROM CALC.USUARIO "
                            + "WHERE EMAIL = ? AND SENHA = ?" );
            
            recoverPass = connection.prepareStatement(
                    "SELECT * FROM CALC.USUARIO WHERE CPF = ?" );
            
            histAdd = connection.prepareStatement (
                    "INSERT INTO CALC.HISTORICO (N1, N2, OP, R1, R2) "
                            + "VALUES (?, ?, ?, ?, ?)");
            
            histLog = connection.prepareStatement(
                    "SELECT * FROM CALC.HISTORICO" );
            
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            System.exit(1);
        }
    }
    public int addUser(String nome, String email, String cpf, String senha )
    {
        int result = 0;
        try{
            addUser.setString(1, nome);
            addUser.setString(2, email);
            addUser.setString(3, cpf);
            addUser.setString(4, senha);
            result = addUser.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }
    
    public List <CalcMasterLogin> getLogin (String email, String senha)
    {
        List<CalcMasterLogin> resultados = null;
        ResultSet resultSet = null;
        try {
            logIn.setString(1, email);
            logIn.setString(2, senha);
            resultSet = logIn.executeQuery();
            resultados = new ArrayList <CalcMasterLogin>();
            while (resultSet.next())
            {
                resultados.add(new CalcMasterLogin(
                resultSet.getString("Email"),
                resultSet.getString("Senha")));
            }
        }catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return resultados;
    }
    
    public List <CalcMasterSource> getSenhaRec (String cpf)
    {
        List<CalcMasterSource> resultados = null;
        ResultSet resultSet = null;
        try {
            recoverPass.setString(1, cpf);
            resultSet = recoverPass.executeQuery();
            resultados = new ArrayList <CalcMasterSource>();
            while (resultSet.next())
            {
                resultados.add(new CalcMasterSource(
                resultSet.getInt("ID"),
                resultSet.getString("Nome"),
                resultSet.getString("Email"),
                resultSet.getString("CPF"),
                resultSet.getString("Senha")));
            }
        }catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return resultados;
    }
    
    public int addHistory(Double n1, Double n2, String op, Double r1, Double r2)
    {
        int result = 0;
        try{
            histAdd.setDouble(1, n1);
            histAdd.setDouble(2, n2);
            histAdd.setString(3, op);
            histAdd.setDouble(4, r1);
            histAdd.setDouble(5, r2);
            result = histAdd.executeUpdate();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return result;
    }
    
    public List <CalcMasterHistory> getHistorico ()
    {
        List<CalcMasterHistory> resultados = null;
        ResultSet resultSet = null;
        try {
            resultSet = histLog.executeQuery();
            resultados = new ArrayList <CalcMasterHistory>();
            while (resultSet.next())
            {
                resultados.add(new CalcMasterHistory(
                resultSet.getInt("ID"),
                resultSet.getDouble("N1"),
                resultSet.getDouble("N2"),
                resultSet.getDouble("R1"),
                resultSet.getDouble("R2"),
                resultSet.getString("OP")));
            }
        }catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
            close();
        }
        return resultados;
    }
    
    public void close ()
    {
        try
        {
            connection.close();
        }
        catch (SQLException sqlException)
        {
            sqlException.printStackTrace();
        }
    }
}
