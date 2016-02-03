
package lab_2b_team3;


public class PersonalSaving extends BankAccount{
    
    private double interest;
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    
    public PersonalSaving(String firstName, String lastName, String dateOfBirth, int pin)
    {
        super(pin);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        System.out.println(joinDate);
    }

    public void setBalance(int changeAmount) {
        balance = balance - changeAmount;
    }

    public double getInterest() {
        return interest;
    }
    
    public String getFirstName()
    {
        return firstName;
    }
    
    public String getLastName()
    {
        return lastName;
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
        System.out.println("Name of account holder: "+firstName+" "+lastName);
        System.out.println("Date of account creation: "+joinDate);
        System.out.println("Date of birth: "+dateOfBirth);
        System.out.println("Account Number: "+accountNumber);
        System.out.println("Account Type: Personal Savings");
        System.out.println("");
    }

    
}
