package es.ulpgc.actuarors;

import es.ulpgc.rules.WeeklyTimeRule;

public class ConsoleNotificationActuator implements Actuator {

    @Override
    public void doAction(Object obj) {
        System.out.println("It's time! " + (String) obj + "'s conditions are true!");
    }
}
