package es.ulpgc;

import es.ulpgc.account.Account;
import es.ulpgc.actuarors.ScreenNotificationActuator;
import es.ulpgc.conditions.Condition;
import es.ulpgc.conditions.TimeCondition;
import es.ulpgc.conditions.WeekDayCondition;
import es.ulpgc.rules.ConcreteRule;
import es.ulpgc.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        Account user = new Account(getLogin());
        user.addRule(createRule());
        user.rulesON();
    }

    private static String getLogin() {
        return "exampleLogin";
    }

    private static Rule createRule() {
        String ruleName = "set alarm";
        String hour = "16:42"; //HH:MM
        int day = 2; // 1=Sunday, ..., 7

        List<Condition> conditions = new ArrayList<>();
        conditions.add(new TimeCondition(hour));
        conditions.add(new WeekDayCondition(day));

        return new ConcreteRule(ruleName, conditions, new ScreenNotificationActuator(), true);
    }

}