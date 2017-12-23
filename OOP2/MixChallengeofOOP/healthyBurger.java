package com.bikashgurung;

public class healthyBurger extends Hamburger{

    private String add1;
    private double price1;

    private String add2;
    private double price2;

    private double mainPrice;

    public healthyBurger(String meat, double price) {
        super("Healthy ","Brown rye", meat, price);
        this.mainPrice = price;
    }

    public void getadd1(String name, double price){
        this.add1 = name;
        this.price1 = price;
    }
    public void getadd2(String name, double price){
        this.add2 = name;
        this.price2 = price;
    }

    @Override
    public double getTotalPrice() {
        double hamburgerprice = super.getTotalPrice();
        if(this.add1 != null){
            hamburgerprice+=price1;
            System.out.println("Added "+this.add1+" for an extra "+this.price1);
        }
        if(this.add2 != null){
            hamburgerprice+=price2;
            System.out.println("Added "+this.add2+" for an extra "+this.price2);
        }
        return hamburgerprice;

    }

    public double getTotal(){
        double total=this.mainPrice;



        return total;
    }



}
