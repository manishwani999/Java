package com.coreJava.pack11_ExceptionHandling.customExceptions;

public class Main extends BankAccount{
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        try {
            bankAccount.withdraw(-35600);
        } catch (MinimumBalanceException e) {
            System.out.println(e.getMessage());
        }
    }
}
