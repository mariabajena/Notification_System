package es.ulpgc.actuarors;

import es.ulpgc.rules.ConcreteRule;

public class ScreenNotificationActuator implements Actuator {

    @Override
    public void doAction(Object obj) {
        System.out.println("It's time! " + ((ConcreteRule) obj).getRuleName() + "'s conditions are true!");
    }
}
