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
public class Check {
    private int routingNumber;
    private int checkNumber;
    private int accountNumber;
    
    public Check(String firstName, String lastName, int routingNumber, int accountNumber){
        accountNumber = this.accountNumber;
        routingNumber = this.routingNumber;
    }

    /**
     * @return the checkNumber
     */
    public int getCheckNumber() {
        return checkNumber;
    }
    
}
