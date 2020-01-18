package es.ulpgc.account;

import es.ulpgc.rules.Rule;

import java.util.ArrayList;

public class Account {
    private String login;
    private String password;
    ArrayList<Rule> rules;

    public Account(String login) {
        this.login = login;
        this.rules = new ArrayList<>();
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public void addRule(Rule rule) {
        rules.add(rule);
    }

    public void rulesActivate() {
        rules.forEach(Rule::activate);
    }

    public void rulesDeactivate() {
        rules.forEach(Rule::deactivate);
    }

    @Override
    public String toString() {
        return login;
    }

    public ArrayList<Rule> getRules() {
        return rules;
    }
}
