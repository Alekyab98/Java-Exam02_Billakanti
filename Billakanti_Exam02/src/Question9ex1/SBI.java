/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Question9ex1;

/**
 *
 * @author Alekya Billakanti
 */
public class SBI implements Bank {
    private String branchName;

    public SBI(String branchName) {
        this.branchName = branchName;
    }

    @Override
    public String getAccountType() {
        return "Savings";
    }

    @Override
    public String toString() {
     return "SBI" + "\nRate of Interest is: "+Bank.RATEOFINTEREST+"\nBranch Name: " 
                + branchName+
               "\nAccount Type: "+getAccountType() ;
    }

    
}
