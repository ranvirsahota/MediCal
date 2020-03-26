package database.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Update;

import database.entity.data.PrescriptionReminders;

@Dao
public interface PrescriptionRemindersDAO {
    @Insert(onConflict = OnConflictStrategy.IGNORE)
    void insert(PrescriptionReminders prescriptionReminders);
    @Update
    void update(PrescriptionReminders prescriptionReminders);
    @Delete()
    void delete(PrescriptionReminders prescriptionReminders);
}
