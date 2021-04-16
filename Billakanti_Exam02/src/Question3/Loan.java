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
public class Loan {
    public String LoanName;
    public double interestPercent;
    public int timeperiod;

    public Loan(String LoanName, double interestPercent, int timeperiod) {
        this.LoanName = LoanName;
        this.interestPercent = interestPercent;
        this.timeperiod = timeperiod;
    }

    public String getLoanName() {
        return LoanName;
    }

    public double getInterestPercent() {
        return interestPercent;
    }

    public int getTimeperiod() {
        return timeperiod;
    }

    @Override
    public String toString() {
        return  "LoanName: " + LoanName + ", \ninterestPercent: " + interestPercent + ", \ntimeperiod: " + timeperiod ;
    }
    
}
