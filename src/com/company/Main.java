package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int p1 = 0, p2 = 0;

        while(p1<40) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Press enter to roll your dice");

            String roll = scan.nextLine();
            if (roll == roll) {
                int dice1 = (int) (Math.random() * 6 + 1);
                int dice2 = (int) (Math.random() * 6 + 1);

                int sum1 = (dice1 + dice2);
                int sum2 = (dice1 + dice2);

                p1 += sum1;
                p2 += sum2;

                System.out.println("You rolled a " + dice1 + " and " + dice2);
                System.out.println("You now have " + p1 + " points");
            }
        }
    }
}
