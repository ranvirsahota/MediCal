package database.entity.data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "calendar")
public class Calendar {

    public Calendar(int accountID, int calendarID) {this.accountID = accountID;}

    @ColumnInfo(name = "calendar_id")
    @PrimaryKey(autoGenerate = true)
    public int calendarID;

    @ColumnInfo(name="account_id")
    public int accountID;
}
