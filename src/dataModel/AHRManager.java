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
public class AHRManager extends Employee {

    
    

    public AHRManager() {
    }

    public AHRManager(String eName, String password, String email, String position) {
        super(eName, password, email, position);
    }
    

    //Polymorphism (Method Overriding)
    public String salaryCalculation() {
        int salary = 25000;
        int transportAllowance = 5000;
        int foodAllowence = 1000;
        int increment = 5000;
        int total = salary + transportAllowance + foodAllowence + increment;
        String message = "The Total Salary for HR Assistant is " + Integer.toString(total);
        return message;


}
    
}
