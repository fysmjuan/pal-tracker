package io.pivotal.pal.tracker;

import io.pivotal.pal.trackerapi.TimeEntry;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;


public class InMemoryTimeEntryRepository implements TimeEntryRepository{


    HashMap< Long, TimeEntry> db = new HashMap<>();
    long currentId = 1;

    @Override
    public TimeEntry create(TimeEntry timeEntry) {
        if( timeEntry.getId() == 0) {
            timeEntry.setId(currentId++);
        }
        db.put(timeEntry.getId(), timeEntry);
        return timeEntry;
    }

    @Override
    public TimeEntry find(long id) {
        TimeEntry result = db.get(id);
        return result;
    }

    @Override
    public List<TimeEntry> list() {
        return new ArrayList<>(db.values());
    }

    @Override
    public TimeEntry update(long id, TimeEntry timeEntry) {
        TimeEntry result = db.get(id);
        if( result != null) {
            timeEntry.setId(id);
            db.put(id, timeEntry);
            return timeEntry;
        }
        else {
            return null;
        }
    }

    @Override
    public void delete(long id) {
        db.remove(id);
    }
}
