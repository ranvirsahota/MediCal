//Name:
package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.example.medical.R;

public class Registration extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration);
    }

    public void backButton (View view){

        Intent backButt = new Intent( Registration.this, Login.class);
        startActivity(backButt);
    }
}
