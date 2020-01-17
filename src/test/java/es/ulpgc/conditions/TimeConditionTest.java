package es.ulpgc.conditions;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

import es.ulpgc.sensors.Clock;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class TimeConditionTest {

    @Test
    public void timeConditionWorkingShouldAnswerWithTrue() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        Object threshold = sdf.format(cal.getTime());

        TimeCondition condition = new TimeCondition(threshold);

        assertTrue(condition.isTrue());
    }

}