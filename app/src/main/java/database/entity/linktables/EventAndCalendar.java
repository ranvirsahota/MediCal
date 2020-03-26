package database.entity.linktables;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import database.entity.data.Calendar;
import database.entity.data.Event;

public class EventAndCalendar {
    @Embedded public Calendar calendar;
    @Relation(
            parentColumn = "calendar_id",
            entityColumn = "event_id"
    )
    public List<Event> events;
}
