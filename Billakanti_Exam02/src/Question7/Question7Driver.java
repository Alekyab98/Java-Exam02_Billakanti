/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7;

import java.util.Scanner;

/**
 *
 * @author Alekya Billakanti
 */
public class Question7Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        System.out.println("Output for Question7 Alekya Billakanti");
        System.out.println("black");
        System.out.println("white");
        System.out.println("red");
        System.out.println("blue");
        System.out.println("Enter the color from above " + "rgb value");
        String colorSelected = scan.next().toUpperCase();
        while (!colorSelected.equals("BLACK")
                && !colorSelected.equals("WHITE")
                && !colorSelected.equals("RED")
                && !colorSelected.equals("BLUE")) {
            System.out.println("Enter the colors from above list.");
            colorSelected=scan.next().toUpperCase();
        }
        System.out.println("Rgb value for Color selected "+
                colorSelected.toUpperCase()+"is"+
                Color.valueOf(colorSelected).getColor());
        
    }

}
