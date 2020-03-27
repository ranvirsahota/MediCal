package database.entity.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "event_reminder")
public class EventReminder {

    public EventReminder(int eventID, String eventName, String location, String notes, int time, int date) {
        this.eventID=eventID;
        this.eventName = eventName;
        this.location = location;
        this.notes = notes;
        this.time = time;
        this.date = date;
    }

    @ColumnInfo(name = "event_id")
    @PrimaryKey
    public int eventID;

    @ColumnInfo(name="event_name")
    public String eventName;

    public String location;

    public String notes;

    public int time;

    public int date;
}