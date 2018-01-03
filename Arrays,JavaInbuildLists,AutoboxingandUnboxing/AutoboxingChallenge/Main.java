package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        Bank bank = new Bank("HDFC");

        bank.addBranch("Dehradun");
        bank.addCustomer("Dehradun","Bikash",70.0);
        bank.addCustomer("Dehradun","Bilash",88.04);
        bank.addCustomer("Dehradun","Puran",55.04);

        bank.addBranch("Jalandhar");
        bank.addCustomer("Jalandhar","Mohit",33.03);

        bank.addCustomerTransaction("Dehradun","Bikash",22.02);

        bank.listCustomers("Dehradun",false);
        bank.listCustomers("Jalandhar",false);

        if(!bank.addCustomer("Solan","Prabin",66.6)){
            System.out.println("Error Solan branch does not exist.");
        }

    }
}
