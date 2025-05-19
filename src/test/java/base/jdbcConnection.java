package base;

import java.sql.*;

public class jdbcConnection {

    public static Statement connectToDB() throws ClassNotFoundException, SQLException {
        {
            String jdbcUrl = "jdbc:mysql://localhost:3306/your_database";
            String username = "your_username";
            String password = "your_password";


                // 1. Load the JDBC driver (optional in newer Java versions)
                Class.forName("com.mysql.cj.jdbc.Driver");

                // 2. Connect to the database
                Connection conn = DriverManager.getConnection(jdbcUrl, username, password);
                System.out.println("Connected successfully!");

                // below will return statement object , with tha run query
                  return conn.createStatement();


  /*              ResultSet rs = stmt.executeQuery("SELECT * FROM your_table");

                // 4. Process the result set
                while (rs.next()) {
                    System.out.println("Column1: " + rs.getString("column1"));
                    // You can use getInt(), getDouble(), etc. based on column type
                }

                // 5. Close the connection
                rs.close();
                stmt.close();
                conn.close();
 */
        }
    }

}
