/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question3;

/**
 *
 * @author Alekya Billakanti
 */
public class Circle {
    public double radius;
    public double area;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }
    public double calcArea(){
        return Math.round(Math.PI*radius*radius);
    }

    @Override
    public String toString() {
        return  "radius: " + radius + "\narea: " +this.calcArea();
    }
    
}
