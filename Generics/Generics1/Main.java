package com.bikashgurung;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // example of an generics in java
        ArrayList item = new ArrayList();
        item.add(1);
        item.add(2);
        item.add(3);
        item.add(4);
        item.add(5);

        printDouble(item);

    }
    private static void printDouble(ArrayList n){
        // we use object cause we don't know the type of arrayList
        for (Object i:n){
            System.out.println((Integer)i*2);
        }
    }
}
