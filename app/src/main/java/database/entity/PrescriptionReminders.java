package database.entity;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;
@Entity
public class Prescription_Reminders {
    @PrimaryKey
    private int prescriptionId;

    @ColumnInfo(name="medication_name")
    private String medicationName;
    public String getMedicationName() { return medicationName; }
    public void setMedicationName(String medicationName) { this.medicationName = medicationName; }

    @ColumnInfo(name="dosage")
    private int dosage;
    public int getDosage() { return dosage; }
    public void setDosage(int dosage) { this.dosage = dosage; }

    @ColumnInfo(name="time")
    private int time;
    public void setTime(int time) { this.time = time; }
    public int getTime() { return time; }

    @ColumnInfo(name="date")
    private int date;
    public int getDate() { return date; }
    public void setDate(int date) { this.date = date; }
}