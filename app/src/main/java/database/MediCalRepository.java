package database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import database.dao.EventDao;
import database.dao.EventReminderNotificationDAO;
import database.entity.data.Event;
import database.views.EventReminderNotification;

public class MediCalRepository {
    private EventDao eventDao;
    private EventReminderNotificationDAO eventReminderNotificationDAO;
    private LiveData<List<EventReminderNotification>> eventsForSelectedDate;

    public MediCalRepository(Application application) {
        MedicCalRoomDatabase db = MedicCalRoomDatabase.getDatabase(application);
        eventReminderNotificationDAO = db.eventReminderNotificationDAO;
        //Must find a way to pass date
        eventsForSelectedDate = eventReminderNotificationDAO.getEventsOnSelectedDate();
    }
    public LiveData<List<EventReminderNotification>> getUsersEvents() { return eventsForSelectedDate; }

    //Need to implement remaining functionality
    public void insert(Event event) {
        MedicCalRoomDatabase.databaseWriteExecutor.execute(() -> { eventDao.insert(event); });
    }

}
