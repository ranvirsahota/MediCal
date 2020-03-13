package Database;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Prescription_Reminders {
    @PrimaryKey
    public int prescriptionId;

    @ColumnInfo(name="medication_name")
    public String medicationName;

    @ColumnInfo(name="dosage")
    public int dosage;

    @ColumnInfo(name="time")
    public int time;

    @ColumnInfo(name="date")
    public int date;
}
