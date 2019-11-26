package es.ulpgc;


import org.junit.Test;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.mock;

public class ConditionTest {



    @Test
    public void conditionWorkingWithIntegerShouldAnswerWithTrue() {
        /* conf */
        /* conf: colaborators */
        ConcreteSensor concreteSensor = mock(ConcreteSensor.class);
        doReturn((int)0).when(concreteSensor).getValue();
        Object threshold = new Integer( 0);
        IntegerRelationalOperatorEqual integerRelationalOperatorEqual = new IntegerRelationalOperatorEqual();

        /* conf: sut */
        Condition condition = new Condition(threshold, integerRelationalOperatorEqual, concreteSensor);

        /* exec */
        /* verif */
        assertTrue(condition.evaluate());

        /* final */

    }



}
