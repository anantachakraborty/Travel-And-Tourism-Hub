package travel.management.system;

import java.sql.*;

public class DBConn {
    // Declaring Globally
   Connection c; 
   Statement s;
   // Constructor for the Conn class
   DBConn(){
       try{
           // Load the MySQL JDBC driver
           Class.forName("com.mysql.cj.jdbc.Driver");
           // Establish a connection to the MySQL database
           c = DriverManager.getConnection("jdbc:mysql://localhost:3306/travelmanagementsystem", System.getenv("DB_USER"), System.getenv("DB_PASSWORD"));
           // Create a statement to execute SQL queries
           s = c.createStatement();
           
       } catch(Exception e){
       e.printStackTrace(); // Print any exceptions that occur
       }
       
   }
}
