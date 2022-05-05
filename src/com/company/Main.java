package com.company;

import java.util.Scanner;

public class Main {
    Scanner sc = new Scanner(System.in);
    private int itemAmount;

    public void inputItemAmount(){
        System.out.println("Please type the amount of items:");
        itemAmount = sc.nextInt();
        System.out.println("\n\n\nYou have " + itemAmount + " item(s) to play with!");
    }

    public void run(){
        inputItemAmount();
    }

    public static void main(String[] args) {

        Main prg = new Main();
        prg.run();
    }
}
