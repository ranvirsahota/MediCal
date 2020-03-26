package database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import database.entity.data.Notification;

@Dao
public interface NotificationDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(Notification notification);
    @Update()
    void update(Notification notification);
    @Delete
    void delete(Notification notification);
}
