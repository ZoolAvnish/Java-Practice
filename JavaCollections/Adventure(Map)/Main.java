package com.example.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    private static Map<Integer,Location> locations = new HashMap<Integer, Location>();

    public static void main(String[] args) {
	// write your code here
        Scanner scan = new Scanner(System.in);

        locations.put(0,new Location(0,"learning java"));
        locations.put(1,new Location(1,"learning python"));
        locations.put(2,new Location(2,"learning C++"));
        locations.put(3,new Location(3,"learning scala"));
        locations.put(4,new Location(4,"learning github"));
        locations.put(5,new Location(5,"learning photoshop"));

        locations.get(1).addExit("W",2);
        locations.get(1).addExit("E",3);
        locations.get(1).addExit("S",4);
        locations.get(1).addExit("N",5);
        //locations.get(1).addExit("Q",0);

        locations.get(2).addExit("N",5);
        //locations.get(2).addExit("Q",0);

        locations.get(3).addExit("W",1);
        //locations.get(3).addExit("Q",0);

        locations.get(4).addExit("N",1);
        locations.get(4).addExit("W",2);
        //locations.get(4).addExit("Q",0);

        locations.get(5).addExit("S",1);
        locations.get(5).addExit("W",2);
        //locations.get(5).addExit("Q",0);

        int loc = 1;
        while (true){
            System.out.println(locations.get(loc).getDescription());
            if (loc==0){
                break;
            }

            Map<String,Integer> exits = locations.get(loc).getExits();
            System.out.println("Available exits are: ");
            for (String exit: exits.keySet()){
                System.out.print(exit+", ");
            }
            System.out.println();
            String direction = scan.nextLine().toUpperCase();

            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            else {
                System.out.println("You cannot go in that direction");
            }
        }

        // here split helps to split each word in the sentence
        // " " means that after each " " we split the sentence
        String[] road = "You are sitting at the end of the road".split(" ");
        for (String i : road){
            System.out.println(i);
        }
        System.out.println("==================================================");

        // ", " means after ", " we split the sentence
        String[] building = "You are inside a building, of the road".split(", ");
        for (String i : building){
            System.out.println(i);
        }


    }
}
