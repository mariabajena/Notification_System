package es.ulpgc;

public class Condition {
    private Object threshold;
    private RelationalOperator operator;
    private Sensor sensor;

    public Condition(Object threshold, RelationalOperator operator, Sensor sensor) {
        this.threshold = threshold;
        this.operator = operator;
        this.sensor = sensor;
    }

    public Sensor getSensor() {
        return sensor;
    }

    public boolean evaluate() {
        return this.operator.evaluate(this.threshold, this.sensor.getValue());
    }
}
