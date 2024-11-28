package training.taylor.timetracker.core;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import training.taylor.timetracker.core.dao.TimeEntry;

/**
 * Created by Jason on 6/19/2015.
 */
@Configuration
@ComponentScan("training.taylor.timetracker.core")
public class TrackerCoreConfig {

    @Bean(name = "timesheet")
    List<TimeEntry> timeEntries() {
        return new ArrayList<>();
    }
}
