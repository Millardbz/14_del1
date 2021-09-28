package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        int die1, die2, pointGen, point, lastDie1, lastDie2;
       // int point = 40;
        lastDie1 = 6;
        lastDie2 = 6;

      do{
        Scanner scan = new Scanner(System.in);
        System.out.print("Roll (enter)");
        scan.nextLine();

        pointGen = (int)(Math.random()*30);
        point = pointGen;
        die1 = (int)(Math.random()*6+1);
        die2 = (int)(Math.random()*6+1);

        System.out.println("Terning 1: " + die1);
        System.out.println("Terning 2: " + die2);
        System.out.println("point:     " + point);

        if (die2 == die1) {        // To ens
            if(point >= 40){       // Spilleren vinder hvis point >= 40
                System.out.println("VINDER");

            }
            else if ((die1*die2*lastDie1*lastDie2 == 6*6*6*6)){ // Spilleren vinder hvis der blev slået
                System.out.println("VINDER");                   // par 6 i sidste kast og nuværende

            }

        }



        }while(point >= 0);

    }
}
