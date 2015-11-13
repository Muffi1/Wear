package com.example.marek.wear_test;


/**
 * Created by marek on 13.11.15.
 */
public class WearChoser {
    public String Wear(int vaha, int vyska, int prsa, int pas, boolean menstruace) {
        float bmi = new BMI().BMI(vaha, vyska);
        //if (bmi<0 || bmi>50) {bmi=25;}

        double prsaKoeficient = (double) prsa/ (double)pas;
        if (prsaKoeficient<0 || prsaKoeficient>5) {prsaKoeficient= 1.3;}
        double velkaPrsa = 1.25;

        SysDate sd = new SysDate();
        boolean isWeekend = sd.isWeekday();

        //int rand1 = rand.nextInt()*10 %10;

        String spodek = null;
        String vrsek = null;

        //vyberu spodek
        if (bmi>25 && menstruace == false) {
            int rand1 = new Rand().getRandomNr(2);
            switch (rand1) {
                case 0: spodek="sukne"; break;
                case 1: spodek="kalhoty"; break;
            }
        }
        if (menstruace == true) {spodek="kalhoty";}
        if (bmi<=25 && menstruace == false && isWeekend == true) {
            int rand1 = new Rand().getRandomNr(6);
            switch (rand1) {
                case 1: spodek="leginy"; break;
                case 2: spodek="kalhoty"; break;
                case 3: spodek="sukne"; break;
                case 4: spodek="minisukne"; break;
                case 5: spodek="sortky"; break;
                case 0: spodek="saty"; break;
            }
        }

        if (bmi<=25 && menstruace == false && isWeekend == false) {
            int rand1 = new Rand().getRandomNr(4);
            switch (rand1) {
                case 1: spodek="kalhoty"; break;
                case 2: spodek="sukne"; break;
                case 3: spodek="minisukne"; break;
                case 0: spodek="saty"; break;
            }
        }

        // vyberu vrsek
        if (true) { //omezit pri volbe saty
            if (bmi>25) {
                int rand1 = new Rand().getRandomNr(2);
                switch (rand1) {
                    case 1: vrsek="tricko"; break;
                    case 0: vrsek="kosile"; break;
                }
            }
            if (bmi<=25 && prsaKoeficient<velkaPrsa && isWeekend == true) {
                int rand1 = new Rand().getRandomNr(3);
                switch (rand1) {
                    case 1: vrsek="tricko"; break;
                    case 2: vrsek="kosile"; break;
                    case 0: vrsek="top"; break;
                }
            }

            if (bmi<=25 && prsaKoeficient<velkaPrsa && isWeekend == false) {
                int rand1 = new Rand().getRandomNr(2);
                switch (rand1) {
                    case 1: vrsek="tricko"; break;
                    case 0: vrsek="kosile"; break;
                }
            }

            if (bmi<=25 && prsaKoeficient>velkaPrsa && isWeekend == true) {
                int rand1 = new Rand().getRandomNr(4);
                switch (rand1) {
                    case 1: vrsek="tricko"; break;
                    case 2: vrsek="kosile"; break;
                    case 3: vrsek="tricko s vystrihem"; break;
                    case 0: vrsek="top"; break;
                }
            }

            if (bmi<=25 && prsaKoeficient>velkaPrsa && isWeekend == false) {
                int rand1 = new Rand().getRandomNr(3);
                switch (rand1) {
                    case 1: vrsek="tricko"; break;
                    case 2: vrsek="kosile"; break;
                    case 0: vrsek="tricko s vystrihem"; break;
                }
            }

        }

        return String.valueOf("Dnes si oblec " + spodek + " a " + vrsek +".");
    }
}
