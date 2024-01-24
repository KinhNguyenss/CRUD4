package DAO;

import java.util.ArrayList;
import java.sql.*;
import connectDb.connectDB;
import model.sinhVien;

public class functionDAO {

    public static boolean insert(sinhVien t) {
        Connection con = connectDB.getConnect();
        //connect tới csdl
        String sql = "insert into sinhvien (masinhvien,ten,khoa,giaovienhuongdan,tendetai) "
                + "values(?,?,?,?,?)";
        // câu lệnh để thêm dữ liệu vào csdl
        try {
            PreparedStatement pst = con.prepareStatement(sql);
            pst.setString(1, t.getMaSv());
            pst.setString(2, t.getTen());
            pst.setString(3, t.getKhoa());
            pst.setString(4, t.getGiaoVienHuongDan());
            pst.setString(5, t.getTenDeTai());
            // nhập dữ liệu vào ?
            pst.executeUpdate();
            // dùng để chạy câu lệnh
            pst.close();
            connectDB.closeConnect(con);
            // ngắt kết nối
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            connectDB.closeConnect(con);
        }
        return false;
    }

    public static boolean update(sinhVien t) {
        Connection conn = connectDB.getConnect();
        // kết nối cơ sở dữ liệu
            String sql = "update sinhvien set ten=?,khoa=?,giaovienhuongdan=?,tendetai=? where masinhvien = ? ";
        // câu lệnh sql
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(5, t.getMaSv());
            pst.setString(1, t.getTen());
            pst.setString(2, t.getKhoa());
            pst.setString(3, t.getGiaoVienHuongDan());
            pst.setString(4, t.getTenDeTai());
            // đặt thông tin cho ?
            pst.executeUpdate();
            // cho lệnh chạy
            pst.close();
            connectDB.closeConnect(conn);
            // đóng cơ sở dữ liệu
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static boolean delete(sinhVien t) {
        Connection conn = connectDB.getConnect();
        // connect với csdl
        String sql = "delete from sinhvien where masinhvien = ?";// câu lệnh sql
        try {
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, t.getMaSv());// đặt lại thông tin cho ?
            pst.executeUpdate();
            // chạy
            pst.close();
            connectDB.closeConnect(conn);
            // ngắt kết nối
            return true;
        } catch (Exception e) {
        }
        return false;
    }

    public static ArrayList<sinhVien> selectAll() {
        ArrayList<sinhVien> list = new ArrayList<>();
        String sql = "select * from sinhvien ";
        try {
            Connection con = connectDB.getConnect();
            PreparedStatement pst = con.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maS = rs.getString("masinhvien");
                String tenS = rs.getString("ten");
                String khoa = rs.getString("khoa");
                String giaovien = rs.getString("giaovienhuongdan");
                String detai = rs.getString("tendetai");
                sinhVien s = new sinhVien(maS, tenS, khoa, giaovien, detai);
                list.add(s);
            }
            connectDB.closeConnect(con);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }

    public static ArrayList<sinhVien> selectByCondition(sinhVien s) {
        ArrayList<sinhVien> list = new ArrayList<>();
        try {
            Connection conn = connectDB.getConnect();
            String sql = "select * from sinhvien where masinhvien = ? OR giaovienhuongdan = ? OR tendetai = ?";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, s.getMaSv());
            pst.setString(2, s.getGiaoVienHuongDan());
            pst.setString(3, s.getTenDeTai());
            ResultSet rs = pst.executeQuery();
            while (rs.next()) {
                String maS = rs.getString("masinhvien");
                String tenS = rs.getString("ten");
                String khoa = rs.getString("khoa");
                String giaovien = rs.getString("giaovienhuongdan");
                String detai = rs.getString("tendetai");
                sinhVien sv = new sinhVien(maS, tenS, khoa, giaovien, detai);
                list.add(sv);
            }
            connectDB.getConnect();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return list;
    }
}
