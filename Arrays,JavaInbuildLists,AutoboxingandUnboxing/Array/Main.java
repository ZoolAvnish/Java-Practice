package com.bikashgurung;

import java.util.Scanner;

public class Main {
    // System.in allows you to type the input into the console
    private static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {

        /* normal declaration of array and calling it
        int[] myintarray = new int[11];

        for(int i=0;i<myintarray.length;i++){
            myintarray[i]=i*2;
            System.out.println("value of "+i+" is "+myintarray[i]);
        }
        */

        // real life example
        int[] myIntegers = getIntegers(5);
        for (int i=0;i<myIntegers.length;i++){
            System.out.println("Value "+i+" types was "+myIntegers[i]);
        }
        System.out.println("The average of the above numbers is "+getAverage(myIntegers));
    }

    public static int[] getIntegers(int num){
        System.out.println("Enter "+num+ " integer values.");
        int[] values = new int[num];
        for(int i=0;i<values.length;i++){
            values[i]= scan.nextInt();
        }
        return values;
    }
    public static double getAverage(int[] array){
        int sum=0;
        for(int i=0;i<array.length;i++){
            sum+=array[i];
        }
        return (double)sum/(double)array.length;
    }
}
