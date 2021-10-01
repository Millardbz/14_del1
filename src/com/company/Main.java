package com.company;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        int p1 = 0, p2 = 0;
        int rolls = 1;
        int die1 =1, die2 = 2;

        //det her skal ændres
        while(rolls<1000) {

            //hvis terningerne ikke er ens
            if (die2 != die1) {

                if (rolls % 2 == 0){
                System.out.println("Player 2's turn!");}
                else {
                System.out.println("Player 1's turn");}

            rolls++;
            Scanner scan = new Scanner(System.in);
            System.out.println("Press enter to roll your dice");
            String roll = scan.nextLine();

            die1 = (int) (Math.random() * 6 + 1);
            die2 = (int) (Math.random() * 6 + 1);

            int sum = (die1 + die2);

                if (rolls % 2 == 0){
                p2 += sum;}
                else {
                p1 += sum;}

                System.out.println("You rolled a " + die1 + " and " + die2);

                if (rolls % 2 == 0){
                System.out.println("You now have " + p2 + " points");}
                else{
                System.out.println("You now have " + p1 + " points");}
            }
            //hvis der er par
            else {
              
               
            if(point >= 40){       // Spilleren vinder hvis point >= 40
                System.out.println("VINDER");

            }


        
                int sum = (die1 + die2);

                //det her skal rettes, så point står som nul med det samme
            if (sum == 2) {
                System.out.println("Sorry with two ones you lose all your points:(");
                if (rolls % 2 == 0){
                    p2 = 0;
                } else {
                    p1 = 0;
                }
            }

                System.out.println("And you got a pair! Press enter to roll your dice again");
                Scanner scan = new Scanner(System.in);
                String roll = scan.nextLine();

                die1 = (int) (Math.random() * 6 + 1);
                die2 = (int) (Math.random() * 6 + 1);

                if (rolls % 2 == 0){
                    p2 += sum;}
                else {
                    p1 += sum;}

                System.out.println("You rolled a " + die1 + " and " + die2);

                if (rolls % 2 == 0){
                    System.out.println("You now have " + p2 + " points");}
                else{
                    System.out.println("You now have " + p1 + " points");}


            }
        }

    }
}
