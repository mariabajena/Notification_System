package es.ulpgc.actuarors;

import es.ulpgc.rules.Rule;

public interface Actuator {
    void doAction(Rule concreteRule);
}