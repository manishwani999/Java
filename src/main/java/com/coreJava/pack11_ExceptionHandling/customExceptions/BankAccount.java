package com.coreJava.pack11_ExceptionHandling.customExceptions;

public class BankAccount {
    int balance = 40000;
    void withdraw(int amount) throws MinimumBalanceException {
        if (amount <= 0) {
            throw new InvalidWithdrawAmountException("Withdraw amount must be greater than 0.");
        }
        if (balance - amount < 5000) {
            throw new MinimumBalanceException("Minimum balance is less than 5000");
        } else {
            balance -= amount;
            System.out.println("Withdraw Successful");
            System.out.println("Balance: " + balance);
        }
    }
}
