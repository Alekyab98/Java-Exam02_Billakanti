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
public class Triangle extends GeometricObject {

    private double s1;
    private double s2;
    private double s3;

    public Triangle(double s1, double s2, double s3,
            String color, boolean colorFilled) {
        super(color, colorFilled);
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
    }

    @Override
    public double clacArea() {
        double temp = calcPerimeter()/2;
        return Math.round(Math.sqrt(temp*(temp-s1)*
                (temp-s2)*(temp-s3))*100)/100.0;
        
    }

    @Override
    public double calcPerimeter() {
        return Math.round((s1 + s2 + s3) * 100) / 100.0;
    }

    @Override
    public String toString() {
    return "\nArea: "+ this.clacArea() +"\nPerimeter: " +this.calcPerimeter()+ 
            "\nColor: "+ super.getColor()+"\nColor filled : "+super.isColorFilled();
    }
    

}
