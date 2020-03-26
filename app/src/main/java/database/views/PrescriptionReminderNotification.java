package database.views;
import androidx.room.DatabaseView;

//Select columns from the described table to fill variables
@DatabaseView("")
public class PrescriptionReminderNotification {

    public PrescriptionReminderNotification(int eventID, String medicationName,
                                            int dosage, int time, int date, int sms, int alarm1, int alarm2, int alarm3,
                                            int notification1, int notification2, int notification3) {
        this.eventID = eventID;
        this.medicationName = medicationName;
        this.dosage = dosage;
        this.time = time;
        this.date = date;
        this.sms = sms;
        this.alarm1 = alarm1;
        this.alarm2 = alarm2;
        this.alarm3 = alarm3;
        this.notification1 = notification1;
        this.notification2 = notification2;
        this.notification3 = notification3;
    }

    private int eventID;

    private String medicationName;

    private int dosage;

    private int time;

    private int date;

    //Notification Table
    private int sms;

    private int alarm1;

    private int alarm2;

    private int alarm3;

    private int notification1;

    private int notification2;

    private int notification3;
}
