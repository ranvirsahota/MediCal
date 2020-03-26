package database.dao;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Query;

import java.util.List;

import database.views.EventReminderNotification;

@Dao
public interface EventReminderNotificationDAO {

    @Query("SELECT * FROM EventReminderNotification WHERE EventReminderNotification.date = date")
    LiveData<List<EventReminderNotification>> getEventsOnSelectedDate(int date);
}
