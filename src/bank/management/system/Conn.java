
package bank.management.system;
import java.sql.*;



public class Conn {
     Connection c;
     Statement s;

    public Conn(){
        
   
    try{
     Class.forName("com.mysql.cj.jdbc.Driver");
     String url="jdbc:mysql://localhost:3306/bankmanagementsystem";
     String user="root";
     String password="Admin@123";
     c = DriverManager.getConnection(url,user,password);
     s = c.createStatement();
    }
    catch(Exception e)
    {
        System.out.println(e);
    }
    }

}
            
    
    

