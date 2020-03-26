package database.entity.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "calendar")
public class Calendar {

    public Calendar(String accountID) { this.accountID = accountID; }

    @ColumnInfo(name = "calendar_id")
    @PrimaryKey(autoGenerate = true)
    public int calendarID;

    @ColumnInfo(name="account_id")
    public String accountID;
}
