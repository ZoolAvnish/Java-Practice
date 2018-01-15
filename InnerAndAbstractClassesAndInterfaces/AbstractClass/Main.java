package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Dog dog = new Dog("Rocky");
        dog.breath();
        dog.eat();

        Parrot parr = new Parrot("Paar");
        parr.eat();
        parr.breath();
        parr.fly();

        Penguin pen = new Penguin("Emperor");
        pen.fly();

    }
}
