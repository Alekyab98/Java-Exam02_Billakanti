/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class Hospital implements Doctor{

    public Hospital() {
    }

    @Override
    public String specialization() {
       return "cardiologist";
    }

    @Override
    public String toString() {
        return "Hospital" + "Doctor specialization: "+specialization();
    }
}
