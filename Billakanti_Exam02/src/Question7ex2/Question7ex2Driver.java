/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question7ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class Question7ex2Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for (ottPlatform s:ottPlatform.values()) {
            System.out.println("Selected ott platform is "+
                    s +" is "+ s.getNoOfMovies());
        }
    }
    
}
