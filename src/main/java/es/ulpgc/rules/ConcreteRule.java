package es.ulpgc.rules;


import es.ulpgc.actuarors.Actuator;
import es.ulpgc.conditions.Condition;

import java.util.List;

public class ConcreteRule implements Rule {
    String ruleName;
    List<Condition> conditions;
    Actuator actuator;
    boolean active;

    public ConcreteRule(String ruleName, List<Condition> conditions, Actuator actuator, boolean active) {
        this.ruleName = ruleName;
        this.conditions = conditions;
        this.actuator = actuator;
        this.active = active;
    }

    @Override
    public void work() {
        if (!(conditions.stream().allMatch(Condition::isTrue))) {
            //in a loop to make a clock update continuously
            System.out.println("Waiting for the condition to be true...");
            do {
            } while (!(conditions.stream().allMatch(Condition::isTrue)));
        }
        actuator.doAction(this);
    }

    public String getRuleName() {
        return ruleName;
    }

    public List<Condition> getConditions() {
        return conditions;
    }
}
