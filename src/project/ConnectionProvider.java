
package project;
import java.sql.*;
import java.sql.DriverManager;

public class ConnectionProvider {
    public static Connection getCon()
    {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/bbms","root","123456");
            System.out.println("Connection Successfully");
            return con;
        }catch(Exception e){
            System.out.println(e);
            return null;
        }
        
      
    }   
}
