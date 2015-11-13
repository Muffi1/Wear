package com.example.marek.wear_test;

/**
 * Created by marek on 13.11.15.
 */
public class BMI {
    public float BMI(int vaha, int vyska) {
        float bmi = (float) vaha / (((float) vyska*vyska)/10000);
        if (bmi<0 || bmi>150) {bmi=25;}
        return bmi;
    }
}
