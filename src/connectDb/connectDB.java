package connectDb;

import java.sql.*;

public class connectDB {

    public static Connection getConnect() {
        Connection conn = null;
        String url = "jdbc:mysql://localhost:3306/qltn";
        String user = "root";
        String pass = "";
        try {
            DriverManager.deregisterDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, pass);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    public static void closeConnect(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
