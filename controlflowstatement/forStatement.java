package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        //calculating interest

        System.out.println("10,000 at 2% interest is "+ calculateInterest(10000.0,2.0));

        //now applying for loop so that we don't have to calculate again and again
        for(int i=2; i<=8; i++){
            // here we use string.format so that it doesn't exceed more than two numbers after decimal point
            System.out.println("10,000 at "+i+"% interest is "+String.format("%.2f",calculateInterest(10000.0,i)));
        }
        System.out.println("*******************************");

        //challenge given by the instructor
        for(int i=8; i>=2; i--){
            // here we use string.format so that it doesn't exceed more than two numbers after decimal point
            System.out.println("10,000 at "+i+"% interest is "+String.format("%.2f",calculateInterest(10000.0,i)));
        }

        //challenge given by the instructor again
        int count=0;
        for(int i=40;i<=90;i++){
            if(isPrime(i)){
                count++;
                System.out.println(i+" is a prime number.");
                if(count==9){
                    System.out.println("Exiting for loop.");
                    break;
                }
            }
        }
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        //instead of n/2 we can use (Long) Math.sqrt(n) because it is more faster cause t executes less than n/2
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static double calculateInterest(double amt, double interest){
        return (amt * (interest/100));
    }
}
