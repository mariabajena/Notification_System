package es.ulpgc.Sensors;

import es.ulpgc.sensors.WeekDayCalendar;
import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class WeekDayCalendarTest {
    @Test
    public void ensureReturnCurrentWeekdayWhenWeekDayCalendarGetValueIsCalled() {
        Calendar cal = Calendar.getInstance();
        WeekDayCalendar weekDayCalendar = new WeekDayCalendar();

        assertEquals(weekDayCalendar.getValue(), cal.get(Calendar.DAY_OF_WEEK));
    }

}