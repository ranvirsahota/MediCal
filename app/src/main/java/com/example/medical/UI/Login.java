//Name:

package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medical.R;

public class Login extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void homeButton (View view){

        Intent homeButt = new Intent( Login.this, Calender.class);
        startActivity(homeButt);
    }
}
