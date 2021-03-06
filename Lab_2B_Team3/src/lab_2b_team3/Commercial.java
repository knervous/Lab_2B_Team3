
package lab_2b_team3;


public class Commercial extends BankAccount


    {
    
    private String businessName;
    
    public Commercial(String businessName, int pin)
    {
        super(pin);
        this.businessName = businessName;
    }
    
    

    public void setBalance(int changeAmount) {
        balance = balance - changeAmount;
    }
    
    public String getBusinessName()
    {
        return businessName;
    }

    @Override
    public int getAccountNumber() {
        return accountNumber;
    }

    @Override
    public double getBalance() {
        return balance;
    }

    @Override
    public String getJoinDate() {
        return joinDate;
    }

    @Override
    public int getPin() {
        return pin;
    }
    
    @Override
    public void displayInfo() {
        System.out.println("Name of business: "+businessName);
        System.out.println("Date of account creation: "+joinDate);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: Commercial");
        System.out.println("");
    }
    
    
}
