package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	//Player information
        //Player player = new Player();
        //player.name = "Bikash";
        //player.health = 30;
        //player.weapon = "Cross Bow";

        // now player is loosing health after damage.
        //player.health = 100;
        //player.loseHealth(40);
        //System.out.println("Remaining health is "+player.healthRemaining());

        EnhancedPlayer player = new EnhancedPlayer("Bikash",200,"Sword");
        System.out.println("Initial health is "+player.getHitPoints());

    }
}
