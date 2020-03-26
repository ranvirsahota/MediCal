package Database;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class EventAndEventReminder {
    @Embedded public Event event;
    @Relation(
            parentColumn = "eventId",
            entityColumn = "event_id"
    )
    public List<Event_Reminder> Event_Reminders;
}
