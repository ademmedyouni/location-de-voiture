
package ig;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Scanner;



public class Connecteur {
    
    Connection con;
    public Connecteur() {
        String url = "jdbc:mysql://localhost:3306/best_cars";
        String user = "";
        String pass = "";

        try (BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\DELL\\Documents\\NetBeansProjects\\Best_cars\\src\\ig\\donnee.txt"))) {
            user = reader.readLine();
            pass = reader.readLine();
        } catch (IOException e) {
            System.out.println("Error reading credentials file: " + e.getMessage());
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("Connection established.");
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error connecting to database: " + e.getMessage());
        }
    }   
        public Connection connecttodb(){
            return con; 
        }  
        
}
