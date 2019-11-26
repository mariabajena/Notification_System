package es.ulpgc;

public class Action {
    private Object actuator_parameter;
    private Actuator actuator;

    public Action(Object actuator_parameter, Actuator actuator) {
        this.actuator_parameter = actuator_parameter;
        this.actuator = actuator;
    }
}
