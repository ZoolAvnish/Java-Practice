package com.bikashgurung;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

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

        printList(placesToVisit);

        addInOrder(placesToVisit,"Alice Spring");
        printList(placesToVisit);

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
}
