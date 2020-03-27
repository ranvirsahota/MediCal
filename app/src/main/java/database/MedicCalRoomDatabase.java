package database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import database.entity.data.*;
import database.views.*;
import database.dao.*;


@Database(entities = {Accounts.class, Calendar.class, Event.class,
        EventReminder.class, Notification.class, PrescriptionReminders.class},
        views = {EventReminderNotification.class, PrescriptionReminderNotification.class},
        version = 1, exportSchema = false)
public abstract class MedicCalRoomDatabase extends RoomDatabase {
    //Might need to be specified as abstract but comes up with an error
    AccountsDAO accountsDao;
    CalendarDAO calendarDao;
    EventDao eventDao;
    EventReminderDAO eventReminderDao;
    EventReminderNotificationDAO eventReminderNotificationDAO;
    NotificationDAO notificationDao;
    PrescriptionRemindersDAO prescriptionRemindersDao;

    private static volatile MedicCalRoomDatabase INSTANCE;
    private static final int NUMBER_OF_THREADS = 4;
    static final ExecutorService databaseWriteExecutor =
            Executors.newFixedThreadPool(NUMBER_OF_THREADS);
    public static MedicCalRoomDatabase getDatabase(final Context context) {
        if (INSTANCE == null) {
            synchronized (MedicCalRoomDatabase.class) {
                if (INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(),
                            MedicCalRoomDatabase.class, "medical_database")
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    private static MedicCalRoomDatabase.Callback  sRoomDatabaseCallback = new RoomDatabase.Callback(){
        private void run() {
            AccountsDAO AccountsDao = INSTANCE.accountsDao;
            CalendarDAO CalendarDao = INSTANCE.calendarDao;
            EventDao EventDao = INSTANCE.eventDao;
            EventReminderDAO EventReminderDao=INSTANCE.eventReminderDao;
            NotificationDAO NotificationDao=INSTANCE.notificationDao;
            PrescriptionRemindersDAO PrescriptionReminderDao = INSTANCE.prescriptionRemindersDao;

            Accounts accountEntry = new Accounts("test@test.com", "password123",
                    "John", "Smith", 3, "Street", "Avenue Place",
                    "Portsmouth", "Hampshire","PO23 3RG", 789078965);
            Calendar calendarEntry = new Calendar(1,1);
            Event eventEntry = new Event(1, 1, 1);
            Event eventEntry2 = new Event(2, 1, 1);
            EventReminder eventReminderEntry = new EventReminder(1,"Doctors Appointment","Surgery","Bring Coat",1400,27032020);
            Notification notificationEntry = new Notification(10,20,30,40,50,60,70);
            PrescriptionReminders prescriptionReminderEntry = new PrescriptionReminders(2,"Paracetamol",1000,1400,01012020);

            AccountsDao.insert(accountEntry);
            CalendarDao.insert(calendarEntry);
            EventDao.insert(eventEntry);
            EventDao.insert(eventEntry2);
            EventReminderDao.insert(eventReminderEntry);
            NotificationDao.insert(notificationEntry);
            PrescriptionReminderDao.insert(prescriptionReminderEntry);


        }

        @Override
        public  void onOpen(SupportSQLiteDatabase db){
            super.onOpen(db);
            databaseWriteExecutor.execute(this::run);
        }
    };

}
