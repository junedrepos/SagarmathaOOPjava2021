package np.edu.scst.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
   
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = 
          DriverManager.getConnection ("jdbc:mysql://localhost:3306/sagarmatha_db","root","root");
                            //                                     jdbc:mysql://localhost:3306/databaseName  , uname,pass
          System.out.println("Database connected"); 
          Statement st = conn.createStatement();
          String sql = "UPDATE student SET name = 'Laxman' WHERE roll = 5  ";
          st.executeUpdate(sql);
          System.out.println("Successfully updated");
          st.close();
          conn.close();
    }
}
