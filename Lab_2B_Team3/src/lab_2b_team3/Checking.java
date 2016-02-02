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
public class Checking extends Personal{
    private double balance;
    private double maxWithdrawal;

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
    
}
