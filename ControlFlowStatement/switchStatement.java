package com.bikashgurung;

public class Main {

    public static void main(String[] args) {
        // here I practised switch statements

        int s = 1;
        // starting of the switch statements
        switch (s){
            case 1:
                System.out.println("The value is one.");
                break; // it terminates the current case and go to the next case
            case 2:
                System.out.println("The value is two");
                break; // see above
            case 3: case 4: case 5:  // we can do like this also if we want to
                System.out.println("Maybe three or four or five");
                System.out.println("Actually it is "+s);
                break;
            default: // it means that if any of the above case is not their than run this case
                System.out.println("The value is unknown");
                break;
        }

        // now doing the challenge based on switch statements
        char val = 'A';
        switch (val){
            case 'A':
                System.out.println("It is Apple.");
                break;
            case 'B':
                System.out.println("It is Bus");
                break;
            case 'C': case 'D': case 'E':
                System.out.println("It is "+val);
                break;
            default:
                System.out.println("It's not one of the above");
                break;
        }


        // from jdk 1.7 onwards we can use String in switch statements
        // others are int,byte,short and char
        String value = "JANUARY";
        switch (value.toLowerCase()){  //lowercase is used to match the cases criteria
            case "january":
                System.out.println("It is jan");
                break;
            case "february":
                System.out.println("It is feb");
                break;
            default:
                System.out.println("No idea");
                break;
        }


    }
}
