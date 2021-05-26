package pp3;

public class Account {
    //private attributes
    protected int balance;
    protected int deposit;
    protected int accountNumber;
    public static int numberOfAccounts = 0;

    //default constructor
    public Account() {
        Account.numberOfAccounts += 1;
        this.balance = 0;
        this.accountNumber = Account.numberOfAccounts;
    } //parametrized constructor

    public Account(int balance) {
        Account.numberOfAccounts += 1;
        this.balance = balance;
        this.accountNumber = numberOfAccounts;
    }//setters and getters functions

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return balance;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    //Overriding the method toString
    @Override
    public String toString() {
        return "Account Number: " + accountNumber + " Balance: " + balance;
    }

    public boolean withdraw(int howmuch) {
        if (howmuch <= balance) {
            balance -= howmuch;
            return true;
        } else {
            System.out.println("not enough balance");
            return false;
        }

    }
    public void deposit(int amount) {
        balance += amount;
    }

}

//child class from Account
class SpecialAccount extends Account {
    //parametrized constructor
    public SpecialAccount() {
        super();
    }

    public SpecialAccount(int balance) {
        super(balance);
    }

    //Overriding the method toString
    @Override
    public boolean withdraw(int howmuch) {
        if ((balance - howmuch) >= -1000) {
            balance -= howmuch;
            return true;
        } else {
            System.out.println("balance can't be less than -1000");
            return false;
        }
    }
}
