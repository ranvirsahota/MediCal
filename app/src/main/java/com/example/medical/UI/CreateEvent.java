package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medical.R;

public class CreateEvent extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_event);
    }

    public void homeButton (View view){

        Intent homeButt = new Intent( CreateEvent.this, homePage.class);
        startActivity(homeButt);
    }
}
