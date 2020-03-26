package database.entity.data;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity(tableName = "event")
public class Event{

    public Event(int eventID, int calendarId, int notificationID) {
        this.eventID = eventID;
        this.calendarId = calendarId;
        this.notificationID = notificationID;
    }

    @ColumnInfo(name = "event_id")
    @PrimaryKey(autoGenerate = true)
    public int eventID;

    @ColumnInfo(name="calendar_id")
    public int calendarId;

    @ColumnInfo(name="notification_id")
    public int notificationID;
}