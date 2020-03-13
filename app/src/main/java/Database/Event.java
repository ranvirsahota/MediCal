package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;


@Entity
public class Event{

    @PrimaryKey
    public int eventId;

    @ColumnInfo(name="notification_id")
    public int notificaitonId;

    @ColumnInfo(name="prescription_Id")
    public int prescriptionId;

    @ColumnInfo(name="event_reminder_id")
    public int eventReminderId;
}
