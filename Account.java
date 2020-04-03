public class Account {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public boolean deposit(double amount)
    {
        this.balance += amount;
        return true;
    }

    public boolean withdrawn (double amount)
    {
        if (this.balance>amount)
        {
            this.balance -= amount;
            return true;
        }
        else
        {
            System.out.println("Amount Exceeded");
            return false;
        }
    }


}
