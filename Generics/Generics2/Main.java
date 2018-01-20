package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        Football joe = new Football("Joe");
        Baseball pat = new Baseball("Pat");
        Socc beckham = new Socc("Beckham");

        Team<Football> adelade= new Team<>("Adelaide Crows");
        adelade.addPlayer(joe);
        //adelade.addPlayer(pat);
        //adelade.addPlayer(beckham);

        System.out.println(adelade.numPlayers());

        Team<Baseball> chicago = new Team<>("Chicago Bulls");
        chicago.addPlayer(pat);

        Team<Socc> brokenTeam = new Team<>("This won't work");
        brokenTeam.addPlayer(beckham);

        Team<Football> melbourne = new Team<>("Melbourne");
        Football banks = new Football("Gordon");
        melbourne.addPlayer(banks);

        Team<Football> hawthon = new Team<>("Hawthon");
        Team<Football> ferment = new Team<>("Ferment");

        hawthon.matchResult(ferment,1,0);
        hawthon.matchResult(adelade,3,8);

        adelade.matchResult(ferment,2,1);

    }
}
