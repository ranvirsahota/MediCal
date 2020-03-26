package entity;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Calendar {
    @PrimaryKey(autoGenerate = true)
    public int calendarId;

    @ColumnInfo(name="account_id")
    public String accountID;

    @ColumnInfo(name="event_id")
    public String eventId;

}
