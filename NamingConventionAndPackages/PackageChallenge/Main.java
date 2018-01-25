package com.example.test;

import com.bikashgurung.mylibrary.Series;

public class Main {

    public static void main(String[] args) {
	// test code for the package that I created called series

        for (int i=0; i<=10;i++){
            System.out.println(Series.nSum(i));
        }
        System.out.println("**************************************");
        for (int i=0;i<=10;i++){
            System.out.println(Series.factorial(i));
        }

        System.out.println("**************************************");
        for (int i=0;i<=10;i++){
            System.out.println(Series.fibonacci(i));
        }

    }
}
