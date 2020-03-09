package com.example.medical.UI;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import com.example.medical.R;

public class EventAdapter extends ArrayAdapter<Event> {

    private Context mContext;
    private List<Event> eventList ;

    public EventAdapter(@NonNull Context context, @LayoutRes ArrayList<Event> list) {
        super(context, 0 , list);
        mContext = context;
        eventList = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_event,parent,false);

        Event currentEvent = eventList.get(position);

        TextView name = listItem.findViewById(R.id.textView_name);
        name.setText(currentEvent.getName());

        TextView title = listItem.findViewById(R.id.textView_title);
        title.setText(currentEvent.getTitle());

        TextView date = listItem.findViewById(R.id.textView_date);
        date.setText(currentEvent.getDate());

        return listItem;

    }
}
