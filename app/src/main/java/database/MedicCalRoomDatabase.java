package database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

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
    EventDao eventDao;
    EventReminderNotificationDAO eventReminderNotificationDAO;


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
}
