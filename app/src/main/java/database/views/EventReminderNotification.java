package database.views;

import androidx.room.DatabaseView;

//Select columns from the described table to fill variables
@DatabaseView("")
public class EventReminderNotification {

    public EventReminderNotification(int eventReminderID, String eventName, String location, String notes, int time, int date,
                                     int sms, int alarm1, int alarm2, int alarm3,
                                     int notification1, int notification2, int notification3) {
        this.eventReminderID = eventReminderID;
        this.eventName = eventName;
        this.location = location;
        this.notes = notes;
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
    //EventReminder Table
    private int eventReminderID;

    private String eventName;
    public String getEventName() { return eventName; }

    private String location;

    private String notes;

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