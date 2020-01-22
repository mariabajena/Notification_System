package es.ulpgc.actuators;

import javax.swing.*;
import java.util.ArrayList;

public class SwingNotificationActuator implements Actuator {

    public static JFrame parentComponent;

    @Override
    public void doAction(Object obj) {
        JOptionPane.showMessageDialog(parentComponent, "It's "  + ((ArrayList)obj).get(1) + " on day " + ((ArrayList)obj).get(2) + "! " + ((ArrayList)obj).get(0) + "'s conditions are true!", "Alert", JOptionPane.INFORMATION_MESSAGE);
    }
}
