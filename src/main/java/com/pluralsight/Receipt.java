package com.pluralsight;

public class Receipt
{public static void main(String[] args){
    System.out.println("Here is your order.");

    String itemName = "box of Coca Cola";
    double itemPrice = 11.99;
    int quantity = 3;
    double total = quantity * itemPrice;
    System.out.println("You bought "+ quantity +" "+ itemName +" for $"+ total);
}
}
