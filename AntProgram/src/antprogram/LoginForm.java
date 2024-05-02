/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package antprogram;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.awt.*;
import java.awt.print.PrinterException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Graphics;
import java.awt.Toolkit;
import java.io.IOException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.SQLException;

/**
 *
 * @author Administrator
 */
public class LoginForm extends javax.swing.JFrame {

    private FeedBLL fedbll;
    private MedicineBLL medbll;
    private Connection connection;

    /**
     * Creates new form LoginForm
     */
    public LoginForm() {
        initComponents();
    }
        public LoginForm(Connection connection) {
        this();
        this.connection=connection;
    }

    public LoginForm(MedicineBLL medbll, FeedBLL fedbll, Connection connection) {
        this();
        this.connection = connection;
        this.medbll = medbll;
        this.fedbll = fedbll;

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtUsername = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        radbtnCustomer = new javax.swing.JRadioButton();
        radbtnvetrinary = new javax.swing.JRadioButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 0, 79));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 204));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("LOG_IN FORM..");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(101, 36, 283, 65));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("USER_NAME :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 221, 170, 48));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("PASSWORD :");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 275, 170, 49));

        txtUsername.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtUsernameActionPerformed(evt);
            }
        });
        jPanel1.add(txtUsername, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 239, 231, -1));

        btnSubmit.setBackground(new java.awt.Color(124, 193, 238));
        btnSubmit.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnSubmit.setForeground(new java.awt.Color(0, 0, 81));
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        jPanel1.add(btnSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 375, -1, -1));

        btnCancel.setBackground(new java.awt.Color(204, 204, 204));
        btnCancel.setFont(new java.awt.Font("Segoe UI", 2, 36)); // NOI18N
        btnCancel.setForeground(new java.awt.Color(0, 0, 81));
        btnCancel.setText("CANCEL");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });
        jPanel1.add(btnCancel, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 375, -1, -1));

        buttonGroup1.add(radbtnCustomer);
        radbtnCustomer.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        radbtnCustomer.setForeground(new java.awt.Color(255, 255, 255));
        radbtnCustomer.setText("CUSTOMER");
        jPanel1.add(radbtnCustomer, new org.netbeans.lib.awtextra.AbsoluteConstraints(58, 127, -1, 46));

        buttonGroup1.add(radbtnvetrinary);
        radbtnvetrinary.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        radbtnvetrinary.setForeground(new java.awt.Color(255, 255, 255));
        radbtnvetrinary.setText("VETRINARY");
        jPanel1.add(radbtnvetrinary, new org.netbeans.lib.awtextra.AbsoluteConstraints(251, 127, -1, 46));

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        jPanel1.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 293, 233, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 452, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 489, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUsernameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtUsernameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtUsernameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed

        CustomerDAL custdal = new CustomerDAL(connection);
        CustomerBLL custBLL = new CustomerBLL(custdal);
        if (radbtnCustomer.isSelected()) {
            String id = txtUsername.getText();
            String pass = txtPassword.getText();
            try {
                Customer cust = custBLL.getCustomerById(id);
                if (cust == null) {
                    JOptionPane.showMessageDialog(btnSubmit, "ID not Found");
                } else if (cust != null && !cust.getCustomerPassword().equals(pass)) {
                    JOptionPane.showMessageDialog(btnSubmit, "Password Is not Correct");

                } else {
                    MedicineBLL medbll;
                    MedicineDAL meddal;
                    FeedBLL fedbll;
                    FeedDAL feddal;

                    feddal = new FeedDAL(connection);
                    fedbll = new FeedBLL(feddal);
                    meddal = new MedicineDAL(connection);
                    medbll = new MedicineBLL(meddal);

                    CustomerForm c = new CustomerForm(medbll, fedbll, connection);
                    c.setVisible(true);

                }
            } catch (Exception e) {

                e.printStackTrace();
            }
        }
//
//        if (radbtnCustomer.isSelected()) {
//            String userName = txtUsername.getText();
//            String password = txtPassword.getText();
//            String sql = "SELECT * from tblCustomer Where customer_ID = '" + userName + "' and password='"+password+"'";
//            Statement stmt;
//            try {
//
//                stmt = connection.createStatement();
//                ResultSet results = stmt.executeQuery(sql);
//                if (results.next()) {
//                   // String userPassword = results.getString("password");
//                   // if (userPassword.equals(password)) {
//                        CustomerForm form = new CustomerForm(connection);
//                        form.setVisible(true);
//                        dispose();
//                    //} else {
//                     //   JOptionPane.showMessageDialog(null, "Incorrect Password");
//                    //}
//                } else {
//                    JOptionPane.showMessageDialog(null, "User does not exist");
//                }
//            } catch (Exception e1) {
//                // TODO Auto-generated catch block
//                JOptionPane.showMessageDialog(null, e1.getMessage());
//            }
//        }
//        if (radbtnvetrinary.isSelected()) {
//            String userName = txtUsername.getText();
//            String password = txtPassword.getText();
//            String sql = "SELECT password from tblVetrinary Where ID = '" + userName + "'";
//            Statement stmt;
//            try {
//
//                stmt = connection.createStatement();
//                ResultSet results = stmt.executeQuery(sql);
//                if (results.next()) {
//                    String userPassword = results.getString("password");
//                    if (userPassword.equals(password)) {
//                       VetHomeForm home = new VetHomeForm(connection);
//                        home.setVisible(true);
//                        dispose();
//                    } else {
//                        JOptionPane.showMessageDialog(null, "Incorrect Password");
//                    }
//                } else {
//                    JOptionPane.showMessageDialog(null, "User does not exist");
//                }
//            } catch (Exception e1) {
//                // TODO Auto-generated catch block
//                JOptionPane.showMessageDialog(null, e1.getMessage());
//            }
//        }


    }//GEN-LAST:event_btnSubmitActionPerformed


    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        OuterForm outer = new OuterForm();

        outer.setVisible(true);
        this.setVisible(false);


    }//GEN-LAST:event_btnCancelActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            DBConnection db = new DBConnection();

            // TODO add your handling code here:
        } catch (SQLException ex) {
            Logger.getLogger(LoginForm.class
                    .getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginForm.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnSubmit;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton radbtnCustomer;
    private javax.swing.JRadioButton radbtnvetrinary;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsername;
    // End of variables declaration//GEN-END:variables
}
