/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question6;

import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class Question6Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        boolean b = false;
        double side1 = 0, side2 = 0, side3 = 0;
        do {
            b = false;
            System.out.println("Enter s1 of Triangle: ");
            side1 = scan.nextDouble();
            System.out.println("Enter s2 of Triangle: ");
            side2 = scan.nextDouble();
            System.out.println("Enter s3 of Triangle: ");
            side3 = scan.nextDouble();
            if (side1 + side2 <= side3 || side2 + side3 <= side1 || side3 + side1 <= side2) {
                System.out.println("sum of any two sides in triangle should be "
                        + "greater than the other side, enter again");
                b = true;
            }
        } while (b == true);
        Triangle t1 = new Triangle(side1, side2, side3, "blue", true);
        System.out.println(t1);
    }

}
