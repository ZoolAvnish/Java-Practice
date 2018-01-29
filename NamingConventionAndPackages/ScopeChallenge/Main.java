package com.example.test;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Now we are checking the scope
        // cause we have taken scanner in constructor
        X x = new X(new Scanner(System.in));
        x.x();
    }
}
