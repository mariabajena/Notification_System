package es.ulpgc.rules;

import es.ulpgc.actuators.Actuator;
import es.ulpgc.actuators.ConsoleNotificationActuator;
import es.ulpgc.actuators.SwingNotificationActuator;
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
    private List<Actuator> actuators = new ArrayList<>();
    private List<Condition> conditions = new ArrayList<>();
    boolean active;
    private Timer timer;
    private String time;
    private int weekday;
    private int triggeredDelay = 0;

    public WeeklyTimeRule(String time, int weekday, boolean active) {
        this.time = time;
        this.weekday = weekday; //1 = Sunday, ..., 7
        this.active = active;
        conditions.add(new TimeCondition(time));
        conditions.add(new WeekDayCondition(weekday));
        actuators.add(new SwingNotificationActuator());
        actuators.add(new ConsoleNotificationActuator());
        initialize();
        deactivate();
    }

    /**
     * Check if the conditions are true every second (1000 milliseconds). When triggered, stop checking for 60 units.
     */
    public void initialize() {
        int delay = 1000; //milliseconds
        ActionListener checkRulesListener = new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                if (triggeredDelay == 0) {
                    if (conditions.stream().allMatch(Condition::isTrue)) {
                        actuators.forEach((actuator) -> actuator.doAction(ruleName, time, weekday));
                        triggeredDelay = 60;
                    }
                } else triggeredDelay--;
            }
        };
        timer = new Timer(delay, checkRulesListener);
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
        return "  " + ruleName + " (" + new DateFormatSymbols().getWeekdays()[weekday] + " at " + time + ")";
    }

    @Override
    public Boolean isActive(){
        return active;
    }

    public String getRuleName() {
        return ruleName;
    }
    public List<Condition> getConditions() { return conditions; }
}
