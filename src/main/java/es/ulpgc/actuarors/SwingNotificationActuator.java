package es.ulpgc.actuarors;

import javax.swing.*;

public class SwingNotificationActuator implements Actuator {

    public static JFrame parentComponent;

    @Override
    public void doAction(Object obj) {
        JOptionPane.showMessageDialog(parentComponent, "It's time! " + (String) obj + "'s conditions are true!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
}
