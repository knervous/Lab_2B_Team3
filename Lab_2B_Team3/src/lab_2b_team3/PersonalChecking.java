
package lab_2b_team3;


public class PersonalChecking extends BankAccount{
    

    private String firstName = "";
    private String lastName = "";
    private String dateOfBirth;
    
    public PersonalChecking(String firstName, String lastName, String dateOfBirth, int pin)
    {
        super(pin);
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
    }
    
    public void setBalance(int changeAmount) {
        balance = balance - changeAmount;
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
        System.out.println("Account Type: Personal Checking");
        System.out.println("");
    }


    
}
