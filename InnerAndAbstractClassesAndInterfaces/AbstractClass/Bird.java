package com.bikashgurung;

public abstract class Bird extends Animal implements canFly{
    public Bird(String name) {
        super(name);
    }

    @Override
    public void eat() {
        System.out.println(getName()+" is picking.");
    }

    @Override
    public void breath() {
        System.out.println("Breathe in and breathe out repeat");
    }

    @Override
    public void fly() {
        System.out.println(getName()+" is flapping it's wings");
    }
}
