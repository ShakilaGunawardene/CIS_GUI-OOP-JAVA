/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataModel;

/**
 *
 * @author mhsam
 */
public class Employee {
    private String eName;
    private int eEPF;
    private String eDepartment;
    private String eDesignation;
    private String password;
    String email;
    String position;

    public Employee(String eName, String password, String email, String position) {
        this.eName = eName;
        this.password = password;
        this.email = email;
        this.position = position;
    }


    
     public Employee(){
         
     }

    public Employee(String eName, String eDepartment, String eDesignation,  String position, String email) {
        this.eName = eName;
        this.eDepartment = eDepartment;
        this.eDesignation = eDesignation;
        this.position = position;
        this.email = email;
    }
        public String salaryCalculation() {
            String message="The Basic Salary for Employee is 25000 LKR";
            return message;
        }
    
    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }

    public int geteEPF() {
        return eEPF;
    }

    public void seteEPF(int eEPF) {
        this.eEPF = eEPF;
    }

    public String geteDepartment() {
        return eDepartment;
    }

    public void seteDepartment(String eDepartment) {
        this.eDepartment = eDepartment;
    }

    public String geteDesignation() {
        return eDesignation;
    }

    public void seteDesignation(String eDesignation) {
        this.eDesignation = eDesignation;
    }

 

    public String getPosition() {
        return position;
    }

    public void setposition(String position) {
        this.position = position;
    }



    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    
    
    
}
