/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package antprogram;

import static antprogram.main.url;
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
public class DBConnection {

    public static Connection connection;
    public static String url;

    public DBConnection() throws SQLException {
        try {

            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver"); 
            url = "jdbc:ucanaccess://C://Users//Administrator//Documents//NetBeansProjects//AntProgram//projectDataBase.accdb";
            Connection connection = DriverManager.getConnection(url);
            System.out.println("Connected to the DB");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
