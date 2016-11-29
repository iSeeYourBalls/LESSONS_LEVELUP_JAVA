package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int a = 90;

	    while(a >= 0)
        {
            System.out.println(a);
            a -= 5;
        }

        String b = "";

        if(b.isEmpty())
        {
            System.out.println("ДА");
        }

        Gender male = Gender.male;

        String [] arr = {"Ethan Hawke", "Julie Delpy"};

        for(String aa : arr) {
            System.out.printf("Имя : %s, ", aa);
        }

        String[] str = {"this", "is", "a", "very", "long", "array", "which", "has", "absolutely", "no", "sense"};

        for(String ar : str)
        {
            System.out.println(ar + " - " + ar.length());
        }




    }
}
