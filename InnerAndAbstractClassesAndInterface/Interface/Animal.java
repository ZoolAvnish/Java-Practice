package com.bikashgurung;

public class Animal {
    private int brain, body,size, weight;
    private String name;
    //initializing the base characteristic of the animal
    public Animal(int brain, int body, int size, int weight, String name) {
        this.brain = brain;
        this.body = body;
        this.size = size;
        this.weight = weight;
        this.name = name;
    }

    //method that all animals have in different
    public void eat(){
        System.out.println("Animal eat function is called.");

    }
    public void move(int speed){
        System.out.println("Animal is moving at "+speed);

    }

    // all the getters of the initialized properties
    public int getBrain() {
        return brain;
    }

    public int getBody() {
        return body;
    }

    public int getSize() {
        return size;
    }

    public int getWeight() {
        return weight;
    }

    public String getName() {
        return name;
    }
}
