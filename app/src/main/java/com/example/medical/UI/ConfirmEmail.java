package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medical.R;

public class ConfirmEmail extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.confirm_email);
    }

    public void homeButton (View view){

        Intent homeButt = new Intent( ConfirmEmail.this, homePage.class);
        startActivity(homeButt);
    }
}
