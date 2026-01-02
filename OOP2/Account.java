interface AccountOperation{
    void deposit(double amount);
    double getBalance();
}
class Account implements AccountOperation{
    private double balance;

    public void deposit(double amount){
        balance+=amount;
    }

    public double getBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account acc=new Account();
        acc.deposit(5000);
        System.out.println("Balance: "+acc.getBalance());
    }
}
