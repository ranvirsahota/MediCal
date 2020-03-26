package viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

import java.util.List;

import database.MediCalRepository;
import database.entity.data.Event;
import database.views.EventReminderNotification;

public class EventViewModel extends AndroidViewModel {
    private MediCalRepository mediCalRepository;
    private LiveData<List<EventReminderNotification>> eventsForSelectedDate;

    public EventViewModel (Application application, int accountID) {
        super(application);
        mediCalRepository = new MediCalRepository(application);
        eventsForSelectedDate = mediCalRepository.getUsersEvents();
    }
    public LiveData<List<EventReminderNotification>> getEventsForSelectedDate() { return eventsForSelectedDate; }
    public void insert(Event event) { mediCalRepository.insert(event); }
}