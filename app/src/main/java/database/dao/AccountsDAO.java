package database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;

import database.entity.data.Accounts;


@Dao
public interface AccountsDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert (Accounts accounts);

    @Delete()
    void delete (Accounts accounts);
}
