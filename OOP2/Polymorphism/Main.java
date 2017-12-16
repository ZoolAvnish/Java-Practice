package com.bikashgurung;

class Movie{
    private String name;

    public Movie(String name) {
        this.name = name;
    }

    public String plot(){
        return "No plot here.";
    }

    public String getName() {
        return name;
    }
}

class captainAmerica extends Movie{
    public captainAmerica() {
        super("Captain America");
    }
    public String plot(){
        return "Here hero tries to save the world.";
    }
}
class theAccountant extends Movie{
    public theAccountant(){
        super("The Accountant");
    }
    public String plot(){
        return "It is about the accountant who works illegally.";
    }
}
class titanic extends  Movie{
    public titanic() {
        super("Titanic");
    }
    public String plot(){
        return "One of the best love story.";
    }
}
class dontKnow extends Movie{
    public dontKnow() {
        super("Invalid Movie");
    }
    // it doesn't have the plot
}


public class Main {

    public static void main(String[] args) {
        for(int i=0;i<=5;i++){
            Movie movie = randomMovie();
            System.out.println("Movie #"+i+" : "+movie.getName()+"\n"+
            "Plots: "+movie.plot()+"\n");
        }
    }
    public static Movie randomMovie(){
        int randomValue = (int) (Math.random() * 4) +1;
        System.out.println("Random number generated was "+randomValue);
        switch (randomValue){
            case 1:
                return new captainAmerica();
            case 2:
                return new theAccountant();
            case 3:
                return new titanic();
            case 4:
                return new dontKnow();
        }
        return null;
    }
}

