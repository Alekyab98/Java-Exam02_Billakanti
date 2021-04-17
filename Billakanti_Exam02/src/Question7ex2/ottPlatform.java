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
public enum ottPlatform {
    NETFLIX(1000),AMAZON_PRIME(800),AHA(400),HOTSTAR(300);
    private int noOfMovies;

    private ottPlatform(int noOfMovies) {
        this.noOfMovies = noOfMovies;
    }

    public int getNoOfMovies() {
        return noOfMovies;
    }

   
    
}
