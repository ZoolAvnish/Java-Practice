package com.bikashgurung;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class Demo {
    public static void main(String[] args) {
        LinkedList<String> placesToVisit = new LinkedList<String>();
        addInOrder(placesToVisit,"Sydney");
        addInOrder(placesToVisit,"Melbourne");
        addInOrder(placesToVisit,"Brisbane");
        addInOrder(placesToVisit,"Perth");
        addInOrder(placesToVisit,"Canberra");
        addInOrder(placesToVisit,"Adelaide");
        addInOrder(placesToVisit,"Darwin");

        addInOrder(placesToVisit,"Alice Spring");
        addInOrder(placesToVisit,"Perth");
        printList(placesToVisit);
        visit(placesToVisit);

        /*
        placesToVisit.add("Sydney");
        placesToVisit.add("Melbourne");
        placesToVisit.add("Brisbane");
        placesToVisit.add("Perth");
        placesToVisit.add("Canberra");
        placesToVisit.add("Adelaide");
        placesToVisit.add("Darwin");
        // running the existing cities
        printList(placesToVisit);
        // when we add a place in certain index position
        placesToVisit.add(1,"Alice Springs");
        printList(placesToVisit);
        // when we remove certain places
        placesToVisit.remove(4);
        printList(placesToVisit);
        */

    }
    private static void printList(LinkedList<String> linkedList){
        // now we are suing the concept of iterator
        Iterator<String> i = linkedList.iterator();
        while (i.hasNext()){
            System.out.println("Now visiting "+i.next());  // i.next() is equivalent to typing i++
        }
        System.out.println("===============================");
    }

    // now we are making method for alphabetically order of cities to be visited

    private static boolean addInOrder(LinkedList<String> linkedList, String newCity){
        ListIterator<String> stringListiterator = linkedList.listIterator(); // its just the setup
        while (stringListiterator.hasNext()){
            int comparision = stringListiterator.next().compareTo(newCity);
            if(comparision == 0){
                // means equla, or do not add
                System.out.println(newCity+" is already included.");
                return false;
            }
            else if(comparision>0){
                // means add new cities according to its order
                stringListiterator.previous();
                stringListiterator.add(newCity);
                return true;
            }
            else if(comparision<0){
                // move to the next city
            }
        }
        stringListiterator.add(newCity);
        return true;
    }

    private static void visit(LinkedList<String> cities){
        Scanner scan = new Scanner(System.in);
        boolean quit = false;
        // going forward is added to keep the track of the cities so that it didn't print twice
        boolean goingForward = true;
        ListIterator<String> listIterator = cities.listIterator();

        if(cities.isEmpty()){
            System.out.println("No cities in the list.");
            return;
        }
        else {
            System.out.println("Now visiting "+listIterator.next());
            printMenu();
        }
        while (!quit){
            int action = scan.nextInt();
            scan.nextLine();
            switch (action){
                case 0:
                    System.out.println("Holiday is over.");
                    quit = true;
                    break;
                case 1:
                    if(!goingForward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        goingForward = true;
                    }
                    if (listIterator.hasNext()){
                        System.out.println("Now visiting "+listIterator.next());
                    }
                    else{
                        System.out.println("Reached the end of the list.");
                        goingForward = false;
                    }

                    break;
                case 2:
                    if(goingForward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        goingForward = false;
                    }
                    if (listIterator.hasPrevious()){
                        System.out.println("Now visiting "+listIterator.previous());
                    }
                    else{
                        System.out.println("We are at the start of the list.");
                        goingForward = true;
                    }

                    break;
                case 3:
                    printMenu();
                    break;
            }
        }
    }

    private static void printMenu(){
        System.out.println("Available actions:\npress ");
        System.out.println("0 - to quit\n" +
                "1 - go to next city\n" +
                "2 - go to previous city\n" +
                "3 - print menu options\n");
    }
}
