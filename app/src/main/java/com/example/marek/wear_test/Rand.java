package com.example.marek.wear_test;

import java.util.Random;

/**
 * Created by marek on 13.11.15.
 */
public class Rand {
    public int getRandomNr(int modulo){
        Random rand = new Random();
        int randNr =  Math.abs(rand.nextInt()*10) % modulo;
        return randNr;
    }
}
