package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// challenge question by Udemy instructor
        bankAccount bikash = new bankAccount();

        //instead of setting all the parameters differently, we can call at once with the help of constructors.
        bankAccount bilash = new bankAccount("Bilash Gurung","bilash.grg@gmail.com",
                "9915119656","23423254534",20000);
        System.out.println("Balance of Bilash is "+bilash.getBalance());
        System.out.println("Email of Bilash is "+bilash.geteMail());

        // setting all the parameters (it's a lengthy process for many number of users.)
        // that's why try to use constructor with parameter
        bikash.setBalance(0.00);
        bikash.setAccount("389474422");
        bikash.setCustomerName("Bikash Gurung");
        bikash.seteMail("bikash.grg2222@gmai.com");
        bikash.deposit(2000);
        bikash.deposit(50000);
        bikash.withdraw(52000);
    }
}
