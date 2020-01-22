package es.ulpgc.conditions;

import es.ulpgc.sensors.Clock;
import es.ulpgc.sensors.Sensor;

public class TimeCondition implements Condition {
    private Object threshold;
    private Sensor sensor;

    public TimeCondition(Object threshold) {
        this.threshold = threshold;
        this.sensor = new Clock();
    }

    @Override
    public boolean isTrue() {
        return this.sensor.getValue().equals(threshold); //equals compares HH:MM with HH:MM
    }

    public Sensor getSensor() {
        return sensor;
    }

    public Object getThreshold() {
        return threshold;
    }
}
