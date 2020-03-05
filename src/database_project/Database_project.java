
package database_project;
import java.sql.SQLException;

public class Database_project {

 
    public static void main(String[] args) throws SQLException{
       
        Database db = new Database();
        db.openConnection();
        
    }
    
}
