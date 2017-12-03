package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
	// while and do while statement
        int count=0;
        while(count<=4){
            System.out.println("Count value is "+count);
            count++;
        }

        count = 1;
        while (true){
            if(count==4){
                break;
            }
            System.out.println("Count value is "+count);
            count++;
        }

        //using do while loop
        count = 6;
        do{
            System.out.println("Count value is "+count);
            count++;

            if(count>10){
                break;
            }
        }
        while (count!=6);

        //question given by instructor
        int number = 5;
        int finish = 20;
        int evenfound = 0;
        while (number<=finish){
            if(!isEven(number)){
                number++;
                continue;
            }

            System.out.println("Even number is "+number);
            number++;
            evenfound++;
            if(evenfound>=5){
                break;
            }
        }
        System.out.println("Total even numbers are "+evenfound);

    }

    public static boolean  isEven(int inp){
        if(inp%2==0){
            return true;
        }
        else
            return false;

    }
}
