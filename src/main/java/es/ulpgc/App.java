package es.ulpgc;

import es.ulpgc.account.Account;
import es.ulpgc.rules.WeeklyTimeRule;

public class App {

    public static void main(String[] args) {
        Account user = new Account("exampleLogin");
        user.addRule(new WeeklyTimeRule("16:42", 2, true));
        user.rulesON();
    }

}