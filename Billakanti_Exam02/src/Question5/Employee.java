/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

import java.util.Date;

/**
 *
 * @author Alekya Billakanti
 */
public class Employee extends Person {
    private String office;
    private double salary;
    private Date dateHired;

    public Employee(String office, double salary, Date dateHired, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.office = office;
        this.salary = salary;
        this.dateHired = dateHired;
    }

    public String getOffice() {
        return office;
    }

    public double getSalary() {
        return salary;
    }

    public Date getDateHired() {
        return dateHired;
    }

    @Override
    public String toString() {
        return "Employee: "+ "\nname: " + super.getName();
    }
    
    
    
}
