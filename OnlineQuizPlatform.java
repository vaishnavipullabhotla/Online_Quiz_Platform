import java.util.Scanner;
class BankAccount {
    private double balance;
    public void Account() {
        balance = 0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Amount Deposited : Rs." + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }
    public void withdrawal(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Amount Withdrawn : Rs." + amount);
        } else {
            System.out.println("Insufficient amount for the withdrawal.");
        }
    }
    public void getBalance() {
        System.out.println("Balance : Rs." + balance);
    }
}
public class OnlineQuizPlatform {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        boolean exit = false;
        BankAccount acct = new BankAccount();
        while (!exit) {
            System.out.println("Choose any option from these Banking operations :");
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Current Balance");
            System.out.println("4.Exit");
            System.out.println("Enter your choice :");
            int choice;
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the amount for deposit : ");
                    double depositAmount = sc.nextDouble();
                    acct.deposit(depositAmount);
                    break;
                case 2:
                    System.out.println("Enter the amount for withdrawing : ");
                    double withdrawAmount = sc.nextDouble();
                    acct.withdrawal(withdrawAmount);
                    break;
                case 3:
                    acct.getBalance();
                    break;
                case 4:
                    exit = true;
                    System.out.println("Exiting the program.");
                    break;
                default:
                    System.out.println("Invalid choice.");
            }
            System.out.println();
        }
        sc.close();
    }
}