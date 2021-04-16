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
public class Faculty extends Employee {
    private double officeHours;
    private int noOfteachingSubjects;

    public Faculty(double officeHours, int noOfteachingSubjects, String office, double salary, Date dateHired, String name, String address, String phoneNumber, String email) {
        super(office, salary, dateHired, name, address, phoneNumber, email);
        this.officeHours = officeHours;
        this.noOfteachingSubjects = noOfteachingSubjects;
    }

    public double getOfficeHours() {
        return officeHours;
    }

    public int getNoOfteachingSubjects() {
        return noOfteachingSubjects;
    }

    @Override
    public String toString() {
        return "Faculty: "+ "\nname: " + super.getName();
                }
    
    
}
