package database_project;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.SQLException;


public class Database {
    
    private Connection conn;
    private Statement statement;
    
    public Connection openConnection() throws SQLException{
        if(conn == null){
            
            String url = "jdbc:mysql://localhost/";//this is my url to database in xampp
            String dbName = "driving_school";//database name
            String driver = "com.mysql.jdbc.Driver";//this is my mysql jdbc driver class
            String userName = "root";//my username
            String password = "";//my password which is empty
            
            try{
                Class.forName(driver);
                this.conn = (Connection)DriverManager.getConnection(url+dbName,userName,password);
                
                System.out.println("CONNECTION SUCCESFULL!");//check if connection is established
                
            }catch(ClassNotFoundException | SQLException sqle){
                
                System.out.println("CONNECTION FAILED!");//check if connection is established
                
            }
            
        }
        return conn;
    }
    
}
