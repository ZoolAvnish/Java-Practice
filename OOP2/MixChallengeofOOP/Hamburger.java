package com.bikashgurung;

public class Hamburger {
    private String rollType,name,meat;
    private double price;

    private String addition1,addition2,addition3,addition4;
    private double charge1,charge2,charge3,charge4;

    public Hamburger(String name, String rollType, String meat, double price) {
        this.rollType = rollType;
        this.name = name;
        this.meat = meat;
        this.price = price;
        System.out.println(name+" Hamburger price with roll type "+rollType+" and meat "+meat+" is "+price);

    }

    // this are the info of all the additional

    public void getAddition1(String name) {
        this.addition1 = name;
        this.charge1 = 2;
    }

    public void getAddition2(String name) {
        this.addition2 = name;
        this.charge2 = 2;
    }

    public void getAddition3(String name) {
        this.addition3 = name;
        this.charge3 = 2;
    }

    public void getAddition4(String name) {
        this.addition4 = name;
        this.charge4 = 2;
    }

    // now all the totals of the price
    public double getTotalPrice(){
        double total = this.price;
        if(this.addition1 != null){
            total+=this.charge1;
            System.out.println("added "+addition1+" for "+this.charge1);
        }
        if(this.addition2 != null){
            total+=this.charge2;
            System.out.println("added "+addition2+" for "+this.charge2);
        }
        if(this.addition3 != null){
            total+=this.charge3;
            System.out.println("added "+addition3+" for "+this.charge3);
        }
        if(this.addition4 != null){
            total+=this.charge4;
            System.out.println("added "+addition4+" for "+this.charge4);
        }
        return total;
    }

}
