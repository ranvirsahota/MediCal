package database;

import android.app.Application;

import androidx.lifecycle.LiveData;

import java.util.List;

import database.dao.AccountsDAO;
import database.dao.CalendarDAO;
import database.dao.EventDao;
import database.dao.EventReminderDAO;
import database.dao.EventReminderNotificationDAO;
import database.dao.NotificationDAO;
import database.dao.PrescriptionRemindersDAO;
import database.entity.data.Accounts;
import database.entity.data.Event;
import database.entity.data.Notification;
import database.entity.data.PrescriptionReminders;
import database.views.EventReminderNotification;

public class MediCalRepository {
    private AccountsDAO accountsDAO;
    private CalendarDAO calendarDAO;
    private EventDao eventDao;
    private EventReminderDAO eventReminderDAO;
    private NotificationDAO notificationDAO;
    private PrescriptionRemindersDAO prescriptionRemindersDAO;
    private LiveData<List<EventReminderNotification>> eventsForSelectedDate;
    private EventReminderNotificationDAO eventReminderNotificationDAO;

    public MediCalRepository(Application application) {
        MedicCalRoomDatabase db = MedicCalRoomDatabase.getDatabase(application);
        eventReminderNotificationDAO = db.eventReminderNotificationDAO;
        //Must find a way to pass date
        eventsForSelectedDate = eventReminderNotificationDAO.getEventsOnSelectedDate(0);
    }
    public LiveData<List<EventReminderNotification>> getUsersEvents() { return eventsForSelectedDate; }

    //Need to implement remaining functionality
    public void insert(Event event) {
        MedicCalRoomDatabase.databaseWriteExecutor.execute(() -> { eventDao.insert(event); });
    }

}
