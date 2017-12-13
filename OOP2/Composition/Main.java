package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        Dimensions dimensions = new Dimensions(20,20,5);
        Case theCase = new Case("2202","Dell","22",dimensions);

        Monitor theMonitor = new Monitor("32 inch Beast","Acer",32,new Resolution(1920,1200));
        MotherBoard motherBoard = new MotherBoard("3345","Asus","v.344",4,6);

        PC thePc = new PC(theCase,theMonitor,motherBoard);
        thePc.getMonitor().drawPixelAt(1500,1200,"black");
        thePc.getMotherBoard().loadProgram("Windows 10");
        thePc.getTheCase().pressPowerButton();

    }
}
