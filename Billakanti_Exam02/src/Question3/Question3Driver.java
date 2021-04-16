/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Alekya Billakanti
 */
public class Question3Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Object> newList = new ArrayList<>();
        String str1="NWMSU";
        Date dob= new Date(1998, 06, 05);
        Loan l1 = new Loan("Educational loan",3.6,4);
        Circle c1 = new Circle(2.5);
        newList.add(str1);
        newList.add(dob);
        newList.add(l1);
        newList.add(c1);
        for(int i=0;i<newList.size();i++){
            System.out.println(newList.get(i));
            System.out.println("***********");
            
        }
        
        
    }
    
}
