/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question8ex2;

/**
 *
 * @author Alekya Billakanti
 */
public class Addition extends Calculation{

    public Addition(int n1, int n2) {
        super(n1, n2);
    }

    @Override
    public int sumCalc() {
        return this.getN1()+this.getN2();
    }

    @Override
    public String toString() {
        return "Addition" + "sum of two numbers is: " +sumCalc();
    }
    
    
}
