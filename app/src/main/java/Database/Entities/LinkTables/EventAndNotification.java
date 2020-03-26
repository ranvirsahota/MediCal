package Database;

import androidx.room.Embedded;
import androidx.room.Relation;

import java.util.List;

public class EventAndNotification {
    @Embedded public Event event;
    @Relation(
            parentColumn = "notification_id",
            entityColumn = "notificationId"

    )
    public List<Notification> notification;
}
