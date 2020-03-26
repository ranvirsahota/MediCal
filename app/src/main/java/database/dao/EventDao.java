package database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;


import database.entity.data.Event;
@Dao
public interface EventDao {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert (Event event);

    @Delete()
    void delete (Event event);
}
