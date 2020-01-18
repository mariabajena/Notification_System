package es.ulpgc.userinterface;

import es.ulpgc.account.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import static java.awt.BorderLayout.CENTER;
import static java.awt.BorderLayout.PAGE_START;

public class BasicUserAccount extends JFrame {

    Account user;

    public BasicUserAccount(Account user) {
        super("User: " + user.getLogin());
        this.user = user;
        setElements();
        this.setVisible(true);
        user.rulesActivate();
    }

    private void setElements() {
        this.setSize(300, 200);

        JPanel mainPanel = new JPanel();
        JLabel rulesLabel = new JLabel("Rules defined for the user: ");
        JList rulesList = new JList(user.getRules().toArray());

        this.add(mainPanel);
        mainPanel.setLayout(new BorderLayout(0, 10));
        mainPanel.add(rulesLabel, PAGE_START);
        mainPanel.add(rulesList, CENTER);

        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                user.rulesDeactivate();
            }
        });
    }
}
