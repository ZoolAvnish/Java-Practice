package com.bikashgurung;

public class Player {
    public String name,weapon;
    public int health;
    //function for loosing health
    public void loseHealth(int damage){
        this.health=this.health-damage;
        if(this.health<=0){
            System.out.println("Player knocked out");
        }
    }
    public int healthRemaining(){
        return this.health;
    }

}
