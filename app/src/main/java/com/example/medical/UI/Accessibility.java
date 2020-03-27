package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import com.example.medical.R;
import android.widget.Button;
import android.widget.TextView;
import android.graphics.Color;
import android.view.View;
import android.util.TypedValue;
import com.example.medical.R;

public class Accessibility extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accessibility);
    }

    public void ChangeTextReg(View v)
    {
        /*In order to change text size I have seperated them into three catergories, header, buttons and mainbody
         These will then have there id's stored in an array so I can refernce them later
        */
        Button ChangeReg = (Button) findViewById(R.id.button10);
        int[] ButtonIDArray = new int[]
                /*
                The Id's commented out below are the correct id's for each catergory for the other pages, I need to use intents to pass
                the updated text size back to these other activities
                */

                /*{R.id.button, R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button9,R.id.button10};*/
                {R.id.button7,R.id.button8,R.id.button9,R.id.button10};
        int[] HeaderIDArray = new int[]
                /*{R.id.textView,R.id.textView2,R.id.textView22};*/
                {R.id.textView22};
        int[] BodyIDArray = new int[]
                {R.id.textView20};
                /*{R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9,R.id.textView10,
                        R.id.textView11,R.id.textView12,R.id.textView13,R.id.textView14,R.id.textView15,R.id.textView16,R.id.textView17,R.id.textView18,R.id.textView19,R.id.textView20,
                        R.id.textView21,R.id.textView23,R.id.textView24};*/

        
        /*By using a for each loop I am able to go through the arrays and easily change all the sizes with one click of the button*/
        for (int value : ButtonIDArray) {
            Button but = (Button) findViewById(value);
            but.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        }
        for (int value : HeaderIDArray) {
            TextView Head = (TextView) findViewById(value);
            Head.setTextSize(TypedValue.COMPLEX_UNIT_SP, 30);
        }
        for (int value : BodyIDArray) {
            TextView Body = (TextView) findViewById(value);
            Body.setTextSize(TypedValue.COMPLEX_UNIT_SP, 14);
        }

        ChangeReg.setText("Selected");
    }

    public void ChangeTextLarge(View v)
    {
        Button ChangeLarge = (Button) findViewById(R.id.button9);
        int[] ButtonIDArray = new int[]
                /*{R.id.button, R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button9,R.id.button10};*/
                {R.id.button7,R.id.button8,R.id.button9,R.id.button10};
        int[] HeaderIDArray = new int[]
                /*{R.id.textView,R.id.textView2,R.id.textView22};*/
                {R.id.textView22};
        int[] BodyIDArray = new int[]
                {R.id.textView20};
                /*{R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9,R.id.textView10,
                        R.id.textView11,R.id.textView12,R.id.textView13,R.id.textView14,R.id.textView15,R.id.textView16,R.id.textView17,R.id.textView18,R.id.textView19,R.id.textView20,
                        R.id.textView21,R.id.textView23,R.id.textView24};*/

        for (int value : ButtonIDArray) {
            Button but = (Button) findViewById(value);
            but.setTextSize(TypedValue.COMPLEX_UNIT_SP, 15);
        }
        for (int value : HeaderIDArray) {
            TextView Head = (TextView) findViewById(value);
            Head.setTextSize(TypedValue.COMPLEX_UNIT_SP, 35);
        }
        for (int value : BodyIDArray) {
            TextView Body = (TextView) findViewById(value);
            Body.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        ChangeLarge.setText("Selected");
    }

    public void ChangeTextExtra(View v)
    {
        Button ChangeExtra = (Button) findViewById(R.id.button7);
        
 
        int[] ButtonIDArray = new int[]
                /*{R.id.button, R.id.button2,R.id.button3,R.id.button4,R.id.button5,R.id.button6,R.id.button7,R.id.button8,R.id.button9,R.id.button9,R.id.button10};*/
                {R.id.button7,R.id.button8,R.id.button9,R.id.button10};
        int[] HeaderIDArray = new int[]
                /*{R.id.textView,R.id.textView2,R.id.textView22};*/
                {R.id.textView22};
        int[] BodyIDArray = new int[]
                {R.id.textView20};
                /*{R.id.textView3,R.id.textView4,R.id.textView5,R.id.textView6,R.id.textView7,R.id.textView8,R.id.textView9,R.id.textView10,
                        R.id.textView11,R.id.textView12,R.id.textView13,R.id.textView14,R.id.textView15,R.id.textView16,R.id.textView17,R.id.textView18,R.id.textView19,R.id.textView20,
                        R.id.textView21,R.id.textView23,R.id.textView24};*/

        for (int value : ButtonIDArray) {
            Button but = (Button) findViewById(value);
            but.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20);
        }
        for (int value : HeaderIDArray) {
            TextView Head = (TextView) findViewById(value);
            Head.setTextSize(TypedValue.COMPLEX_UNIT_SP, 40);
        }
        for (int value : BodyIDArray) {
            TextView Body = (TextView) findViewById(value);
            Body.setTextSize(TypedValue.COMPLEX_UNIT_SP, 25);
        }
        ChangeExtra.setText("Selected");
    }
    public void Returnbutton(View view) {

        Intent returnintent = new Intent(Accessibility.this, homePage.class);
        startActivity(returnintent);
    }

}


