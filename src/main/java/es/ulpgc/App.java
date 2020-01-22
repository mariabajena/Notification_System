
package es.ulpgc;

import es.ulpgc.account.Account;
import es.ulpgc.actuators.SwingNotificationActuator;
import es.ulpgc.rules.WeeklyTimeRule;
import es.ulpgc.userinterface.BasicUserInterface;

import java.util.ArrayList;

public class App {

    public static void main(String[] args) {
        BasicUserInterface frame = new BasicUserInterface();
        SwingNotificationActuator.parentComponent = frame;
        ArrayList<Account> users = new ArrayList<>();

        Account u1 = new Account("JaneSmith");
        u1.addRule(new WeeklyTimeRule("16:25", 4, true));
        u1.addRule(new WeeklyTimeRule("16:26", 4, true));
        users.add(u1);

        Account u2 = new Account("TomJones");
        u2.addRule(new WeeklyTimeRule("21:58", 4, true));
        users.add(u2);

        frame.updateUsers(users);
    }

}