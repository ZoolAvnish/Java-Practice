package com.bikashgurung;

public class deluxeBurger extends Hamburger {

    public deluxeBurger() {
        super("Deluxe", "white", "sausage and bacon", 15);
        super.getAddition1("Chips");
        super.getAddition2("Drink");
    }

    @Override
    public void getAddition1(String name) {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void getAddition2(String name) {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void getAddition3(String name) {
        System.out.println("Cannot add additional item.");
    }

    @Override
    public void getAddition4(String name) {
        System.out.println("Cannot add additional item.");
    }
}
