package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Event_Reminder {
    @PrimaryKey(autoGenerate = true)
    public int eventReminderId;

    @ColumnInfo(name = "event_id")
    public int eventId;

    @ColumnInfo(name="event_name")
    public String eventName;

    @ColumnInfo(name="location")
    public String location;

    @ColumnInfo(name = "notes")
    public String notes;

    @ColumnInfo(name="time")
    public int time;

    @ColumnInfo(name="date")
    public int date;
}
