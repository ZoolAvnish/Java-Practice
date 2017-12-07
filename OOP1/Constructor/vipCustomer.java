package com.bikashgurung;

public class vipCustomer {
    private String name, email;
    private double creditLimit;

    public vipCustomer(){
        this("Bikash","bikash@gmail.com",20000d);
    }

    public  vipCustomer(String name, String email){
        this(name,email,3000d);
    }

    public vipCustomer(String name, String email, double creditLimit){
        this.name = name;
        this.email = email;
        this.creditLimit = creditLimit;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public double getCreditLimit() {
        return creditLimit;
    }
}
