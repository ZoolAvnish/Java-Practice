package com.example.test;

import java.util.ArrayList;

public class Account {
    public String accountName;
    int balance=0;
    public ArrayList<Integer> transaction;

    public Account(String accountName) {
        this.accountName = accountName;
        this.transaction = new ArrayList<Integer>();
    }

    // getter of balance

    public int getBalance() {
        return balance;
    }

    // deposit function
    public void deposit(int amount){
        if(amount>0){
            this.transaction.add(amount);
            this.balance+=amount;
            System.out.println(amount+" deposited. Balance is now "+this.balance);
        }
        else
            System.out.println("Cannot deposit");
    }

    //withdraw function
    public void withdraw(int amount){
        int withdrawl = -amount;
        if (withdrawl<0){
            this.transaction.add(withdrawl);
            this.balance+=withdrawl;
            System.out.println("Amount withdrawm. Balance is now "+this.balance);
        }
        else{
            System.out.println("Cannot withdraw negative sums.");
        }
    }

    // now function for calculating balance
    public void calculateBalance(){
        this.balance=0;
        for (int i:this.transaction){
            this.balance+=i;
        }
        System.out.println("Calculated balance is "+this.balance);
    }
}
