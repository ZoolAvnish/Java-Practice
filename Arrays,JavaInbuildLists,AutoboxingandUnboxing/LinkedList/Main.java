package com.bikashgurung;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// it's tje linked list topic
        Customer customer = new Customer("Tim",555.55);
        Customer another;
        another = customer;
        another.setBalance(12.44);
        System.out.println("Balance for customer is "+customer.getName()+" is "+customer.getBalance());

        ArrayList<Integer> intList = new ArrayList<Integer>();

        intList.add(4);
        intList.add(7);
        intList.add(6);

        for (int i=0;i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }

        intList.add(1,22);  // first parameter is indexposition and another is the value.

        for (int i=0;i<intList.size();i++){
            System.out.println(i+": "+intList.get(i));
        }
    }
}
