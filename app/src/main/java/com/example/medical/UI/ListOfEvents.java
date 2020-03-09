//Name:

package com.example.medical.UI;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import com.example.medical.R;
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
        eventList.add(new Event("haha","hehe","hihi"));
        eventList.add(new Event("Prescription is due","Andrei","5th of April"));

        EventAdapter mAdapter = new EventAdapter(this, eventList);
        listView.setAdapter(mAdapter);

    }
}
