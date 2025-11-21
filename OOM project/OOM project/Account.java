import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class Account implements Serializable {
    private static final long serialVersionUID = 2L;

    private String accountNumber;
    private String accountHolderName;
    private double balance;
    private int pin;
    private List<Transaction> history;

    public Account(String accountHolderName, int pin, double initialDeposit) {
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = initialDeposit;
        this.history = new ArrayList<>();
        this.accountNumber = String.valueOf(100000 + new Random().nextInt(900000));
    }

    public String getAccountNumber() { return accountNumber; }
    public String getAccountHolderName() { return accountHolderName; }
    public double getBalance() { return balance; }
    public int getPin() { return pin; }
    public List<Transaction> getHistory() { return history; }
    
    
    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void addTransaction(Transaction transaction) {
        this.history.add(transaction);
    }
}