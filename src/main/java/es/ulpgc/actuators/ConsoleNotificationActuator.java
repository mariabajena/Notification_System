package es.ulpgc.actuators;

public class ConsoleNotificationActuator implements Actuator {

    @Override
    public void doAction(Object obj) {
        System.out.println("It's time! " + obj + "'s conditions are true!");
    }
}
