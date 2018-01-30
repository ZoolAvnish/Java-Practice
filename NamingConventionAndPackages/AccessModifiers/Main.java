package com.example.test;

public class Main {

    public static void main(String[] args) {
	// now it's time for access modifier
        Account mine = new Account("Bikash");
        mine.deposit(1000);
        mine.withdraw(500);
        mine.withdraw(-200);
        mine.deposit(20);
        mine.calculateBalance();


        System.out.println("Balance account is "+mine.getBalance());
    }
}
