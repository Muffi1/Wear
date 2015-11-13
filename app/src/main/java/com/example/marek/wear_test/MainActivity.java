package com.example.marek.wear_test;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //=========================graficke elementy
    //EditText ETprsa = (EditText) findViewById(R.id.editPrsa);
    //EditText ETvek = (EditText) findViewById(R.id.editVek);




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity);

        SysDate sd = new SysDate();
        sd.SysDate();
        TextView tx2 = (TextView) findViewById(R.id.textBarva);
        tx2.setText(String.valueOf("Dnes je : " + sd.getDate()) );
        //String dnesjeden = String.valueOf("Today is : " + String.valueOf(sd.getDate()));
        //tx.setText("Ahoj");
        //tx.setText(String.valueOf("Your wear colour for " +sd.getDate() + " shloud be: " ));

        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Logic mn = new Logic();



                //kontrola hodnot tlacitka vyska
                EditText ETvyska = (EditText) findViewById(R.id.editVyska);
                int EvyskaValue = -1;
                try{
                    EvyskaValue = Integer.parseInt(ETvyska.getText().toString());
                } catch (Exception e) {}

                if (EvyskaValue > 0 && EvyskaValue<200) {
                    ETvyska.setText(String.valueOf(EvyskaValue));
                } else {
                    ETvyska.setText("Potrebuji znat tvou vysku");
                }

                //kontrola hodnot tlacitka vaha
                EditText ETvaha = (EditText) findViewById(R.id.editVaha);
                int EvahaValue = -1;
                try{
                    EvahaValue = Integer.parseInt(ETvaha.getText().toString());
                } catch (Exception e) {}

                if (EvahaValue > 0 && EvahaValue<200) {
                    ETvaha.setText(String.valueOf(EvahaValue));
                } else {
                    ETvaha.setText("Potrebuji znat tvou vahu");
                }

                //kontrola hodnot tlacitka boky
                EditText ETboky = (EditText) findViewById(R.id.editBoky);
                int EbokyValue = -1;
                try{
                    EbokyValue = Integer.parseInt(ETboky.getText().toString());
                } catch (Exception e) {}

                if (EbokyValue > 0 && EbokyValue<200) {
                    ETboky.setText(String.valueOf(EbokyValue));
                } else {
                    ETboky.setText("Potrebuji znat tve boky");
                }

                //kontrola hodnot tlacitka pas
                EditText ETpas = (EditText) findViewById(R.id.editPas);
                int EpasValue = -1;
                try{
                    EpasValue = Integer.parseInt(ETpas.getText().toString());
                } catch (Exception e) {}

                if (EpasValue > 0 && EpasValue<200) {
                    ETpas.setText(String.valueOf(EpasValue));
                } else {
                    ETpas.setText("Potrebuji znat tvuj pas");
                }

                //kontrola hodnot tlacitka prsa
                EditText ETprsa = (EditText) findViewById(R.id.editPrsa);
                int EprsaValue = -1;
                try{
                    EprsaValue = Integer.parseInt(ETprsa.getText().toString());
                } catch (Exception e) {}

                if (EprsaValue > 0 && EprsaValue<200) {
                    ETprsa.setText(String.valueOf(EprsaValue));
                } else {
                    ETprsa.setText("Potrebuji znat tve prsa");
                }

                //kontrola hodnot tlacitka vek
                EditText ETvek = (EditText) findViewById(R.id.editVek);
                int EvekValue = -1;
                try{
                    EvekValue = Integer.parseInt(ETvek.getText().toString());
                } catch (Exception e) {}

                if (EvekValue > 0 && EvekValue<200) {
                    ETvek.setText(String.valueOf(EvekValue));
                } else {
                    ETvek.setText("Potrebuji znat tvuj vek");
                }

                //dotam info o BMI
                float bmiValue=0;
                BMI bmi = new BMI();
                bmiValue = bmi.BMI(EvahaValue, EvyskaValue);

                TextView tx3 = (TextView) findViewById(R.id.textBMI);
                if (bmiValue>25) {
                    tx3.setText(String.valueOf("Tvoje BMI je: " + String.valueOf(bmiValue) + ", a to je opravdu hodne, zkus trochu zhubnout alespon na BMI 25 a ziskas moznost oblekani novych druhu obleceni!"));
                } else {
                    tx3.setText(String.valueOf("Tvoje BMI je: " + String.valueOf(bmiValue) + ", to je uzasny vysledek!"));
                }


                // dotam info o obleceni
                TextView tx = (TextView) findViewById(R.id.text);
                WearChoser wc = new WearChoser();
                tx.setText(String.valueOf(wc.Wear(EvahaValue, EvyskaValue, EprsaValue, EpasValue, false)));

                //dodam info o barve
                String[] barva;
                ColorChoser cs = new ColorChoser();
                barva = cs.ColorChoser();
                LinearLayout ll = (LinearLayout) findViewById(R.id.Background);
                ll.setBackgroundColor(Color.parseColor(barva[1]));
                TextView tx2 = (TextView) findViewById(R.id.textBarva);
                tx2.setText(String.valueOf("Tvoje dnesni barva je " + barva[0] ));
            }

        });




    }


    }



