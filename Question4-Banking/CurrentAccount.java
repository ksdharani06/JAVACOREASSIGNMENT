class CurrentAccount extends Account {

    double overdraftLimit = 5000;

    public CurrentAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

  
    @Override
    public void withdraw(double amount) {
        if (balance - amount >= -overdraftLimit) {
            balance = balance - amount;
            System.out.println("Current Withdraw: " + amount);
        } else {
            System.out.println("limit exceeded.");
        }
    }

    @Override
    double calculateInterest() {
        return 0;
    }
}
