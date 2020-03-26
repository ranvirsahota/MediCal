package Database;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class AccountsAndCalendar {
    @Embedded public Accounts accounts;
    @Relation(
            parentColumn = "accountId",
            entityColumn = "account_id"
    )
    public List<Calendar> calendars;
}
