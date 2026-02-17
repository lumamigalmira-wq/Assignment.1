class BankAccount {
    private String accountNumber;
    private String accountHolder;
    private double balance;

    // Constructor
    public BankAccount(String accountNumber, String accountHolder, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    // Deposit method
    public void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful!");
    }

    // Withdraw method
    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal Successful!");
        } else {
            System.out.println("Insufficient Balance!");
        }
    }

    // Display balance
    public void displayBalance() {
        System.out.printf("Current Balance: %.2f\n", balance);
    }
}

public class BankMain {
    public static void main(String[] args) {

        BankAccount account = new BankAccount("123456789", "Maria Santos", 5000.00);

        account.deposit(1000.00);
        account.withdraw(1500.00);
        account.displayBalance();
    }
}
