import java.util.ArrayList;

public class BankingSystem {
    public static void main(String[] args) {

        ArrayList<Account> accounts = new ArrayList<>();

        // 3 Savings Accounts
        accounts.add(new SavingsAccount("01", "Ravi", 5000));
        accounts.add(new SavingsAccount("02", "Anita", 3000));
        accounts.add(new SavingsAccount("03", "Kiran", 7000));

        // 2 Current Accounts
        accounts.add(new CurrentAccount("C01", "Meena", 2000));
        accounts.add(new CurrentAccount("C02", "Rahul", 1000));


        for (Account acc : accounts) {
            acc.deposit(1000);
            acc.withdraw(2000);
            System.out.println("Balance: " + acc.getBalance());
            System.out.println("------------------");
        }
        System.out.println();
        System.out.println("Interest Details:");
        for (Account acc : accounts) {
            System.out.println(
                acc.accountHolderName + " Interest: " + acc.calculateInterest()
            );
        }
    }
}
