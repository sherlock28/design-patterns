package prototype;

public class AccountSaving implements IAccount {

    private String type;
    private double amount;

    public AccountSaving() {
        this.type = "SAVING";
    }

    @Override
    public IAccount cloneAccount() {
        AccountSaving account = null;

        try {
            account = (AccountSaving) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return account;
    }

    @Override
    public String toString() {
        return "AccountSaving{" + "type=" + type + ", amount=" + amount + '}';
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
