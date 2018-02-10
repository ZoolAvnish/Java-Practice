package com.example.test;

import java.util.HashMap;
import java.util.Map;

public class MapProgram {
    public static void main(String[] args) {
        Map<String, String> languages = new HashMap<>();
        languages.put("Java","a compiled high level");
        languages.put("Python","an interpreted, object oriented");
        languages.put("Algorithm","an algorithmic language");
        System.out.println(languages.put("BASIC","all for begineers")); // by default value is null
        languages.put("Lisp","Therein lies madness");

        // we don't get error it gets overwritten
        languages.put("Java","this course is about java");
        System.out.println(languages.get("Java"));

        System.out.println("============================================");
//        languages.remove("Lisp"); // removes the value with key lisp
        languages.replace("Python","it is not a snake");
        if(languages.replace("Java","this course is about java","it is an amazing language")){
            System.out.println("replaced successfully");
        }
        else {
            System.out.println("not replaced");
        }
        for (String key: languages.keySet()){ // helps to print all the value of map
            System.out.println(key+" : "+languages.get(key));
        }

    }
}
