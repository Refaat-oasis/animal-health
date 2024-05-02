/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

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
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrator
 */
public class main {

    static String url = "jdbc:ucanaccess:E:\\AntProgram//projectDataBase.accdb";

    public static void main(String[] args) throws SQLException {

       // String dbURL = "jdbc:odbc:myAccessDB";
//        String driverName = "sun.jdbc.odbc.JdbcOdbcDriver";
//        try {
//            Class.forName(driverName);
//        } catch (ClassNotFoundException ex) {
//            Logger.getLogger(main.class.getName()).log(Level.SEVERE, null, ex);
//        }
        //Connection con = DriverManager.getConnection(url);
        try {
         //   DBConnection dbConnect = new DBConnection();
            Connection connection = DriverManager.getConnection(url);
            // JOptionPane.showMessageDialog(null, "Connected to the DB");
            System.out.println("db donnect");
            OuterForm first = new OuterForm(connection);
            first.setVisible(true);

//            MedicineBLL medbll;
//            MedicineDAL meddal;
//            FeedBLL fedbll;
//            FeedDAL feddal;
//
//            feddal = new FeedDAL(dbconnection);
//            fedbll = new FeedBLL(feddal);
//            meddal = new MedicineDAL(dbconnection);
//            medbll = new MedicineBLL(meddal);
//            CustomerForm c = new CustomerForm(medbll , fedbll);
//            c.setVisible(true);
//            CustomerForm outer = new CustomerForm(medbll);
//            outer.setVisible(true);
//            CustomerDAL c = new CustomerDAL(dbconnection);
//            Customer c1 = c.getCustomerByID("12376548976421");
//   ,         System.out.println(c.getAllcustomer().get(0).getCustomerLastName());
//            //System.out.println(c1.getCustomerLastName());
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();

        }
    }

}
