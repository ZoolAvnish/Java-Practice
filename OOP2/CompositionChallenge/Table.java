package com.bikashgurung;

public class Table {
    private String type;
    private int legs;

    public Table(String type, int legs) {
        this.type = type;
        this.legs = legs;
    }

    public void color(String color){
        System.out.println("It is of "+color+" and of type "+type);
    }

    public String getType() {
        return type;
    }

    public int getLegs() {
        return legs;
    }
}
