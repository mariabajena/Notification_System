package es.ulpgc;


import es.ulpgc.conditions.TimeCondition;
import es.ulpgc.sensors.Clock;
import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ConditionTest {

    @Test
    public void conditionWorkingShouldAnswerWithTrue() {
        Clock concreteSensor = mock(Clock.class);
        doReturn("13:28:00").when(concreteSensor).getValue();
        Object threshold = "13:28:00";

        TimeCondition condition = new TimeCondition(threshold);

        assertTrue(condition.isTrue());

    }

}