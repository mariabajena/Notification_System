package es.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private int ID;
    private String user_name;
    private String user_password;
    //private Mail user_mail;

    List<Rule> userRules;
    List<Sensor> userSensors;
    List<Actuator> userActuators;

    public Account(int ID, String user_name, String user_password) {
        this.ID = ID;
        this.user_name = user_name;
        this.user_password = user_password;
        this.userRules = new ArrayList<Rule>();
        this.userSensors = new ArrayList<Sensor>();
        this.userActuators = new ArrayList<Actuator>();
    }
}
