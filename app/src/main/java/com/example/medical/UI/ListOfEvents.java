//Name:

package com.example.medical.UI;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.medical.R;

import viewmodel.EventViewModel;

public class ListOfEvents extends AppCompatActivity {
    private EventViewModel eventViewModel;
    public static final int NEW_EVENT_ACTIVITY_REQUEST_CODE = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_of_events);

        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        final EventListAdapter adapter = new EventListAdapter(this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        eventViewModel = new ViewModelProvider(this).get(EventViewModel.class);
        eventViewModel.getEventsForSelectedDate().observe(this, eventReminderNotifications -> {
            // Update the cached copy of the words in the adapter.
            adapter.setEvents(eventReminderNotifications);
        });
    }
/*
    //To Create a new event
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        if (requestCode == NEW_EVENT_ACTIVITY_REQUEST_CODE && resultCode == RESULT_OK) {
            EventReminderNotification eventReminderNotification = new EventReminderNotification(data.getStringExtra(EditEventActivity.EXTRA_REPLY));
        }
        else {
            //Put string in resources section
            Toast.makeText(getApplicationContext(), "", Toast.LENGTH_LONG).show();
        }
    }
*/
    public void backButton (View view){
        Intent backButt = new Intent( ListOfEvents.this, Calender.class);
        startActivity(backButt);
    }
}
