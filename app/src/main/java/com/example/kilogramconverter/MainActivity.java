package com.example.kilogramconverter;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    /* Initialize the instances of the variables necessary for the calculator
     * 9 ImageButtons (1 for each weight of plate)
     * 2 Buttons (1 for the remove functionality and 1 for the clear function)
     * 2 EditTexts (1 for the Kilograms Display and 1 for the Pounds Display)
     * 4 doubles (2 for the positive kg/lbs and 2 for the negative kg/lbs)
     * 1 boolean (to identify whether we are in 'remove' mode or 'add' mode)
     */
    ImageButton b25kg, b20kg, b15kg, b10kg, b5kg, b2kg, b1kg, b0kg, bsmallkg;
    Button bclear, brem;
    EditText KG, LBS;
    double val1, val2, val3, val4;
    boolean remove = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Initialize the ImageButtons, Buttons, and EditTexts to the corresponding
        //instances in activity_main.xml
        b25kg = findViewById(R.id.button0);
        b20kg = findViewById(R.id.button1);
        b15kg = findViewById(R.id.button2);
        b10kg = findViewById(R.id.button3);
        b5kg = findViewById(R.id.button4);
        b2kg = findViewById(R.id.button5);
        b1kg = findViewById(R.id.button6);
        b0kg = findViewById(R.id.button7);
        bsmallkg = findViewById(R.id.button10);
        bclear = findViewById(R.id.button8);
        brem = findViewById(R.id.button9);
        KG = findViewById(R.id.Kilograms);
        LBS = findViewById(R.id.Pounds);

        //Set the background color of the buttons to transparent so there is no
        //ugly gray box surrounding the plates (looks much prettier now)
        b25kg.setBackgroundColor(Color.TRANSPARENT);
        b20kg.setBackgroundColor(Color.TRANSPARENT);
        b15kg.setBackgroundColor(Color.TRANSPARENT);
        b10kg.setBackgroundColor(Color.TRANSPARENT);
        b5kg.setBackgroundColor(Color.TRANSPARENT);
        b2kg.setBackgroundColor(Color.TRANSPARENT);
        b1kg.setBackgroundColor(Color.TRANSPARENT);
        b0kg.setBackgroundColor(Color.TRANSPARENT);
        bsmallkg.setBackgroundColor(Color.TRANSPARENT);

        //Make sure the number is NOT editable
        //Reset the color to a deep Black
        KG.setEnabled(false);
        LBS.setEnabled(false);
        KG.setTextColor(Color.BLACK);
        LBS.setTextColor(Color.BLACK);


        //Override the onClick for the 25 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 25kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b25kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 25.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 55.1156;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else {
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 25.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 55.1156;
                    //ensure positive values only
                    if (val2 < 0) {
                        val2 = 0.00;
                    }
                    if (val4 < 0) {
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 20 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 20kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b20kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 20.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 44.0925;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 20.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 44.0925;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 15 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 15kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b15kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 15.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 33.0693;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 15.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 33.0693;
                    //ensure positive values only
                    if(val2 < 0) {
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 10 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 10kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b10kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 10.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 22.0462;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 10.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 22.0462;
                    //ensure positive values only
                    if(val2 < 0) {
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 5 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 5kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b5kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 5.00;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 11.0231;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 5.00;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 11.0231;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 2.5 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 2.5kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b2kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 2.50;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 5.51156;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 2.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 5.51156;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 1.25 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 1.25kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b1kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 1.25;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 2.755778;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 1.25;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 2.755778;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 0.5 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 0.5kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        b0kg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 0.50;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 1.10231;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 0.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 1.10231;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 0.25 kilogram plate
        //onClick adds the kilogram and corresponding pound values for 0.25kg plates to the display
        //Round to 2 decimal places for pounds
        //Only print values of >= 0
        bsmallkg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                //add mode
                if(!remove){
                    val1 = Double.parseDouble(KG.getText().toString());
                    val1 += 0.25;
                    val3 = Double.parseDouble(LBS.getText().toString());
                    val3 += 0.5511557;
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val1));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val3));
                }
                //remove mode
                else{
                    val2 = Double.parseDouble(KG.getText().toString());
                    val2 -= 0.50;
                    val4 = Double.parseDouble(LBS.getText().toString());
                    val4 -= 0.5511557;
                    //ensure positive values only
                    if(val2 < 0){
                        val2 = 0.00;
                    }
                    if(val4 < 0){
                        val4 = 0.00;
                    }
                    KG.setText(String.format(Locale.getDefault(),"%.2f",val2));
                    LBS.setText(String.format(Locale.getDefault(),"%.2f",val4));
                }
            }
        });

        //Override the onClick for the 'clear' button's functionality
        //onClick here results in a clear of the current kilogram and pound values back to 0
        bclear.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                KG.setText(String.format(Locale.getDefault(),"%.2f",0.00));
                LBS.setText(String.format(Locale.getDefault(),"%.2f",0.00));
            }
        });

        //Override the onClick for the 'remove' button's functionality
        //onClick here results in a change of the boolean remove to whatever it is currently not
        //true -> false or false -> true
        //if remove is false(default) then we are in add mode and continually add plates
        //else remove is true and we are in remove mode and continually remove plates
        brem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!remove){
                    remove = true;
                    brem.setText(R.string.rem);
                    brem.setBackgroundColor(Color.parseColor("red"));
                }
                else{
                    remove = false;
                    brem.setText(R.string.add);
                    brem.setBackgroundColor(Color.parseColor("green"));
                }
            }
        });
    }
}
