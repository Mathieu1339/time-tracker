package training.taylor.timetracker.core;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
public class Tracker {
    /** Entries. */
    @Autowired
    private List<TimeEntry> entries;

    /** {@inheritDoc} */
    public final void add(final TimeEntry entry) {
        entries.add(entry);
    }

    /** {@inheritDoc} */
    public final void remove(final TimeEntry entry) {
        entries.remove(entry);
    }

    /** {@inheritDoc} */
    public final int size() {
        return entries.size();
    }

    /** {@inheritDoc} */
    public final TimeEntry get(final int index) {
        return entries.get(index);
    }
}
