class SavingsAccount extends Account {

    double interestRate = 0.04; //4%
    double minimumBalance = 1000;

    public SavingsAccount(String accNo, String name, double balance) {
        super(accNo, name, balance);
    }

    @Override
    public void withdraw(double amount) {
        if (balance - amount >= minimumBalance) {
            balance = balance - amount;
            System.out.println("Savings Withdraw: " + amount);
        } else {
            System.out.println("Cannot withdraw. Minimum balance required.");
        }
    }


    @Override
    double calculateInterest() {
        return balance * interestRate;
    }
}
