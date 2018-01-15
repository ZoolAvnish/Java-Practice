package com.bikashgurung;

public abstract class Animal {
    // In abstract we can add fields, regular methods with abstract methods
    // Whereas in interface we cannot add fields and regular methods.
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void eat();
    public abstract void breath();

    public String getName() {
        return name;
    }
}
