package com.bikashgurung;

import com.example.game.ISavable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Its a challenge part for interface
        Player tim = new Player("Tim", 10,15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
        //loadObject(tim);
        System.out.println(tim);

        ISavable warewolf = new Monster("Warewolf",20,50);
        System.out.println("Strength = "+((Monster) warewolf).getStrength()); // this is how we access the method from another class
        // with the help of interface.
        System.out.println(warewolf);
        saveObject(warewolf);

    }
    public static ArrayList<String> readValue(){
        ArrayList<String> values = new ArrayList<String>();

        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
                "1 to enter a string\n" +
                "0 to quit");
        while (!quit){
            System.out.println("Choose an option: ");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.println("Enter a string: ");
                    String stringInput = scan.nextLine();
                    values.add(index,stringInput);
                    index++;
                    break;
            }
        }
        return values;
    }
    public static void saveObject(ISavable objectToSave){
        for(int i=0; i<objectToSave.write().size();i++){
            System.out.println("Saving "+objectToSave.write().get(i)+" to storage device.");
        }
    }
    public static void loadObject(ISavable objectToLoad){
        ArrayList<String> values = readValue();
        objectToLoad.read(values);
    }
}
