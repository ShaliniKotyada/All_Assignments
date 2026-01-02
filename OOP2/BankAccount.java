class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(double balance, double amount) {
        super("Insufficient Balance " + balance + " for withdrawal of " + amount);
    }
}


public class BankAccount{
    private double balance;
    public BankAccount(double balance) {
        this.balance = balance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException(balance, amount);
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Balance: " + balance);
    }

    public static void main(String[] args) {
        BankAccount acc= new BankAccount(3000);

        try {
            acc.withdraw(5000);

        } catch (InsufficientBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
