package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Event{

    @PrimaryKey
    public int eventId;

    @ColumnInfo(name="calendar_id")
    public int calendarId;

    @ColumnInfo(name="notification_id")
    public int notificationId;


}
