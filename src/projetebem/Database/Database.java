package projetebem.Database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private Connection connection;
    
    public Connection conectarDatabase(){
        try{
            String url = "jdbc:mysql://localhost:3306/projetebem?user=root";
            connection = DriverManager.getConnection(url);
        }catch(SQLException exception){
            System.out.println("Erro ao conectar ao banco de dados.");
        }
        
        return connection;
    }
}
