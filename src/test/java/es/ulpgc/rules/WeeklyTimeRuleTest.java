package es.ulpgc.rules;

import es.ulpgc.conditions.Condition;
import org.junit.Test;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import static org.junit.Assert.assertTrue;

public class WeeklyTimeRuleTest {

    @Test
    public void ruleConditionListWorkingShouldAnswerWithTrue() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String time = sdf.format(cal.getTime());
        int weekday = cal.get(Calendar.DAY_OF_WEEK);

        WeeklyTimeRule rule = new WeeklyTimeRule(time, weekday, true);

        assertTrue(rule.getConditions().stream().allMatch(Condition::isTrue));
    }
}
