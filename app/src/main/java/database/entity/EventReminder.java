package database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Event_Reminder {
    @PrimaryKey(autoGenerate = true)
    private int eventReminderId;

    @ColumnInfo(name="event_name")
    private String eventName;
    public String getEventName() { return eventName; }
    public void setEventName(String eventName) { this.eventName = eventName; }


    @ColumnInfo(name="location")
    private String location;
    public String getLocation() { return location; }

    public void setLocation(String location) { this.location = location; }

    @ColumnInfo(name = "notes")
    private String notes;
    public String getNotes() { return notes; }
    public void setNotes(String notes) { this.notes = notes; }

    @ColumnInfo(name="time")
    private int time;
    public int getTime() { return time; }
    public void setTime(int time) { this.time = time; }

    @ColumnInfo(name="date")
    private int date;
    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }
}