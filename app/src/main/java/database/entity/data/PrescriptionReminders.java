package database.entity.data;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "prescription_reminders")
public class PrescriptionReminders {

    public PrescriptionReminders(int eventID, String medicationName, int dosage, int time, int date) {
        this.eventID=eventID;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.time = time;
        this.date = date;
    }

    @ColumnInfo(name = "event_id")
    @PrimaryKey
    public int eventID;

    @ColumnInfo(name="medication_name")
    public String medicationName;

    public int dosage;

    public int time;

    public int date;
}