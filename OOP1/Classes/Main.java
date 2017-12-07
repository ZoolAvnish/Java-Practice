package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// now it's time for classes
        Car lamborghini = new Car();
        Car ferrari = new Car();
        lamborghini.setModel("Gallardo");
        System.out.println("This car is "+lamborghini.getModel());
    }
}
