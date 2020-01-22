package es.ulpgc.conditions;

import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertTrue;

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
