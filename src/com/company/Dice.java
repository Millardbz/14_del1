package com.company;
import java.util.Random;
public class Dice {
    Random random = new Random();
    int rand;
    public void Dice(){
        rand = random.nextInt();
        System.out.println(rand);
    }

}
