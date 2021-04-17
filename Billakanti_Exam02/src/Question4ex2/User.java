/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class User extends Media{
    private int noOfFollowers;

    public User(int noOfFollowers, String mediaName) {
        super(mediaName);
        this.noOfFollowers = noOfFollowers;
    }

    @Override
    public String toString() {
        return super.toString()+ "\nnoOfFollowers=" + noOfFollowers ;
    }
    
    
    
}
