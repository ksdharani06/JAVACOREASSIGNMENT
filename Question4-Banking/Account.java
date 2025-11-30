abstract class Account {

  
    String accountHolderName;
    double balance;


    public Account(String accountNumber, String accountHolderName, double balance) {
    
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        System.out.println("Deposited: " + amount);
    }

 
    public void withdraw(double amount) {
        balance = balance - amount;
    }


    public double getBalance() {
        return balance;
    }

    
    abstract double calculateInterest();
}
