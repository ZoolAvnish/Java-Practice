package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// now calling the base Hamburger class
        Hamburger ham = new Hamburger("Basic","wheat","bacon",44.5);
        ham.getAddition1("cabbage");
        ham.getAddition2("spinach");
        ham.getAddition3("tomato");
        System.out.println("Total price is "+ham.getTotalPrice());

        // now its time for calling healthy hamburger
        healthyBurger healthyBurger = new healthyBurger("bacon",5.50);
        healthyBurger.getadd1("egg",4.40);
        System.out.println("Total price of the hamburger is "+healthyBurger.getTotalPrice());

        // now its time to call deluxe hamburger
        deluxeBurger deluxeBurger = new deluxeBurger();
        deluxeBurger.getAddition1("some");

    }
}
