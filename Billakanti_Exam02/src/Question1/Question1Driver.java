/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class Question1Driver {
    private static ArrayList<Integer> nodupsList = new ArrayList<>();
    
    public static void removeDuplicate(ArrayList<Integer> list)
    {
       for(Integer i: list)
       {
          if(!nodupsList.contains(i))
          {
              nodupsList.add(i);
          }
       }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> newList = new ArrayList<>();
        System.out.println("Answer for Question 1 : Alekya Billakanti");
        System.out.print("Enter ten integers: ");
        Scanner scanner = new Scanner(System.in);
        for(int i=0;newList.size()<10;i++)
        {
            newList.add(scanner.nextInt());
        }
        removeDuplicate(newList);
        System.out.print("The distinct integers are ");
        for(Integer a: nodupsList){
            System.out.print(a + " ");
        }
        
    }
    
}
