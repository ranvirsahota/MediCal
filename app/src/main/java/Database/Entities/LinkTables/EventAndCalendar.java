package Database;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class EventAndCalendar {
    @Embedded public Calendar calendar;
    @Relation(
            parentColumn = "calendarId",
            entityColumn = "calendarId"
    )
    public List<Event> events;
}
