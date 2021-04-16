package Question6;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alekya Billakanti
 */
public abstract class GeometricObject {
    private String color;
    private boolean colorFilled;

    public GeometricObject(String color, boolean colorFilled) {
        this.color = color;
        this.colorFilled = colorFilled;
    }

    public String getColor() {
        return color;
    }

    public boolean isColorFilled() {
        return colorFilled;
    }
    
    public abstract double clacArea();
    public abstract double calcPerimeter();
   
    
}
