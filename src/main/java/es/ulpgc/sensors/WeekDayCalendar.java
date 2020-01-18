package es.ulpgc.sensors;

import java.util.Calendar;

public class WeekDayCalendar implements Sensor {

    @Override
    public Object getValue() {
        Calendar cal = Calendar.getInstance();
        return cal.get(Calendar.DAY_OF_WEEK);
    }
}
