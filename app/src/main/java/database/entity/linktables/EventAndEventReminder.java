package database.entity.linktables;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import database.entity.data.Event;
import database.entity.data.EventReminder;

public class EventAndEventReminder {
    @Embedded public Event event;
    @Relation(
            parentColumn = "event_id",
            entityColumn = "event_id"
    )
    public List<EventReminder> Event_Reminders;
}
