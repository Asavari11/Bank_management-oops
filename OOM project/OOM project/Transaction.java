import java.io.Serializable;
import java.util.Date;


public class Transaction implements Serializable {
    private static final long serialVersionUID = 2L;
    
    private String type; 
    private double amount;
    private Date date;
    private String referenceAccount; 

    public Transaction(String type, double amount, String referenceAccount) {
        this.type = type;
        this.amount = amount;
        this.referenceAccount = referenceAccount;
        this.date = new Date();
    }

    
    public String getType() { return type; }
    public double getAmount() { return amount; }
    public Date getDate() { return date; }
    public String getReferenceAccount() { return referenceAccount; }

    @Override
    public String toString() {
        String ref = (referenceAccount == null || referenceAccount.isEmpty()) ? "" : " (Ref: " + referenceAccount + ")";
        return String.format("[%s] %-15s $%.2f%s", new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(date), type, amount, ref);
    }
}