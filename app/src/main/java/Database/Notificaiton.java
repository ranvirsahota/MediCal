package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Notificaiton {

    @PrimaryKey(autoGenerate = true)
    public int notificationId;
    @ColumnInfo(name="sms")
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
