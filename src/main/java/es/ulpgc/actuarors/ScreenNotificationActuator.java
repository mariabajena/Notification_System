package es.ulpgc.actuarors;

import es.ulpgc.rules.Rule;

public class ScreenNotificationActuator implements Actuator {

    @Override
    public void doAction(Rule concreteRule) {
        System.out.println("It's time! " + concreteRule.getRuleName() + "'s conditions are true!");
    }
}
