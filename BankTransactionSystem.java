import java.util.Scanner;

class InsufficientFundsException extends Exception {
    
    public InsufficientFundsException(String message) {
        super(message);
    }
}

class BankAccount {
    @SuppressWarnings("unused")
    public final int accountNumber;
    private double balance;

    public static int totalAccounts = 0;

    public BankAccount() {
        this.accountNumber = totalAccounts;
        this.balance = 0.0;
        totalAccounts++;
    }

    public void deposit(double amount) {
        // Adds money to the account.
        if (amount < 0) {
            throw new IllegalArgumentException();
        }

        this.balance += amount;
    }

    public void withdraw(double amount) throws InsufficientFundsException {
        // Withdraws money if enough balance exists.
        if (amount < 0) {
            throw new IllegalArgumentException(); 
        } else if (amount > this.balance) {
            throw new InsufficientFundsException("No enough balance exists.");
        } else {
            this.balance -= amount;
        }
    }
}

public class BankTransactionSystem {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            BankAccount myAccount = new BankAccount();

            System.out.println("Account Created!");
            System.out.println("Account number: " + myAccount.accountNumber);

            String method;

            do {
                System.out.print("Hello how can I help you [D(deposit) / W(withdraw)]> ");
                method = scanner.nextLine();
            } while (!"W".equals(method) && !"D".equals(method));

            System.out.print("How much? ");
            double amount = scanner.nextDouble();

            try {
                if ("D".equals(method)) {
                    myAccount.deposit(amount);
                    System.out.println(amount + "$ Deposited successfuly!");
                }

                if ("W".equals(method)) {
                    myAccount.withdraw(amount);
                    System.out.println(amount + "$ Withdraw successfuly!");
                }
            } catch (IllegalArgumentException e) {
                System.out.println("Invalid amount entered.");
            } catch (InsufficientFundsException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }
}
