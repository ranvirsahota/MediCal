package com.example.medical.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.medical.R;

import java.util.List;

import database.views.EventReminderNotification;

public class EventListAdapter extends RecyclerView.Adapter<EventListAdapter.EventViewHolder> {

    class EventViewHolder extends RecyclerView.ViewHolder {
        private final TextView eventViewItem;


        private EventViewHolder(View itemView) {
            super(itemView);
            eventViewItem = itemView.findViewById(R.id.textView);
        }
    }

    private final LayoutInflater mInflater;
    private List<EventReminderNotification> eventsForSelectedDate; // Cached copy of words

    EventListAdapter(Context context) { mInflater = LayoutInflater.from(context); }

    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = mInflater.inflate(R.layout.recyclerview_item, parent, false);
        return new EventViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(EventViewHolder holder, int position) {
        if (eventsForSelectedDate != null) {
            EventReminderNotification current = eventsForSelectedDate.get(position);
            holder.eventViewItem.setText(current.getEventName());
        } else {
            // Covers the case of data not being ready yet.
            holder.eventViewItem.setText("No Event Name");
        }
    }

    void setEvents(List<EventReminderNotification> eventsForSelectedDate){
        this.eventsForSelectedDate = eventsForSelectedDate;
        notifyDataSetChanged();
    }

    // getItemCount() is called many times, and when it is first called,
    // mWords has not been updated (means initially, it's null, and we can't return null).
    @Override
    public int getItemCount() {
        if (eventsForSelectedDate != null)
            return eventsForSelectedDate.size();
        else return 0;
    }
}