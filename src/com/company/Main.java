package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    private int itemAmount;
    private double itemprice;
    private double taxRate;
    private double procentage;
    private String stateCode;
    private double bruttoPrice;
    private double discountRate;
    private double discountPercentage;
    private double priceFinal;

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

    public void calculateBrutto(){
        System.out.println("Your cumulative cost of your items is");
        bruttoPrice = itemAmount*itemprice;
        System.out.println(bruttoPrice);
    }

    public void checkDiscount(){
        if(bruttoPrice > 1000 && bruttoPrice < 5000){
            discountPercentage = 0.03;
        }else if(bruttoPrice > 5000 && bruttoPrice < 7000){
            discountPercentage = 0.05;
        }else if(bruttoPrice > 7000 && bruttoPrice < 10000) {
            discountPercentage = 0.07;
        }else if(bruttoPrice > 10000 && bruttoPrice < 50000) {
            discountPercentage = 0.10;
        }else if(bruttoPrice > 50000) {
            discountPercentage = 0.15;
        }else discountPercentage = 0;
    }

    public void showDiscount(){
        checkDiscount();
        discountRate = bruttoPrice * discountPercentage;
        System.out.println("Your totalt order discount is: " + discountRate);

    }

    public void showPriceWithDiscountAndTax(){
        priceFinal = (bruttoPrice - discountRate) * ((procentage+100)/100);
        System.out.println("\n\n\n\nFinal price after tax and disocunt: " + priceFinal+"$");
    }





    public void run(){
        inputItemAmount();
        itemPrice();
        inputStateCode();
        calculateBrutto();
        showDiscount();
        showPriceWithDiscountAndTax();
    }

    public static void main(String[] args) {

        Main prg = new Main();
        prg.run();
    }
}
