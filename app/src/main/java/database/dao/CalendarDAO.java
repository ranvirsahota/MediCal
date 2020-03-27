package database.dao;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import database.entity.data.Calendar;

@Dao
public interface CalendarDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert (Calendar calendar);

    @Delete()
    void delete (Calendar calendar);
}
