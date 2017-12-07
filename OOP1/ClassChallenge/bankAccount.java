package com.bikashgurung;

public class bankAccount {
    private double balance;
    private String customerName, eMail, phone, account;

    public bankAccount(){

        System.out.println("Empty constructor called.");
    };
    public bankAccount(String customerName, String eMail, String phone, String account, double balance){
        System.out.println("Account created with the help of constructor.");
        this.customerName = customerName;
        this.eMail = eMail;
        this.phone = phone;
        this.account = account;
        this.balance = balance;
    }

    public void deposit(double depositAmount){
        this.balance += depositAmount;
        System.out.println("Deposit of "+depositAmount+" done. New balance is "+this.balance);
    }
    public void withdraw(double withdrawAmount){
        if((this.balance - withdrawAmount) <0){
            System.out.println("Only "+balance+" available. Withdrawal not processed.");
        }
        else{
            this.balance-=withdrawAmount;
            System.out.println("Withdrawal of "+withdrawAmount+" processed. Remaining balance is "+this.balance);
        }
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }
}
