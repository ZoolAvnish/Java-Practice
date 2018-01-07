package com.bikashgurung;

public class Snake extends Animal {

    int leg;
    String type;

    public Snake(int size, int weight, String name, int leg, String type) {
        super(1, 1, size, weight, name);
        this.leg = leg;
        this.type = type;
    }

    private void swallow(){
        System.out.println("Snake swallow the food");
    }

    @Override
    public void eat() {
        super.eat();
        swallow();
    }
}
