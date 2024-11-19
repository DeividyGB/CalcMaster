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
    /*private PreparedStatement logIn = null;*/
    private PreparedStatement recoverPass = null;
    
    public CalcMasterConecta () throws ClassNotFoundException
    {
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            connection = DriverManager.getConnection (URL, USERNAME, PASSWORD);
            addUser = connection.prepareStatement (
                    "INSERT INTO CALC.USUARIO (NOME, EMAIL, CPF, SENHA) "
                            + "VALUES (?, ?, ?, ?)");
            
            /*logIn = connection.prepareStatement(
                    "SELECT EMAIL, SENHA FROM CALC.USUARIO "
                            + "WHERE EMAIL = ? AND SENHA = ?" );*/
            
            recoverPass = connection.prepareStatement(
                    "SELECT * FROM CALC.USUARIO WHERE CPF = ?" );
            
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
    
    /*Needs More Research*/
    /*public List <CalcMasterSource> getEmail (String email, String senha)
    {
        List<CalcMasterSource> resultados = null;
        ResultSet resultSet = null;
        try {
            logIn.setString(1, email);
            logIn.setString(2, senha);
            resultSet = logIn.executeQuery();
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
    }*/
    
    public List <CalcMasterSource> getSenhaRec (String senha)
    {
        List<CalcMasterSource> resultados = null;
        ResultSet resultSet = null;
        try {
            recoverPass.setString(1, senha);
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
