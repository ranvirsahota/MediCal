package database.entity.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notification")
public class Notification {
    public Notification(int sms, int alarm1, int alarm2, int alarm3, int notification1, int notification2, int notification3) {
        this.sms = sms;
        this.alarm1 = alarm1;
        this.alarm2 = alarm2;
        this.alarm3 = alarm3;
        this.notification1 = notification1;
        this.notification2 = notification2;
        this.notification3 = notification3;
    }

    @ColumnInfo(name = "event_id")
    @PrimaryKey(autoGenerate = true)
    public int eventID;

    public int sms;

    @ColumnInfo(name="alarm_1")
    public int alarm1;

    @ColumnInfo(name="alarm_2")
    public int alarm2;

    @ColumnInfo(name="alarm_3")
    public int alarm3;

    @ColumnInfo(name="notification_1")
    public int notification1;

    @ColumnInfo(name="notification_2")
    public int notification2;

    @ColumnInfo(name="notification_3")
    public int notification3;
}
