package es.ulpgc.Sensors;

import es.ulpgc.sensors.Clock;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertTrue;

public class TimeSensorTest {
    @Test
    public void doesTimeSensorShowCurrentTimeShouldAnswerWithTrue() {
        Clock time = new Clock();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        assertTrue(time.getValue().equals(sdf.format(Calendar.getInstance().getTime())));

    }
}