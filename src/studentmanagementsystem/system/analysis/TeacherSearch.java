/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studentmanagementsystem.system.analysis;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Jishan
 */
public class TeacherSearch extends javax.swing.JFrame {

    Connection con;
    PreparedStatement ps;
    ResultSet rs;

    /**
     * Creates new form TeacherSearch
     */
    public TeacherSearch() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jtxtid = new javax.swing.JTextField();
        jbtnsearch = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jtxtfull = new javax.swing.JTextField();
        jtxtp1 = new javax.swing.JTextField();
        jbtns2 = new javax.swing.JTextField();
        jbtncn = new javax.swing.JTextField();
        jtxtb1 = new javax.swing.JTextField();
        jtxts1 = new javax.swing.JTextField();
        jtxtr1 = new javax.swing.JTextField();
        jbtnbgroup = new javax.swing.JTextField();
        jtxtdob = new javax.swing.JTextField();
        jbtnp2 = new javax.swing.JTextField();
        jbtnd2 = new javax.swing.JTextField();
        jtxtd1 = new javax.swing.JTextField();
        jtxtb2 = new javax.swing.JTextField();
        jtxtr2 = new javax.swing.JTextField();
        jbtnreset21 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SUNRISE PARISH PUBLIC SCHOOL SYSTEM");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(150, 0, 610, 29);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Teacher Information Search");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(310, 30, 240, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Please Search Information By ID :");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(10, 60, 240, 15);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Teacher's Information :");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(10, 120, 170, 15);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Teacher's Full Name");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(160, 150, 140, 14);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Date of Birth");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(160, 170, 140, 14);

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Teacher's ID");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(160, 90, 130, 14);

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Contact Number");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(160, 190, 120, 14);

        jtxtid.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtid.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtid);
        jtxtid.setBounds(250, 90, 400, 18);

        jbtnsearch.setBackground(new java.awt.Color(51, 255, 204));
        jbtnsearch.setText("Search");
        jbtnsearch.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnsearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnsearchActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnsearch);
        jbtnsearch.setBounds(690, 90, 73, 23);

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Present Address :");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(160, 210, 130, 15);

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Road No.");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(200, 240, 70, 14);

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("District :");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(240, 300, 100, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Block No.");
        jPanel1.add(jLabel13);
        jLabel13.setBounds(400, 270, 80, 20);

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("Section No.");
        jPanel1.add(jLabel14);
        jLabel14.setBounds(400, 240, 90, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("Plot No.");
        jPanel1.add(jLabel15);
        jLabel15.setBounds(200, 270, 60, 20);

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("Blood Group ");
        jPanel1.add(jLabel16);
        jLabel16.setBounds(160, 340, 110, 15);

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Permenant Address :");
        jPanel1.add(jLabel17);
        jLabel17.setBounds(160, 370, 130, 14);

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Block No.");
        jPanel1.add(jLabel18);
        jLabel18.setBounds(400, 430, 56, 15);

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Section No.");
        jPanel1.add(jLabel19);
        jLabel19.setBounds(400, 400, 130, 15);

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("Plot No.");
        jPanel1.add(jLabel20);
        jLabel20.setBounds(200, 430, 110, 15);

        jLabel21.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setText("Road No.");
        jPanel1.add(jLabel21);
        jLabel21.setBounds(200, 400, 100, 14);

        jLabel22.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("District :");
        jPanel1.add(jLabel22);
        jLabel22.setBounds(240, 460, 52, 15);

        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("         © 2017 Sunrise Parish Public School System | All Rights Reserved By Sunrise School | Dhaka, Bangladesh-1208 | Phone +88-02-01977239551");
        jPanel1.add(jLabel23);
        jLabel23.setBounds(40, 530, 710, 14);

        jButton1.setBackground(new java.awt.Color(51, 255, 204));
        jButton1.setText("Back");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(230, 500, 100, 19);

        jButton2.setBackground(new java.awt.Color(51, 255, 204));
        jButton2.setText("Exit");
        jButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(490, 500, 100, 19);

        jtxtfull.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtfull.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtxtfull.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtfullActionPerformed(evt);
            }
        });
        jPanel1.add(jtxtfull);
        jtxtfull.setBounds(290, 150, 360, 18);

        jtxtp1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtp1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtp1);
        jtxtp1.setBounds(270, 270, 120, 20);

        jbtns2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtns2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtns2);
        jbtns2.setBounds(480, 400, 170, 18);

        jbtncn.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtncn.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtncn);
        jbtncn.setBounds(290, 190, 360, 18);

        jtxtb1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtb1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtb1);
        jtxtb1.setBounds(480, 270, 170, 18);

        jtxts1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxts1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxts1);
        jtxts1.setBounds(480, 240, 170, 18);

        jtxtr1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtr1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtr1);
        jtxtr1.setBounds(270, 240, 120, 18);

        jbtnbgroup.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtnbgroup.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnbgroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnbgroupActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnbgroup);
        jbtnbgroup.setBounds(250, 340, 400, 18);

        jtxtdob.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtdob.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtdob);
        jtxtdob.setBounds(290, 170, 360, 18);

        jbtnp2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtnp2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtnp2);
        jbtnp2.setBounds(270, 430, 120, 18);

        jbtnd2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jbtnd2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jbtnd2);
        jbtnd2.setBounds(300, 460, 350, 18);

        jtxtd1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtd1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtd1);
        jtxtd1.setBounds(300, 300, 350, 18);

        jtxtb2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtb2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtb2);
        jtxtb2.setBounds(480, 430, 170, 18);

        jtxtr2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtxtr2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jtxtr2);
        jtxtr2.setBounds(270, 400, 120, 18);

        jbtnreset21.setBackground(new java.awt.Color(51, 255, 204));
        jbtnreset21.setText("Reset");
        jbtnreset21.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jbtnreset21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnreset21ActionPerformed(evt);
            }
        });
        jPanel1.add(jbtnreset21);
        jbtnreset21.setBounds(360, 500, 100, 20);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/studentmanagementsystem/system/analysis/bg1.jpg"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 790, 550);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 793, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.hide();
        TeacherAll frm = new TeacherAll();
        frm.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbtnbgroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnbgroupActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jbtnbgroupActionPerformed

    private void jtxtfullActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtfullActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxtfullActionPerformed

    private void jbtnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnsearchActionPerformed
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/SystemAnalysis", "Jishan", "Jishan");
            ps = con.prepareStatement("SELECT * FROM JISHAN.ADDTEACHERINFO where ID_NUMBER=?");
            ps.setInt(1, Integer.parseInt(jtxtid.getText()));
            rs = ps.executeQuery();

            while (rs.next()) {
                jtxtfull.setText(rs.getString("FULL_NAME"));
                jtxtdob.setText(rs.getString("DOB"));
                jbtncn.setText(rs.getString("CONTACT_NUMBER"));
                jtxtr1.setText(rs.getString("P_ROAD"));
                jtxts1.setText(rs.getString("P_SECTION"));
                jtxtp1.setText(rs.getString("P_PLOT"));
                jtxtb1.setText(rs.getString("P_BLOCK"));
                jtxtd1.setText(rs.getString("P_DISTRICT"));
                jbtnbgroup.setText(rs.getString("BLOOD_GROUP"));
                jtxtr2.setText(rs.getString("PR_ROAD"));
                jbtns2.setText(rs.getString("PR_SECTION"));
                jbtnp2.setText(rs.getString("PR_PLOT"));
                jtxtb2.setText(rs.getString("PR_BLOCK"));
                jbtnd2.setText(rs.getString("PR_DISTRICT"));
                JOptionPane.showMessageDialog(null, "Congratulations...!!! \nWe can findout your data from our database...!!! \nThank you for using student management system...!!!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jbtnsearchActionPerformed

    private void jbtnreset21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnreset21ActionPerformed
        jtxtid.setText(null);
        jtxtfull.setText(null);
        jtxtdob.setText(null);
        jbtncn.setText(null);
        jtxtr1.setText(null);
        jtxts1.setText(null);
        jtxtp1.setText(null);
        jtxtb1.setText(null);
        jtxtd1.setText(null);
        jbtnbgroup.setText(null);
        jtxtr2.setText(null);
        jbtns2.setText(null);
        jbtnp2.setText(null);
        jtxtb2.setText(null);
        jbtnd2.setText(null);
    }//GEN-LAST:event_jbtnreset21ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeacherSearch.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeacherSearch().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jbtnbgroup;
    private javax.swing.JTextField jbtncn;
    private javax.swing.JTextField jbtnd2;
    private javax.swing.JTextField jbtnp2;
    private javax.swing.JButton jbtnreset21;
    private javax.swing.JTextField jbtns2;
    private javax.swing.JButton jbtnsearch;
    private javax.swing.JTextField jtxtb1;
    private javax.swing.JTextField jtxtb2;
    private javax.swing.JTextField jtxtd1;
    private javax.swing.JTextField jtxtdob;
    private javax.swing.JTextField jtxtfull;
    private javax.swing.JTextField jtxtid;
    private javax.swing.JTextField jtxtp1;
    private javax.swing.JTextField jtxtr1;
    private javax.swing.JTextField jtxtr2;
    private javax.swing.JTextField jtxts1;
    // End of variables declaration//GEN-END:variables
}
