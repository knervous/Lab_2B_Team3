/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2b_team3;

/**
 *
 * @author greg
 */
public class Saving {
    private double balance;
    private double interest;

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(double changeAmount) {
        balance = balance - changeAmount;
    }

    /**
     * @return the interest
     */
    public double getInterest() {
        return interest;
    }
    
    
}
