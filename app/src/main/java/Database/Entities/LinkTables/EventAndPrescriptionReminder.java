package Database;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class EventAndPrescriptionReminder {
    @Embedded public Event event;
    @Relation(
            parentColumn = "eventId",
            entityColumn = "event_id"
    )
    public List<Prescription_Reminder> prescription_reminders;
}

