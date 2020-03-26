package database.entity.linktables;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

import database.entity.data.Accounts;
import database.entity.data.Calendar;


public class AccountsAndCalendar {
    @Embedded public Accounts accounts;
    @Relation(
            parentColumn = "account_id",
            entityColumn = "account_id"
    )
    public List<Calendar> calendars;
}
