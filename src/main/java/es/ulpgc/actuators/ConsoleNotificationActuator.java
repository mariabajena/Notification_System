package es.ulpgc.actuators;

public class ConsoleNotificationActuator implements Actuator {

    @Override
    public void doAction(Object name, Object time, Object weekday) {
        System.out.println("It's " + time + "on day " + weekday + " ! " + name + "'s conditions are true!");
    }
}
