package com.bikashgurung;

public class Main {

    public static void main(String[] args) {

        Table tb1 = new Table("for study",4);
        Room r1 = new Room(tb1);

        r1.getting();
    }
}
