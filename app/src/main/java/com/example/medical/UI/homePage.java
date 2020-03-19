package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medical.R;

public class homePage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_page);
    }

    public void calendarBtn (View view){

        Intent calBtn = new Intent( homePage.this, Calender.class);
        startActivity(calBtn);
    }

    public void signIn (View view){

        Intent signIn = new Intent( homePage.this, Login.class);
        startActivity(signIn);
    }
}
