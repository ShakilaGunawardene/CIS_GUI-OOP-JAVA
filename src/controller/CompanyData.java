/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author mhsam
 */
public class CompanyData extends ManageCompanyData{
    Connection con=null;
    PreparedStatement pst=null;
    
    
    public void newDepartment (String enter){
         try{
    Class.forName("com.mysql.cj.jdbc.Driver");
               String query;
               query = "INSERT INTO `department1`( `department`) VALUES (?)";
               
               con=DriverManager.getConnection("jdbc:mysql://localhost:3306/register","root","");
               pst=con.prepareStatement(query);
              
               pst.setString(1,enter);
              
               pst.executeUpdate();
             
               
               
              
              }catch(ClassNotFoundException | SQLException ex){
               JOptionPane.showMessageDialog(null, ex);
           }
    }
    public void newDesignation (){
        throw new UnsupportedOperationException("Not supported yet");
    }
}
