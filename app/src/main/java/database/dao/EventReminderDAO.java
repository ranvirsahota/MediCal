package database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import database.entity.data.EventReminder;

@Dao
public interface EventReminderDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(EventReminderDAO eventReminder);
    @Update()
    void update(EventReminder eventReminder);
    @Delete()
    void delete(EventReminder eventReminder);

}
