/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dataModel.AHRManager;
import dataModel.HRManager;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import view.RegisterHRView;

/**
 *
 * @author mhsam
 */
public class ManageHR {

    Connection con = null;
    PreparedStatement pst = null;

    //Register (SELECT)
    //Polymorphism (Overloading) : With return type With Parameters
    public boolean manageEmployee(String empName, String email, String password, String position) {

        if (position.equals("HR Assistant")) {
            AHRManager ahrManager = new AHRManager(empName, password, email, position);
        } else {
            HRManager hrManager = new HRManager(empName, password, email, position);
        }

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String query = "INSERT INTO `employee`( `empname`, `email`, `password`, `designation`) VALUES (?,?,?,?)";
            con = DriverManager.getConnection("jdbc:mysql://localhost/register", "root", "");
            pst = con.prepareStatement(query);
            pst.setString(1, empName);
            pst.setString(2, email);
            pst.setString(3, password);
            pst.setString(4, position);
            pst.executeUpdate();

            if (position.equals("HR Assistant")) {
                AHRManager assistant = new AHRManager();
                System.out.println(assistant.salaryCalculation());
                JOptionPane.showMessageDialog(null, "REGISTER SUCCESSFULLY\n" + assistant.salaryCalculation());
            } else {
                HRManager manager = new HRManager();
                System.out.println(manager.salaryCalculation());
                JOptionPane.showMessageDialog(null, "REGISTER SUCCESSFULLY\n" + manager.salaryCalculation());
            }

            return true;

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);

            return false;
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(RegisterHRView.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
    }

    //Polymorphism (Overloading) : With return type With Parameters Delete
    public boolean manageEmployee(int id) {
        System.out.println();
        
        
        
        
   
        return true;
    }

}
