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
public class Media {
    private String mediaName;

    public Media(String mediaName) {
        this.mediaName = mediaName;
    }

    public String getMediaName() {
        return mediaName;
    }

    @Override
    public String toString() {
        return  "\nmediaName: " + mediaName ;
    }
    
    
    
    
}
