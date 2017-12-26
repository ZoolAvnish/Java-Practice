package com.bikashgurung;

import java.util.ArrayList;

public class Grocery {
    private ArrayList<String> grocery = new ArrayList<String>();
    public void addGrocery(String item){
        grocery.add(item);
    }
    public void printGrocery(){
        System.out.println("You have "+grocery.size()+" items in your grocery list.");
        for(int i=0;i<grocery.size();i++){
            System.out.println((i+1)+". "+grocery.get(i));
        }
    }
    public void modifyGrocery(String currentItem, String newItem){
        int position = findItems(currentItem);
        if(position >= 0){
            modifyGrocery(position, newItem);
        }
    }
    private void modifyGrocery(int position, String newItem){
        grocery.set(position, newItem);
        System.out.println("Grocery item"+(position+1)+" has been modified.");
    }
    public void removeGrocery(String item){
        int position = findItems(item);
        if(position >= 0){
            removeGrocery(position);
        }
    }
    private void removeGrocery(int position){
        //String theItem = grocery.get(position);
        grocery.remove(position);
    }
    private int findItems(String search){
        //boolean exists = grocery.contains(search);
        return grocery.indexOf(search);
    }
    public boolean onFile(String search){
        int position = findItems(search);
        if(position >= 0){
            return true;
        }
        return false;
    }

}
