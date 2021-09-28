package com.company;

public class Main {

    public static void main(String[] args) {


        while (true) {
            int dice1 = (int) (Math.random() * 6 + 1);
            int dice2 = (int) (Math.random() * 6 + 1);
            int sum = dice1 + dice2;


            System.out.println("Roll: total = " + sum);

            if (sum == 2) {
                System.out.println(new StringBuilder().append("Sorry with a ").append(sum).append(" You lose all your points:(").toString());
                break;
            } else if (sum >= 3) {
                System.out.println("you get  " + sum + " points" );
                break;
            }


        }
    }
}
