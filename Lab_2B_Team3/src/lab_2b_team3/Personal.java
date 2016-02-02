/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2b_team3;

import java.util.Date;

/**
 *
 * @author greg
 */
public class Personal extends BankAccount{
    private String firstName = "";
    private String lastName = "";
    private Date dateOfBirth;

    /**
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @return the dateOfBirth
     */
    public Date getDateOfBirth() {
        return dateOfBirth;
    }
    
    
}
