/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2b_team3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author greg
 */
public class Bank {
    private String bankName;
    private ArrayList<PersonalChecking> checking = new ArrayList<>();
    private ArrayList<PersonalSaving> saving = new ArrayList<>();
    private ArrayList<Commercial> commercial = new ArrayList<>();
    private Scanner in = new Scanner(System.in);
    private ATM atm;
    
    public Bank()
    {
        System.out.println("Welcome to the bank!");
        optionsMenu();
    }
    
    
    public void optionsMenu()
    {
        System.out.println("Select an option from the menu: ");
        System.out.println("1. Create a Checking Account");
        System.out.println("2. Create a Savings Account");
        System.out.println("3. Create a Commercial Account");
        System.out.println("4. Access ATM to Withdrawal, Deposit, Check Balance");
        String input = in.next();
        if(input.equals("1"))
        {
            createChecking();
        }
        else if(input.equals("2"))
        {
            createSaving();
        }
        else if(input.equals("3"))
        {
            createCommercial();
        }
        else if(input.equals("4"))
        {
            ATM atm = new ATM(checking, saving, commercial);
            
            atm.accessMenu();

        }
        else
        {
            System.out.println("Bad input!\n");
        }
        optionsMenu();
    }
    

    
    public void createChecking()
    { 
        String first=""; String last=""; String date=""; int pin=1234;
        System.out.println("Enter your first name: ");
        first = in.next();
        System.out.println("Enter your last name: ");
        last = in.next();
        System.out.println("Enter your date of birth: ");
        date = in.next();
        System.out.println("Enter a 4 Digit PIN");
        try{
            pin = in.nextInt();
            if(!(pin>999&&pin<10000))
            {
                System.out.println("Not four digits! Let's start over");
                createChecking();
            }
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createChecking();
        }
        checking.add(new PersonalChecking(first,last,date,pin));
        System.out.println("Account Created! ");
        System.out.println("Please write down your account information: ");
        System.out.println("Account number is: "+checking.get(checking.size()-1).getAccountNumber());
        System.out.println("PIN is: "+pin);
        
    }
    
    public void createSaving()
    {
        String first=""; String last=""; String date=""; int pin=1234;
        System.out.println("Enter your first name: ");
        first = in.next();
        System.out.println("Enter your last name: ");
        last = in.next();
        System.out.println("Enter your date of birth: ");
        date = in.next();
        System.out.println("Enter a 4 Digit PIN");
        try{
            pin = in.nextInt();
            if(!(pin>999&&pin<10000))
            {
                System.out.println("Not four digits! Let's start over");
                createChecking();
            }
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createChecking();
        }
        saving.add(new PersonalSaving(first,last,date,pin));
        System.out.println("Account Created! ");
        System.out.println("Please write down your account information: ");
        System.out.println("Account number is: "+saving.get(saving.size()-1).getAccountNumber());
        System.out.println("PIN is: "+pin);
    }
    
    public void createCommercial()
    {
        String name;
        int pin=1234;
        System.out.println("Enter your business name: ");
        name = in.next();
        System.out.println("Enter a 4 Digit PIN");
        try{
            pin = in.nextInt();
            if(!(pin>999&&pin<10000))
            {
                System.out.println("Not four digits! Let's start over");
                createChecking();
            }
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createChecking();
        }
        commercial.add(new Commercial(name,pin));
        System.out.println("Account Created! ");
        System.out.println("Please write down your account information: ");
        System.out.println("Account number is: "+commercial.get(commercial.size()-1).getAccountNumber());
        System.out.println("PIN is: "+pin);
    }
}
