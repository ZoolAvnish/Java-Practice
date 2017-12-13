package com.bikashgurung;

public class Room {
    Table tb1;

    public Room(Table tb1) {
        this.tb1 = tb1;
    }

    public void getting(){
        getTb1().color("Yellow");
    }

    private Table getTb1() {
        return tb1;
    }
}
