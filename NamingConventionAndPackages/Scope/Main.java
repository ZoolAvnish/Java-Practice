package com.example.test;

public class Main {

    public static void main(String[] args) {

        String Var4 = "this is private to main()";

        ScopeCheck scopeCheck = new ScopeCheck();
        scopeCheck.useInner(); // calling use Inner function
        System.out.println("scope instance varOne is "+scopeCheck.getVarOne());
        System.out.println(Var4);

        scopeCheck.timesTwo();
        System.out.println("***********************************");


        ScopeCheck.InnerClass innerClass = scopeCheck.new InnerClass();
        innerClass.timesTwo();

    }
}
