package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int first = calculateScore("Bikash",20); //return value is not printed
        System.out.println("New score is "+first); // by using this the return value of lower method is called.
        calculateScore(20);
        calculateScore();

        calFeetAndInchesToCm(7,-5); //inserted invalid data
        calFeetAndInchesToCm(100);

    }
    public static int calculateScore(String playerName, int score){
        System.out.println("Player Name: "+playerName+" Score "+score+" points.");
        return 200*score;
    }
    public static int calculateScore(int score){
        System.out.println("Unnamed player scored "+score+" points.");
        return 200*score;
    }
    public static int calculateScore(){
        System.out.println("No player name and score.");
        return 0;
    }

    // questions given by the instructor
    public static double calFeetAndInchesToCm(double feet, double inches){
        double cm;
        if((feet>=0) && (inches>=0 && inches<=12)){
            cm = (feet*12)*2.54;
            cm += inches*2.54;
            System.out.println("After converting entry into centimetres the value is "+cm+" cm.");
        }
        System.out.println("Invalid data");
        return -1;
    }

    public static double calFeetAndInchesToCm(double inches){
        double ft,rm;
        if(inches>=0){
            ft = (int)inches/12;
            rm = (int)inches%12;
            System.out.println(inches+" inches is equal to "+ft+" feet "+rm+" inches.");
            return calFeetAndInchesToCm(ft,rm);

        }

        return -1;

    }

}
