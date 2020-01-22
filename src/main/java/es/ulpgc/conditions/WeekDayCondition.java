package es.ulpgc.conditions;

import es.ulpgc.sensors.Sensor;
import es.ulpgc.sensors.WeekDayCalendar;

public class WeekDayCondition implements Condition {
    private int ID;
    private Object threshold;
    private Sensor sensor;

    public WeekDayCondition(Object threshold) {
        this.threshold = threshold;
        this.sensor = new WeekDayCalendar();
    }

    @Override
    public boolean isTrue() {
        return this.sensor.getValue().equals(threshold);
    }

    public Object getThreshold() {
        return threshold;
    }

    public Sensor getSensor() {
        return sensor;
    }
}
