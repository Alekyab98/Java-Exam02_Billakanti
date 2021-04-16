/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question5;

/**
 *
 * @author Alekya Billakanti
 */
public class Student extends Person{
    public double grade;
    public final static String CLASS_STATUS = "Graduate";

    public Student(double grade, String name, String address, String phoneNumber, String email) {
        super(name, address, phoneNumber, email);
        this.grade = grade;
    }

  

    public double getGrade() {
        return grade;
    }

    @Override
    public String toString() {
        return "Student: "+ "\nname: " + super.getName();
    }
    
}
