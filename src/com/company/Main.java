package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    private int itemAmount;
    private double itemprice;
    private double taxRate;
    private double procentage;
    private String stateCode;

    public void inputItemAmount(){
        System.out.println("Please type the amount of items:");
        itemAmount = sc.nextInt();
        System.out.println("\n\n\nYou have " + itemAmount + " item(s) to play with!");
    }

    public void itemPrice(){
        System.out.println("Please input the price of the item");
        itemprice = sc.nextDouble();
        sc.nextLine();
        System.out.println("\n\n\nThe price of the item is " + itemprice + "$");
    }

    public double stateCodes(){
        boolean run = true;
        while(run) {
            run = false;
            System.out.println("Please enter the state code:");
            stateCode = sc.nextLine().toUpperCase();
            switch (stateCode) {
                case "UT" -> procentage = 6.85;
                case "NV" -> procentage = 8.00;
                case "TX" -> procentage = 6.25;
                case "AL" -> procentage = 4.00;
                case "CA" -> procentage = 8.25;
                default -> {
                    System.out.println(stateCode + " is not in the list of state codes");
                    run = true;
                }
            }
        }return procentage;
    }

    public void inputStateCode(){
        taxRate = stateCodes();
        System.out.println("\n\n\nYou have entered " + stateCode + " which has a " + taxRate + "% tax rate.");
    }




    public void run(){
        inputItemAmount();
        itemPrice();
        inputStateCode();
    }

    public static void main(String[] args) {

        Main prg = new Main();
        prg.run();
    }
}
