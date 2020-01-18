package es.ulpgc.conditions;

import org.junit.Test;

import java.util.Calendar;

import static org.junit.Assert.assertTrue;

public class WeekDayConditionTest {

    @Test
    public void weekDayConditionWorkingShouldAnswerWithTrue() {
        Calendar cal = Calendar.getInstance();
        Object threshold = cal.get(Calendar.DAY_OF_WEEK);

        WeekDayCondition condition = new WeekDayCondition(threshold);

        assertTrue(condition.isTrue());
    }
}
