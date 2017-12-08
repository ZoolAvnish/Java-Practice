package com.bikashgurung;

public class Main {

    public static void main(String[] args) {

        Animal animal = new Animal(1,1,15,20,"Animal");
        Dog tommy = new Dog(1,20,"Tommy",2,4,1,32,"Long Silky");
        tommy.eat();
        tommy.walk();
        tommy.run();

        Snake python = new Snake(3,10,"Python",0,"Poisonous");
        python.eat();

    }
}
