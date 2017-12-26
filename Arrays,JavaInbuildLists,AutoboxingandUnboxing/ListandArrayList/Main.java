package com.bikashgurung;

import java.util.Scanner;

public class Main {
    //static means that every new scan instance would still share
    //and use the initial scan reference that we created first.
    private static Scanner scan = new Scanner(System.in);
    private static Grocery gro = new Grocery();

    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstuction();
        while(!quit){
            System.out.println("Enter your choice ");
            choice = scan.nextInt();
            scan.nextLine();

            switch (choice){
                case 0:
                    printInstuction();
                    break;
                case 1:
                    gro.printGrocery();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    quit=true;
                    break;
            }
        }
    }

    public static void printInstuction(){
        System.out.println("Press ");
        System.out.println("0 - To print choice options.");
        System.out.println("1 - To print the list of grocery items.");
        System.out.println("2 - To add items to the grocery list.");
        System.out.println("3 - To modify the list of grocery items.");
        System.out.println("4 - To remove the items from grocery list.");
        System.out.println("5 - To search the item from the grocery list.");
        System.out.println("6 - To quit the application.");

    }
    public static void addItem(){
        System.out.println("Please enter the grocery item: ");
        gro.addGrocery(scan.nextLine());
    }
    public static void modifyItem(){
        System.out.println("Enter current item name: ");
        String itemNo = scan.nextLine();
        System.out.println("Enter replacement item: ");
        String newItem = scan.nextLine();
        gro.modifyGrocery(itemNo,newItem);
    }
    public static void removeItem(){
        System.out.println("Enter the item name: ");
        String itemNo = scan.nextLine();
        gro.removeGrocery(itemNo);
    }
    public static void searchItem(){
        System.out.println("Enter Item to search for: ");
        String search = scan.nextLine();
        if(gro.onFile(search)){
            System.out.println("found "+search+" in our grocery list");

        }
        else
            System.out.println(search+" is not on the list");
    }
}
