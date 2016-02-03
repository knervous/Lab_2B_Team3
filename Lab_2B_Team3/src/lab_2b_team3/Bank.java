/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_2b_team3;

import java.text.DecimalFormat;
import java.text.NumberFormat;
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
        String first=""; String last=""; String date="";
        String pin="";
        int pinInt=0;
        
        System.out.println("Enter your first name: ");
        first = in.next();
        System.out.println("Enter your last name: ");
        last = in.next();
        System.out.println("Enter your date of birth: ");
        date = in.next();
        System.out.println("Enter a 4 Digit PIN");
        try{
            pin = "";
            pin = in.next();
            pinInt = Integer.parseInt(pin);
            if(!(pinInt>-1&&pinInt<10000)||!(pin.length()==4))
            {
                System.out.println("Not four digits! Let's start over");
                createChecking();
            }
            else{
                checking.add(new PersonalChecking(first,last,date,pinInt));
                System.out.println("Account Created! ");
                System.out.println("Please write down your account information: ");
                System.out.println("Account number is: "+checking.get(checking.size()-1).getAccountNumber());
                System.out.println("PIN is: "+pinInt);
            }
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createChecking();
        }
        
        
    }
    
    public void createSaving()
    {
       
        String first=""; String last=""; String date=""; 
        
        String pin="";
        int pinInt=0;
        
        System.out.println("Enter your first name: ");
        first = in.next();
        System.out.println("Enter your last name: ");
        last = in.next();
        System.out.println("Enter your date of birth: ");
        date = in.next();
        System.out.println("Enter a 4 Digit PIN");
        
        try{
            
            
            pin = in.next();
            pinInt = Integer.parseInt(pin);
            if(!(pinInt>-1&&pinInt<10000)||!(pin.length()==4))
            {
                System.out.println("Not four digits! Let's start over");
                createSaving();
            }
            else
            {
                saving.add(new PersonalSaving(first,last,date,pinInt));
                System.out.println("Account Created! ");
                System.out.println("Please write down your account information: ");
                System.out.println("Account number is: "+saving.get(saving.size()-1).getAccountNumber());
                System.out.println("PIN is: "+pinInt);
            }
            
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createSaving();
        }
        
    }
    
    public void createCommercial()
    {
        String name;
        String pin="";
        int pinInt=0;
        
        
        
        
        System.out.println("Enter your business name: ");
        name = in.next();
        System.out.println("Enter a 4 Digit PIN");
        try{
            
            
            pin = in.next();
            pinInt = Integer.parseInt(pin);
            if(!(pinInt>999&&pinInt<10000)||!(pin.length()==4))
            {
                System.out.println("Not four digits! Let's start over");
                createCommercial();
            }
            else{
                commercial.add(new Commercial(name,pinInt));
                System.out.println("Account Created! ");
                System.out.println("Please write down your account information: ");
                System.out.println("Account number is: "+commercial.get(commercial.size()-1).getAccountNumber());
                System.out.println("PIN is: "+pinInt);
            }
        }
        catch(Exception e)
        {
            System.out.println("Bad PIN entered! Let's start over");
            createCommercial();
        }
  
    }
}
