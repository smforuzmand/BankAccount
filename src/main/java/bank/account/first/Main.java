package org.example;

public class Main {
    public static void main(String[] args){
        Customer justin1 =new Customer("justin1","jj@gmail.com",
                "12345678",new Address("gatan","4566","malmö","Svergie"));
        BankAccount justin1account = new BankAccount(1000,justin1);
        justin1account.deposit(3000);
        justin1account.withdraw(200);
        //System.out.println(customer1);
        System.out.println(justin1account.toString());

    }
}