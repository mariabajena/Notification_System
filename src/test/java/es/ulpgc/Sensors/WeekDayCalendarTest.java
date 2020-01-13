package es.ulpgc.Sensors;

import es.ulpgc.sensors.WeekDayCalendar;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class WeekDayCalendarTest {
    @Test
    public void doesWeekDayCalendarSensorShowCorrectWeekDayShouldAnswerWithTrue() {
        WeekDayCalendar calendar = new WeekDayCalendar();
        assertTrue(calendar.getValue().equals(1));
    }
}