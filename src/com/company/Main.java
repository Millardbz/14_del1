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
                System.out.println("And you got a pair! Press enter to roll your dice again");
                Scanner scan = new Scanner(System.in);
                String roll = scan.nextLine();

                die1 = (int) (Math.random() * 6 + 1);
                die2 = (int) (Math.random() * 6 + 1);

                if(die1+die2==12){
                   die1 = (int) (Math.random() * 6 + 1);
                   die2 = (int) (Math.random() * 6 + 1);

                   if(die1+die2==12){
                       System.out.println("You got a pair of 6 twice in a row!! You WIN!");
                       break;}
               }

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
        }
    }
}
