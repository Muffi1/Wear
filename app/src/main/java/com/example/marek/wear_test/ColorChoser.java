package com.example.marek.wear_test;

import java.util.Random;

/**
 * Created by marek on 13.11.15.
 */
public class ColorChoser {
    public String[] ColorChoser() {
        SysDate sd = new SysDate();
        int month = sd.getMonth();
        Random rand = new Random();
        int rand1 = new Rand().getRandomNr(5);
        String[] barva = new String[2];
        barva[0]=String.valueOf("No data "+rand1);

        if (month>3 && month<11) { //letni barvy
            switch (rand1) {
                case 0: barva[0]="zluta jak kanarek."; barva[1]="#ffeb3b"; break;
                case 1: barva[0]="ruda jako zapad slunce."; barva[1]="#f44336";break;
                case 2: barva[0]="bila jako nevinost."; barva[1]="#ffffff";break;
                case 3: barva[0]="oranzova."; barva[1]="#ff9800";break;
                case 4: barva[0]="svezi limetkova."; barva[1]="#cddc39";break;
            }

        } else { //zimni barvy
            switch (rand1) {
                case 0: barva[0]="cerna jako duse Janis Joplin."; barva[1]="#616161";break;
                case 1: barva[0]="modra jako ocean pred bouri."; barva[1]="#03a9f4";break;
                case 2: barva[0]="fialova."; barva[1]="#9c27b0";break;
                case 3: barva[0]="tyrkisova."; barva[1]="#00bcd4";break;
                case 4: barva[0]="hneda."; barva[1]="#795548";break;
            }
        }
    return barva;

    }
}
