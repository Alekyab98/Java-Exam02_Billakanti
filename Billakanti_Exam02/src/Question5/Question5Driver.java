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
public class Question5Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Person p1= new Person("Alekya","1215w village o", "8019434216", 
                "alekya@gmail.com");
        Student s1= new Student(3.5, "Priyanka", "Horizons","9065734234" ,
                "priyanka@gmail.com");
 
        Employee e1=new Employee("Infosys", 15000,new Date() ,
                "Sunayana", "Parkway", "8686355535", "sunayana@gmail.com");
        Faculty f1=new Faculty(4, 2, "Accenture", 300000,new Date(),"Sameeksha",
                "North Redge", "845237894", "sameeksha@gmail.com");
        Staff s2 = new Staff("Dr", "TCS",45000, new Date(),"Chitra","Windmills",
                "9495969579", "chitra@gmail.com");
        
        System.out.println(p1);
        System.out.println(s1);
        System.out.println(e1);
        System.out.println(f1);
        System.out.println(s2);
    }
    
}
