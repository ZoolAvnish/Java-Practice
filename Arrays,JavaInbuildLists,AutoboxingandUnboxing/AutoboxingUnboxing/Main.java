package com.bikashgurung;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	    String[] str = new String[10];
	    int[] intarr = new int[10];

        ArrayList<String> strarry = new ArrayList<String>();
        strarry.add("Awesome");
        strarry.add("Bucky");

        ArrayList<Integer> intArray = new ArrayList<Integer>();
        for (int i=0;i<=10;i++){
            intArray.add(Integer.valueOf(i));
        }
        for(int i=0;i<=10;i++){
            System.out.println(i+" --> "+intArray.get(i).intValue());
        }



    }
}
