//Name:

package com.example.medical.UI;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CalendarView;
import com.example.medical.R;


public class Calender extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calender);

        CalendarView calendarView = findViewById(R.id.calendarView);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {


                Intent intent = new Intent(Calender.this, ListOfEvents.class);
                startActivity(intent);
            }
        });

    }
    public void logIn (View view){

        Intent signIn = new Intent( Calender.this, Login.class);
        startActivity(signIn);
    }
}
