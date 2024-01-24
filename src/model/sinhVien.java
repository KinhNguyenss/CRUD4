package model;

public class sinhVien {

    private String maSv;
    private String ten;
    private String khoa;
    private String giaoVienHuongDan;
    private String tenDeTai;

    public sinhVien() {
    }

    public sinhVien(String maSv, String ten, String khoa, String giaoVienHuongDan, String tenDeTai) {
        this.maSv = maSv;
        this.ten = ten;
        this.khoa = khoa;
        this.giaoVienHuongDan = giaoVienHuongDan;
        this.tenDeTai = tenDeTai;
    }

    public String getMaSv() {
        return maSv;
    }

    public void setMaSv(String maSv) {
        this.maSv = maSv;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public String getGiaoVienHuongDan() {
        return giaoVienHuongDan;
    }

    public void setGiaoVienHuongDan(String giaoVienHuongDan) {
        this.giaoVienHuongDan = giaoVienHuongDan;
    }

    public String getTenDeTai() {
        return tenDeTai;
    }

    public void setTenDeTai(String tenDeTai) {
        this.tenDeTai = tenDeTai;
    }

}
