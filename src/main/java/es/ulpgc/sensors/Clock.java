package es.ulpgc.sensors;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Clock implements Sensor {

    @Override
    public Object getValue() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        return sdf.format(cal.getTime());
    }
}