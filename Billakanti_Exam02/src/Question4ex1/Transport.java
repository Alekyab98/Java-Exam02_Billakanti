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
public class Transport {
    private String modeOfTransport;
    private String vehicleUsed;

    public Transport(String modeOfTransport, String vehicleUsed) {
        this.modeOfTransport = modeOfTransport;
        this.vehicleUsed = vehicleUsed;
    }

    public String getModeOfTransport() {
        return modeOfTransport;
    }

    public String getVehicleUsed() {
        return vehicleUsed;
    }

    @Override
    public String toString() {
        return "Transport" + "\nmode Of Transport: " + modeOfTransport 
                + " \nvehicle Used: " + vehicleUsed ;
    }
    
}
