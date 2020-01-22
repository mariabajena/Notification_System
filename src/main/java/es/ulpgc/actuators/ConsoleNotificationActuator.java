package es.ulpgc.actuators;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ConsoleNotificationActuator implements Actuator {

    @Override
    public void doAction(Object obj) {
        System.out.println("It's " + ((ArrayList)obj).get(1) + " on day " + ((ArrayList)obj).get(2) + "! " + ((ArrayList)obj).get(0) + "'s conditions are true!");
    }
}
