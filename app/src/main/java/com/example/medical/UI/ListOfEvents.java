//Name:

package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import com.example.medical.R;
import android.view.View;
import android.widget.ListView;
import java.util.ArrayList;

public class ListOfEvents extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_events);

        ListView listView = findViewById(R.id.list);

        // Testing only
        ArrayList<Event> eventList = new ArrayList<>();
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));

        EventAdapter mAdapter = new EventAdapter(this, eventList);
        listView.setAdapter(mAdapter);

    }
    public void backButton (View view){

        Intent backButt = new Intent( ListOfEvents.this, Calender.class);
        startActivity(backButt);
    }
}
