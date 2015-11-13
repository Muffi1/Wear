package com.example.marek.wear_test;


import java.text.SimpleDateFormat;

import java.util.Calendar;

/**
 * Created by marek on 12.11.15.
 */
public class SysDate {
    static Calendar c = null;

    public void SysDate() {
        c = Calendar.getInstance();

    }

    //public void SysDate(String date) {
    //    d = new Date().setTime(System.currentTimeMillis());
    //}

    public int getMonth() {
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        return Integer.valueOf(sdf.format(c.getTime()));
    }

    public String getDate() {

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        return sdf.format(c.getTime());
    }

    static int getWeekDay() {
        return c.get(Calendar.DAY_OF_WEEK);
    }

    public boolean isWeekday() {
        switch (getWeekDay()) {
            case 1: return true;
            case 6: return true;
            case 7: return true;
            default: return false;
        }
    }

    public String test() {

        SimpleDateFormat sdf = new SimpleDateFormat("EEE, MMM d, yyyy");
        return sdf.format(c.getTime());
    }
}
