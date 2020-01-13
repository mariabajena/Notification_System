package es.ulpgc.account;


import es.ulpgc.rules.Rule;

import java.util.ArrayList;
import java.util.List;

public class Account {
    private String login;
    private String password;
    List<Rule> rules;

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

    public void rulesON() {
        rules.forEach(Rule::work);
    }
}
