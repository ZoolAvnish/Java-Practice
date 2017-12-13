package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        Printer printer = new Printer(50, false);
        System.out.println("initial pages count = "+printer.getPage());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count is "+printer.getPage());
        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "+pagesPrinted+" new total print count is "+printer.getPage());

    }
}
