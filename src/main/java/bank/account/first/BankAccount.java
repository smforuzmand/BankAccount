package org.example;

public class BankAccount {
    public static int accountNumberSequencer = 0;
    private int accountNumber;
    private double balance;

    private Customer customer;



    public BankAccount( double balance, Customer customer) {
        this.accountNumber = ++accountNumberSequencer;
        this.balance = balance;
        this.customer = customer;
    }


    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Invalid Operation");
        }
        this.balance = balance - amount;

    }


    public void deposit(double amount) {
        this.balance = balance + amount;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", balance=" + balance +
                ", customer=" + customer +
                '}';
    }
}


