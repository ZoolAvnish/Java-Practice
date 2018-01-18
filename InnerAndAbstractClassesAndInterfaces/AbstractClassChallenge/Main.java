package com.bikashgurung;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// it is the code of the abstract class challenge
        LinkedList list = new LinkedList(null);
        list.traverse(list.getRoot());
        String stringData = "4 5 6 7 8 9 2 3";
        String[] data = stringData.split(" ");
        for (String s : data){
            list.addItem(new Node(s));
        }
        list.traverse(list.getRoot());
        list.removeItem(new Node("3"));
        list.traverse(list.getRoot());

    }
}
