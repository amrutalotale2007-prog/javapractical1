package javaapplication6;

class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}

class InvalidDepositException extends Exception {
    public InvalidDepositException(String message) {
        super(message);
    }
}

class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        if (initialBalance < 0) {
            balance = 0;
        } else {
            balance = initialBalance;
        }
    }

    public void deposit(double amount) throws InvalidDepositException {
        if (amount <= 0) {
            throw new InvalidDepositException("Deposit amount must be greater than zero.");
        }
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            throw new InsufficientBalanceException("Insufficient balance.");
        }
        balance -= amount;
        System.out.println("Withdrawn: " + amount);
    }

    public double getBalance() {
        return balance;
    }
}

public class JavaApplication6 {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(1000);

        try {
            System.out.println("Initial Balance: " + account.getBalance());

            account.deposit(500);
            System.out.println("Balance after deposit: " + account.getBalance());

            account.withdraw(300);
            System.out.println("Balance after withdrawal: " + account.getBalance());

            account.deposit(-100);

        } catch (InvalidDepositException e) {
            System.out.println("Deposit Error: " + e.getMessage());
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }

        try {
            account.withdraw(5000);
        } catch (InsufficientBalanceException e) {
            System.out.println("Withdrawal Error: " + e.getMessage());
        }

        System.out.println("Final Balance: " + account.getBalance());
    }
}