package DAO;
import connectDb.connectDB;
import java.sql.*;
import model.taiKhoan;
public class taiKhoanDAO {
     public static boolean taiKhoan(taiKhoan tk) {
        Connection conn = connectDB.getConnect();
        String sql = "select * from taikhoan where taikhoan = ? and matkhau = ?";
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, tk.getTaiKhoan());
            pst.setString(2, tk.getMatKhau());
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                return true;
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectDB.closeConnect(conn);
        }
        return false;
    }
}
