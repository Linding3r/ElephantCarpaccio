package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    private int itemAmount;
    private double itemprice;

    public void inputItemAmount(){
        System.out.println("Please type the amount of items:");
        itemAmount = sc.nextInt();
        System.out.println("\n\n\nYou have " + itemAmount + " item(s) to play with!");
    }

    public void itemPrice(){
        System.out.println("Please input the price of the item");
        itemprice = sc.nextDouble();
        System.out.println("\n\n\nThe price of the item is " + itemprice + "$");
    }




    public void run(){
        inputItemAmount();
        itemPrice();
    }

    public static void main(String[] args) {

        Main prg = new Main();
        prg.run();
    }
}
