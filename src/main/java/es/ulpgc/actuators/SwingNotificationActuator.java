package es.ulpgc.actuators;

import javax.swing.*;

public class SwingNotificationActuator implements Actuator {

    public static JFrame parentComponent;

    @Override
    public void doAction(Object name, Object time, Object weekday) {
        JOptionPane.showMessageDialog(parentComponent, "It's " + time + " on day " + weekday + "! " + name + "'s conditions are true!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
}
