package es.ulpgc.Sensors;

import es.ulpgc.sensors.Clock;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertEquals;

public class ClockTest {

    @Test
    public void ensureReturnCurrentTimeWhenClockGetValueIsCalled() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Clock clock = new Clock();

        assertEquals(clock.getValue(), sdf.format(cal.getTime()));
    }
}
