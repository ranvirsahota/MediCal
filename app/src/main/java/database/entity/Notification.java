package database.entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "notification")
public class Notificaiton {

    @PrimaryKey(autoGenerate = true)
    public int notificationId;
    @ColumnInfo(name="sms")
    private int sms;

    @ColumnInfo(name="alarm_1")
    private int alarm1;

    @ColumnInfo(name="alarm_2")
    private int alarm2;

    @ColumnInfo(name="alarm_3")
    private int alarm3;


    @ColumnInfo(name="notification_1")
    private int notification1;

    @ColumnInfo(name="notification_2")
    private int notification2;

    @ColumnInfo(name="notification_3")
    private int notification3;
}
