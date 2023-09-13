package entities;

public class Account {

    private String accountNumber;
    private String accountOwner;
    private double balance;

    public Account(String accountNumber, String accountOwner, double balance)
    {
        this.accountNumber = accountNumber;
        this.accountOwner = accountOwner;
        if (balance >= 0)
        {
            this.balance = balance;
        }
        else
        {
            this.balance = 0;
        }
    }

    public boolean deposit(double value)
    {
        if (value >= 0)
        {
            this.balance += value;
            return true;
        }
        else
        {
            return false;
        }
    }
    public boolean withdraw(double value)
    {
        if (value <= this.balance)
        {
            this.balance -= value;
            return true;
        }
        else
        {
            return false;
        }
    }

    @Override
    public String toString()
    {
        return "accountNumber = '" + accountNumber + '\'' +
               ", accountOwner = '" + accountOwner + '\'' +
               ", balance = " + balance;
    }

}
