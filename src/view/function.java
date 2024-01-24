package view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.sinhVien;

public class function extends javax.swing.JFrame {

    public function() {
        initComponents();
        hienThiDuLieu();
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        maS = new javax.swing.JTextField();
        tenS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        khoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        giaoVien = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        deTai = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        xoa = new javax.swing.JButton();
        them = new javax.swing.JButton();
        sua = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        data = new javax.swing.JTable();
        dangXuat = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 0, 0));
        jPanel2.setForeground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(251, 249, 241));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jPanel3.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 683, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 24, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Quản lý đề tài tốt nghiệp");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Mã sinh viên");

        maS.setBackground(new java.awt.Color(229, 225, 218));
        maS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        maS.setForeground(new java.awt.Color(0, 0, 0));

        tenS.setBackground(new java.awt.Color(229, 225, 218));
        tenS.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        tenS.setForeground(new java.awt.Color(0, 0, 0));
        tenS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tenSActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Tên sinh viên");

        khoa.setBackground(new java.awt.Color(229, 225, 218));
        khoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        khoa.setForeground(new java.awt.Color(0, 0, 0));
        khoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khoaActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Khoa");

        giaoVien.setBackground(new java.awt.Color(229, 225, 218));
        giaoVien.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        giaoVien.setForeground(new java.awt.Color(0, 0, 0));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Giáo viên");

        deTai.setBackground(new java.awt.Color(229, 225, 218));
        deTai.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        deTai.setForeground(new java.awt.Color(0, 0, 0));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Tên đề tài");

        xoa.setBackground(new java.awt.Color(170, 215, 217));
        xoa.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        xoa.setForeground(new java.awt.Color(0, 0, 0));
        xoa.setText("Xoá");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        them.setBackground(new java.awt.Color(170, 215, 217));
        them.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        them.setForeground(new java.awt.Color(0, 0, 0));
        them.setText("Thêm");
        them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themActionPerformed(evt);
            }
        });

        sua.setBackground(new java.awt.Color(170, 215, 217));
        sua.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        sua.setForeground(new java.awt.Color(0, 0, 0));
        sua.setText("Sửa");
        sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                suaActionPerformed(evt);
            }
        });

        data.setBackground(new java.awt.Color(251, 249, 241));
        data.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sinh viên", "Tên", "Khoa", "Giáo viên hướng dẫn", "Tên đề tài"
            }
        ));
        data.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(data);

        dangXuat.setBackground(new java.awt.Color(170, 215, 217));
        dangXuat.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        dangXuat.setForeground(new java.awt.Color(0, 0, 0));
        dangXuat.setText("Đăng xuất");
        dangXuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dangXuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 663, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(deTai, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(maS, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tenS, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(xoa, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(sua, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(them, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(dangXuat, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(65, 65, 65)
                        .addComponent(jLabel1)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(maS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tenS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(khoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(giaoVien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(deTai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(them, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(sua, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dangXuat, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 661, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themActionPerformed
        sinhVien s = new sinhVien();// tạo biến s với kiểu dữ liệu sinhVien (dữ liệu rỗng)
        if (maS.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "vui lòng nhập mã sách");
        } else if (tenS.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên sách");
        } else if (khoa.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập người mượn");
        } else if (giaoVien.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày mượn");
        } else if (deTai.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày hẹn trả");
            // bắt buộc ng dùng nhập dữ liệu
        } else {
            s.setMaSv(maS.getText());
            s.setTen(tenS.getText());
            s.setKhoa(khoa.getText());
            s.setGiaoVienHuongDan(giaoVien.getText());
            s.setTenDeTai(deTai.getText());
            // đặt lại dữ liệu cho s
            DAO.functionDAO.insert(s);
            //dùng hàm insert để thêm dữ liệu trong cơ sở dữ liệu
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
            hienThiDuLieu();
        }
    }//GEN-LAST:event_themActionPerformed

    private void khoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_khoaActionPerformed

    private void suaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_suaActionPerformed
        sinhVien s = new sinhVien(); // tạo biến s ( kiểu dữ liệu sinhvien)
                                        // dữ liệu trống 
        if (maS.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "vui lòng nhập mã sách");
        } else if (tenS.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập tên sách");
        } else if (khoa.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập người mượn");
        } else if (giaoVien.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày mượn");
        } else if (deTai.getText().equals("")) {
            JOptionPane.showMessageDialog(rootPane, "Vui lòng nhập ngày hẹn trả");
        } else {
            s.setMaSv(maS.getText());
            s.setTen(tenS.getText());
            s.setKhoa(khoa.getText());
            s.setGiaoVienHuongDan(giaoVien.getText());
            s.setTenDeTai(deTai.getText());
            // đặt lại thông tin của biến s
            DAO.functionDAO.update(s);
            // dùng hàm update trong functionDAO ( truyền vào biến s)
            JOptionPane.showMessageDialog(rootPane, "Sửa thành công");
            hienThiDuLieu();
        }
    }//GEN-LAST:event_suaActionPerformed

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        sinhVien s = new sinhVien();// tạo biến s với kiểu dữ liệu sinhVien( dữ liệu rỗng)
        s.setMaSv(maS.getText());// đặt lại dữ liệu mã sinh viên
        DAO.functionDAO.delete(s);// //dùng hàm xóa trong functionDAO để xóa dữ liệu
        JOptionPane.showMessageDialog(rootPane, "Xóa thành công");
        hienThiDuLieu();
    }//GEN-LAST:event_xoaActionPerformed

    private void dataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataMouseClicked
        DefaultTableModel chonTable = (DefaultTableModel) data.getModel();
        int chonDong = data.getSelectedRow();
        maS.setText(chonTable.getValueAt(chonDong, 0).toString());
        tenS.setText(chonTable.getValueAt(chonDong, 1).toString());
        khoa.setText(chonTable.getValueAt(chonDong, 2).toString());
        giaoVien.setText(chonTable.getValueAt(chonDong, 3).toString());
        deTai.setText(chonTable.getValueAt(chonDong, 4).toString());
    }//GEN-LAST:event_dataMouseClicked

    private void tenSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tenSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tenSActionPerformed

    private void dangXuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dangXuatActionPerformed
        dispose();
        dangNhap dn = new dangNhap();
        dn.setLocationRelativeTo(null);
        dn.setVisible(true);
        dn.show();
    }//GEN-LAST:event_dangXuatActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                function f = new function();
                f.setVisible(true);
                f.setLocationRelativeTo(null);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dangXuat;
    private javax.swing.JTable data;
    private javax.swing.JTextField deTai;
    private javax.swing.JTextField giaoVien;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField khoa;
    private javax.swing.JTextField maS;
    private javax.swing.JButton sua;
    private javax.swing.JTextField tenS;
    private javax.swing.JButton them;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables

    private void hienThiDuLieu() {
        data.setDefaultEditor(Object.class, null);
        DefaultTableModel model = ((DefaultTableModel) (data.getModel()));
        model.setRowCount(0);
        ArrayList<sinhVien> dl = DAO.functionDAO.selectAll();
        for (sinhVien s : dl) {
            model.addRow(new Object[]{
                s.getMaSv(),
                s.getTen(),
                s.getKhoa(),
                s.getGiaoVienHuongDan(),
                s.getTenDeTai()
            });
        }
    }

    private void hienThiDuLieuDieuKien(sinhVien sv) {
        data.setDefaultEditor(Object.class, null);
        DefaultTableModel model = ((DefaultTableModel) (data.getModel()));
        model.setRowCount(0);
        ArrayList<sinhVien> dl = DAO.functionDAO.selectByCondition(sv);
        for (sinhVien s : dl) {
            model.addRow(new Object[]{
                s.getMaSv(),
                s.getTen(),
                s.getKhoa(),
                s.getGiaoVienHuongDan(),
                s.getTenDeTai()
            });
        }
    }
    private void lamMoi (){
        maS.setText("");
        tenS.setText("");
        khoa.setText("");
        giaoVien.setText("");
        deTai.setText("");
    }
}
