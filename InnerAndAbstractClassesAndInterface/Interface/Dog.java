package com.bikashgurung;

public class Dog extends Animal {

    private  int eyes,legs,tail,teeth;
    private String coat;

    //inheritance of the base character from the animal class.
    //this is compulsory when we inherit the properties from another class.
    public Dog(int size, int weight, String name, int eyes, int legs, int tail, int teeth, String coat) {
        super(1, 1, size, weight, name);
        this.eyes = eyes;
        this.legs = legs;
        this.tail = tail;
        this.teeth = teeth;
        this.coat = coat;
    }

    private void chew(){
        System.out.println("Dog chew to eat.");
    }
    public void walk(){
        System.out.println("Dog walk is called");
        move(5);
    }
    public void run(){
        System.out.println("Dog run is called");
        move(10);
    }

    @Override
    public void eat() {
        System.out.println("Dog eat is called.");
        chew();
        super.eat();
    }

}
