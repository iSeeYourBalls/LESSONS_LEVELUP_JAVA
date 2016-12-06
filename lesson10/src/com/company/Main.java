package com.company;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException{

        String s = "";

        boolean b = s instanceof String;

        Country country = new Country("Ukraine", 40000000);
        Country country1 = new Country("Ukraine", 40000000);

        System.out.println(country.equals(country1));

        Country c2 = (Country)country;
    }
}
