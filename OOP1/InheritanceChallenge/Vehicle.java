package com.bikashgurung;

public class Vehicle {
    String name, size;
    int currentVelocity, currentDirection;

    public Vehicle(String name, String size) {
        this.name = name;
        this.size = size;

        this.currentVelocity = 0;
        this.currentDirection = 0;

    }
    public void steer(int direction){
        this.currentDirection = direction;
        System.out.println("Vehicle steer is called: Steering at "+currentDirection+" degrees.");
    }
    public void move(int velocity, int direction){
        this.currentVelocity = velocity;
        this.currentDirection = direction;
        System.out.println("Vehicle move is called: Moving at "+currentVelocity+" in direction "+currentDirection);
    }

    public void stop(){
        this.currentVelocity = 0;
    }

    public String getName() {
        return name;
    }

    public String getSize() {
        return size;
    }

    public int getCurrentVelocity() {
        return currentVelocity;
    }

    public int getCurrentDirection() {
        return currentDirection;
    }
}
