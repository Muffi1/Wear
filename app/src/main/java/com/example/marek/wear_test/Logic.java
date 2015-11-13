package com.example.marek.wear_test;

import java.util.Random;

/**
 * Created by marek on 12.11.15.
 */
public class Logic {
    public String GetColour() {
            Random rand = new Random();
            int i = rand.nextInt()*10 %10;
            switch (i) {
                case 1: return "#ab47bc";
                case 2: return "#ef5350";
                case 3: return "#ad1457";
                case 4: return "#64b5f6";
                case 5: return "#29b6f6";
                case 6: return "#26c6da";
                case 7: return "#c6ff00";
                case 8: return "#ffeb3b";
                case 9: return "#f4511e";
                default: return "#ffffff";

            }


    }
}
