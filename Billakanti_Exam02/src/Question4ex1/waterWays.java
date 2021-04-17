/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question4ex1;

/**
 *
 * @author Alekya Billakanti
 */
public class waterWays extends Transport{
    private String distance;

    public waterWays(String distance, String modeOfTransport, String vehicleUsed) {
        super(modeOfTransport, vehicleUsed);
        this.distance = distance;
    }

    @Override
    public String toString() {
        return "\nwaterWays"+ super.toString()
                + "\ndistance: " + distance ;
    }
    
    
}
