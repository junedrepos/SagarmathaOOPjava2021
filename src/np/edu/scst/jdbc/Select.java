package np.edu.scst.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Select {
      public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = 
          DriverManager.getConnection ("jdbc:mysql://localhost:3306/sagarmatha_db","root","root");
                            //                                     jdbc:mysql://localhost:3306/databaseName  , uname,pass
          System.out.println("Database connected"); 
          Statement st = conn.createStatement();
          String sql = "SELECT * FROM student";
          ResultSet rows =  st.executeQuery(sql);
          System.out.println("Roll \t Name\t Class\t Program");
          
          while(rows.next()){
              System.out.print(rows.getInt("roll")+"\t");
              System.out.print(rows.getString("name")+"\t");
              System.out.print(rows.getInt("class")+"\t");
              System.out.print(rows.getString("program"));
              System.out.println("");
          }
          
          st.close();
          conn.close();
    }
}
