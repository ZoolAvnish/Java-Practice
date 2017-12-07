package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// challenge question of constructor
        vipCustomer cus1 = new vipCustomer();
        vipCustomer cus2 = new vipCustomer("Bilash","bilash.grg222@gmail.com");
        vipCustomer cus3 = new vipCustomer("Puran","purangamil.com",10000);

        System.out.println("Name is "+cus1.getName());
        System.out.println("Name is "+cus2.getName());
        System.out.println("Name is "+cus3.getName());
    }
}
