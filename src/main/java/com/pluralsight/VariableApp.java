package com.pluralsight;

public class VariableApp
{public static void main(String[] args) {
    System.out.println("Welcome to my Shop.");

    //Step 1
    String favColor; favColor = "Black";
    int firstSchoolYear = 2012;
    char midInitial = 'C';
    boolean havePets = false;
    String niceMessage; niceMessage = "I hope you have a good day.";

    //Step 2
    final int DAYS_IN_WEEK = 7;
    final double PRICE_OF_COFFEE = 4.99;
    char favLetter = 'W';
    boolean raining = true;

    System.out.println("My favorite color is "+ favColor);
    System.out.println("I started school back in"+ firstSchoolYear);
    System.out.println("My middle name start with the letter "+ midInitial);
    System.out.println(havePets +", I do not have pets.");
    System.out.println("And all I wanted to say was that "+ niceMessage);
    System.out.println("There are "+ DAYS_IN_WEEK +" days in a week.");
    System.out.println("Starbucks' coffee cost around $"+ PRICE_OF_COFFEE +".");
    System.out.println("My favorite letter in the alphabet is "+ favLetter);
    System.out.println(raining +", it is raining.");


}
}
