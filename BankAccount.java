import java.util.Scanner;

public class BankAccount {
    private String accountNumber;
    private String accountHolderName;
    private double balance;
    public BankAccount(String accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        }
    }
    public double checkBalance() {
        return this.balance;
    }

    public void displayAccount() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder Name: " + accountHolderName);
        System.out.println("Balance: " + balance);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Account Number: ");
        String accNum = scanner.nextLine();

        System.out.print("Enter Account Holder Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Initial Balance: ");
        double initialBalance = scanner.nextDouble();
        BankAccount account = new BankAccount(accNum, name, initialBalance);
        System.out.print("Enter Deposit Amount: ");
        double depAmount = scanner.nextDouble();
        account.deposit(depAmount);
        System.out.print("Enter Withdrawal Amount: ");
        double witAmount = scanner.nextDouble();
        account.withdraw(witAmount);
        System.out.println("\n--- Final Account Details ---");
        account.displayAccount();

        scanner.close();
    }
}
