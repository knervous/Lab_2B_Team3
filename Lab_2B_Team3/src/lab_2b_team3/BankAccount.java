/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2b_team3;

import java.util.Date;

/**
 *
 * @author paul
 */
public class BankAccount {
    private int accountNumber;
    private Date joinDate;
    
    public BankAccount(double initialBalance, int accountNumber, Date joinDate){
        accountNumber = this.accountNumber;
        joinDate = this.joinDate;
    }

    /**
     * @return the accountNumber
     */
    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * @return the joinDate
     */
    public Date getJoinDate() {
        return joinDate;
    }
}
