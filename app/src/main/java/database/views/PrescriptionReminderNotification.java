package database.views;
import androidx.room.DatabaseView;

//Select columns from the described table to fill variables
@DatabaseView("SELECT prescription_reminders.event_id, prescription_reminders.medication_name, prescription_reminders.dosage, prescription_reminders.time, prescription_reminders.date, notification.sms, notification.alarm_1,notification.alarm_2,notification.alarm_3,notification.notification_1,notification.notification_2,notification.notification_3 FROM prescription_reminders INNER JOIN event ON prescription_reminders.event_id = event.event_id INNER JOIN notification ON notification.event_id")
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
