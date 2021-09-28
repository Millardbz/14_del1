package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){
	// write your code here

        int dice1, dice2;

    do{
        Scanner scan = new Scanner(System.in);
        System.out.print("Roll (enter)");
        scan.nextLine();

        dice1 = (int)(Math.random()*6+1);
        dice2 = (int)(Math.random()*6+1);

        System.out.println(dice1);
        System.out.println(dice2);


        }while(dice1 != dice2);

    }
}
