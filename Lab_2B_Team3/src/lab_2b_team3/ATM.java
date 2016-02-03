
package lab_2b_team3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ATM {
    
    private ArrayList<PersonalChecking> checkingList;
    private ArrayList<PersonalSaving> savingList;
    private ArrayList<Commercial> commercialList;
    private Scanner in = new Scanner(System.in);
    
    
    public ATM(ArrayList<PersonalChecking> checkingList,ArrayList<PersonalSaving> savingList ,ArrayList<Commercial> commercialList)
    {
        this.checkingList = checkingList;
        this.savingList = savingList;
        this.commercialList = commercialList;
        //
    }
    
    public void accessMenu()
    {
        System.out.println("Available accounts: ");
        for(PersonalChecking pc : checkingList)
        {
            System.out.println(pc.getAccountNumber());
        }
        for(PersonalSaving ps : savingList)
        {
            System.out.println(ps.getAccountNumber());
        }
        for(Commercial c : commercialList)
        {
            System.out.println(c.getAccountNumber());
        }
        System.out.println("Type account number to access or [exit] to exit");
        
        String input = in.next();
        String pinInput;
        if(input.equalsIgnoreCase("exit"))
        {System.out.println("Exiting to main bank menu");
            return;
        }
        try{
        for(PersonalChecking pc : checkingList)
        {
            
            if(Integer.parseInt(input)==pc.getAccountNumber())
            {
                System.out.println("Enter PIN");
                pinInput = in.next();
                try{
                    if(Integer.parseInt(pinInput)==pc.getPin())
                    {
                        accountMenu(pc,null,null,pc.getFirstName()+" "+pc.getLastName());
                    }
                    else
                    {
                        System.out.println("Incorrect PIN!\n\n");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("PIN entered incorrectly!\n\n");
                    accessMenu();
                }
            }
        }
        for(PersonalSaving ps : savingList)
        {
            if(Integer.parseInt(input)==ps.getAccountNumber())
            {
                System.out.println("Enter PIN");
                pinInput = in.next();
                try{
                    if(Integer.parseInt(pinInput)==ps.getPin())
                    {
                        accountMenu(null,ps,null,ps.getFirstName()+" "+ps.getLastName());
                    }
                    else
                    {
                        System.out.println("Incorrect PIN!\n\n");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("PIN entered incorrectly!\n\n");
                    accessMenu();
                }
            }
        }
        for(Commercial c : commercialList)
        {
            if(Integer.parseInt(input)==c.getAccountNumber())
            {
                System.out.println("Enter PIN");
                pinInput = in.next();
                try{
                    if(Integer.parseInt(pinInput)==c.getPin())
                    {
                        accountMenu(null,null,c,c.getBusinessName());
                    }
                    else
                    {
                        System.out.println("Incorrect PIN!\n\n");
                    }
                }
                catch(Exception e)
                {
                    System.out.println("PIN entered incorrectly!\n\n");
                    accessMenu();
                }
            }
        }
        
        }
        
        catch(Exception e)
        {
            System.out.println("Not a valid input!");
            accessMenu();
        }
        
        
        accessMenu();
                
        
    }
    
    
    public void accountMenu(PersonalChecking pc, PersonalSaving ps, Commercial c, String name) throws IOException
    {
        System.out.println("");
        System.out.println("Welcome "+name);
        System.out.println("Choose options:");
        System.out.println("1. Check Balance");
        System.out.println("2. Make Withdrawal");    
        System.out.println("3. Make Deposit");
        System.out.println("4. Get Account Info");
        System.out.println("[Exit]");
        String input = in.next();
        if(input.equalsIgnoreCase("exit"))
        {
            System.out.println("Exiting to main bank menu");
            return;
        }
        else if (input.equals("1"))
        {
            checkBalance(pc,ps,c);
        }
        else if (input.equals("2"))
        {
            makeWithdrawal(pc,ps,c);
        }
        else if (input.equals("3"))
        {
            makeDeposit(pc,ps,c);
        }
        else if (input.equals("4"))
        {
            if(!(pc == null))
            {
                pc.displayInfo();
            }
            else if(!(ps == null))
            {
                ps.displayInfo();
            }
            else if(!(c == null))
            {
                c.displayInfo();
            }
            
          
            System.out.println("Press enter to continue...");
            System.in.read();
            accountMenu(pc,ps,c,"");
        }
        
                 
        else
        {
            System.out.println("Bad input! Try again, "+name);
            accountMenu(pc,ps,c,"");
        }
    }
    
    public void checkBalance(PersonalChecking pc, PersonalSaving ps, Commercial c)
    {
        if(!(pc == null))
        {
            System.out.println("Balance is: $"+pc.getBalance()+"\n");
        }
        else if(!(ps == null))
        {
            System.out.println("Balance is: $"+ps.getBalance()+"\n");
        }
        else if(!(c == null))
        {
            System.out.println("Balance is: $"+c.getBalance()+"\n");
        }
        
        try {
            System.out.println("Press enter to continue...");
            System.in.read();
            accountMenu(pc,ps,c,"");
        } catch (IOException ex) {
            Logger.getLogger(ATM.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    public void makeWithdrawal(PersonalChecking pc, PersonalSaving ps, Commercial c)
    {
        int withdrawalAmount=0;
        System.out.println("");
        System.out.println("Enter whole number amount to withdrawal");
        try{
            
            withdrawalAmount = Integer.parseInt(in.next());
        }
        catch(Exception e)
        {
            System.out.println("Bad input!");
            makeWithdrawal(pc,ps,c);
        }
        
        if(!(pc == null))
        {
            pc.setBalance(withdrawalAmount);
        }
        else if(!(ps == null))
        {
            ps.setBalance(withdrawalAmount);
        }
        else if(!(c == null))
        {
            c.setBalance(withdrawalAmount);
        }
        
        Currency currency = new Currency();
        System.out.println("The amount of $"+withdrawalAmount+" was withdrawn from your account.");
        System.out.println("The ATM hands you "+currency.getBills(withdrawalAmount));
        
        try {
            System.out.println("Press enter to continue...");
            System.in.read();
            accountMenu(pc,ps,c,"");
        } catch (IOException ex) {
            
        }
        
        
        
    }
    
    public void makeDeposit(PersonalChecking pc, PersonalSaving ps, Commercial c)
    {
        int depositAmount=0;
        System.out.println("");
        System.out.println("Enter whole number amount to deposit");
        try{
            
            depositAmount = Integer.parseInt(in.next());
        }
        catch(Exception e)
        {
            System.out.println("Bad input!");
            makeWithdrawal(pc,ps,c);
        }
        
        if(!(pc == null))
        {
            pc.setBalance(depositAmount*-1);
        }
        else if(!(ps == null))
        {
            ps.setBalance(depositAmount*-1);
        }
        else if(!(c == null))
        {
            c.setBalance(depositAmount*-1);
        }
        
        System.out.println("The amount of $"+depositAmount+" was deposited to your account.");
        try{
            System.out.println("Press enter to continue...");
            System.in.read();
            accountMenu(pc,ps,c,"");
        }
        catch(Exception e)
        {}
    }
    
    public void exit()
    {
        
    }
    
}
