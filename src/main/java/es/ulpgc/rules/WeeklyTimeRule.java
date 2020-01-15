package es.ulpgc.rules;

import es.ulpgc.actuarors.Actuator;
import es.ulpgc.actuarors.ConsoleNotificationActuator;
import es.ulpgc.conditions.Condition;
import es.ulpgc.conditions.TimeCondition;
import es.ulpgc.conditions.WeekDayCondition;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormatSymbols;
import java.util.ArrayList;
import java.util.List;

public class WeeklyTimeRule implements Rule {
    private static String ruleName = "Weekly time";
    private Actuator actuator = new ConsoleNotificationActuator();
    private List<Condition> conditions;
    boolean active;
    private Timer timer;
    private String time;
    private int weekday;

    public WeeklyTimeRule(String time, int weekday, boolean active) {
        this.time = time;
        this.weekday = weekday;
        this.active = active;
        List<Condition> conditions = new ArrayList<>();
        conditions.add(new TimeCondition(time));
        conditions.add(new WeekDayCondition(weekday));
    }

    @Override
    public void work() {
        // check if conditions are true every second; if yes: do action
        int delay = 1000; //milliseconds
        ActionListener checkRulesListener = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (conditions.stream().allMatch(Condition::isTrue)) {
                    actuator.doAction(this);
                }
            }
        };
        timer = new Timer(delay, checkRulesListener);
        this.activate();
    }

    @Override
    public void activate() {
        active = true;
        timer.start();
    }

    @Override
    public void deactivate() {
        active = false;
        timer.stop();
    }

    @Override
    public String toString() {
        return ruleName + ": " + new DateFormatSymbols().getWeekdays()[weekday] + " at " + time;
    }

    public String getRuleName() {
        return ruleName;
    }
}
