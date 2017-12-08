package com.bikashgurung;

public class Car extends Vehicle{

    private int wheels, doors, gear, currentgear;
    private boolean isManual;

    public Car(String name, String size, int wheels, int doors, int gear, boolean isManual) {
        super(name, size);
        this.wheels = wheels;
        this.doors = doors;
        this.gear = gear;
        this.currentgear = 1;
        this.isManual = isManual;
    }

    public void changeGear(int currentgear) {
        this.currentgear = currentgear;
        System.out.println("Car current gear changed to "+this.currentgear+" gear.");
    }
    public void changeVelocity(int speed, int direction){
        move(speed, direction);
        System.out.println("Car change velocity "+speed+" direction "+direction);
    }

}
