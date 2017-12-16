package com.bikashgurung;

class car{
    private String name;
    private boolean engine;
    private int cylinder, wheels;

    public car(int cylinder, String name) {
        this.cylinder = cylinder;
        this.name = name;
        this.wheels = 4;
        this.engine = true;
    }

    public String startEngine(){
        return "Car -> startEngine()";
    }
    public String accelerate(){
        return "Car -> Accelerate()";
    }
    public String brake(){
        return "Car -> brake()";
    }

    // it is the getters
    public String getName() {
        return name;
    }

    public int getCylinder() {
        return cylinder;
    }
}

// class of the lamborghini car
class lambo extends car{
    public lambo(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Lamborghini -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Lamborghini -> accelerate()";
    }

    @Override
    public String brake() {
        return "Lamborghini -> brake()";
    }
}

// class of the ferrari car
class ferrari extends car{
    public ferrari(int cylinder, String name) {
        super(cylinder, name);
    }

    @Override
    public String startEngine() {
        return "Ferrari -> startEngine()";
    }

    @Override
    public String accelerate() {
        return "Ferrari -> accelerate()";
    }

    @Override
    public String brake() {
        return "Ferrari -> brake()";
    }
}

public class Main {

    public static void main(String[] args) {
        //output for the base car
        car car = new car(8,"Base Car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        //output for the lamborghini car
        lambo gall = new lambo(8,"Gallardo");
        System.out.println(gall.startEngine());
        System.out.println(gall.accelerate());
        System.out.println(gall.brake());

        //output for the ferrari car
        ferrari ferr = new ferrari(6,"F30");
        System.out.println(ferr.startEngine());
        System.out.println(ferr.accelerate());
        System.out.println(ferr.brake());

    }



}
