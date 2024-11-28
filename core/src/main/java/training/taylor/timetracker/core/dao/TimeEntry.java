/** @see index.html */
package training.taylor.timetracker.core.dao;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

/**
 * Created by Jason on 6/19/2015.
 */
@Component
@Scope("prototype")
public class TimeEntry {

    /** Description. */
    private String description;

    /** Rate. */
    private float rate;

    /** Time. */
    private int time;

    /** {@inheritDoc} */
    public final String getDescription() {
        return description;
    }

    /** {@inheritDoc} */
    public final void setDescription(final String value) {
        this.description = value;
    }

    /** {@inheritDoc} */
    public final float getRate() {
        return rate;
    }

    /** {@inheritDoc} */
    public final void setRate(final float value) {
        this.rate = value;
    }

    /** {@inheritDoc} */
    public final int getTime() {
        return time;
    }

    /** {@inheritDoc} */
    public final void setTime(final int value) {
        this.time = value;
    }

    @Override
    public final String toString() {
        return "TimeEntry{"
                + "description='" + description + '\''
                + ", rate=" + rate
                + ", time=" + time
                + '}';
    }
}
