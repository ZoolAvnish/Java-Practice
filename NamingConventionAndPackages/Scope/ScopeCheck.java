package com.example.test;

public class ScopeCheck {
    public int publicVar = 0;
    private int varOne = 1;

    public ScopeCheck(){
        System.out.println("ScopeCheck created, publicVar = "+publicVar+": varOne = "+ varOne);
    }

    public int getVarOne() {
        return varOne;
    }

    public void timesTwo(){
        int Var2 = 2;
        for (int i=1;i<=10;i++){
            System.out.println(i+" times two is "+i*Var2    );
        }
    }
    public void useInner(){
        InnerClass innerClass = new InnerClass();
        System.out.println("varThree from outer class: "+innerClass.Var3);
    }

    public class InnerClass{
        public int Var3 = 3;

        public InnerClass(){
            System.out.println("Inner class is created, varOne is "+varOne+" and varThree is "+Var3);
        }
        public void timesTwo(){
            System.out.println("varOne is still available here "+varOne);
            for (int i=1;i<=10;i++){
                System.out.println(i+" times two is "+i*Var3);
            }
        }
    }

}
