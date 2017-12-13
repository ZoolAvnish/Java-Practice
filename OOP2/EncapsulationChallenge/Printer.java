package com.bikashgurung;

public class Printer {
    private int tonerLevel,page;
    private boolean duplex;

    public Printer(int tonerLevel, boolean duplex) {
        if(tonerLevel>=0 && tonerLevel<=100){
            this.tonerLevel = tonerLevel;
        }
        else{
            this.tonerLevel = -1;
        }
        this.tonerLevel = tonerLevel;
        this.duplex = duplex;
        this.page = 0;
    }
    public int addToner(int tonerAmount){
        if(tonerAmount>0 && tonerAmount<=100){
            if(this.tonerLevel+tonerAmount > 100){
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }
        else{
            return -1;
        }
    }
    public int printPages(int pages){
        int pagestoPrint = pages;
        if(this.duplex){
            pagestoPrint/=2;
            System.out.println("Printing in duplex mode.");
        }
        this.page += pagestoPrint;
        return pagestoPrint;
    }

    public int getPage() {
        return page;
    }
}
