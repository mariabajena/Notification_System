package es.ulpgc;

import java.util.ArrayList;
import java.util.List;

public class Rule {
    private int ID;
    private String name;
    private String description;
    private boolean activate;

    List<Condition> conditions;
    List<Action> actions;

    public Rule(int ID, String name, String description, boolean activate) {
        this.ID = ID;
        this.name = name;
        this.description = description;
        this.activate = activate;
        this.conditions = new ArrayList<Condition>();
        this.actions = new ArrayList<Action>();
    }

    public void addCondition(Condition condition) {conditions.add(condition);}
}
