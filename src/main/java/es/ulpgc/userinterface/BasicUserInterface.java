package es.ulpgc.userinterface;

import es.ulpgc.account.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.awt.BorderLayout.*;

public class BasicUserInterface extends JFrame {

    JPanel mainPanel;
    JComboBox usersComboBox;
    JButton loginButton;
    ArrayList users;
    JLabel label;

    public BasicUserInterface() {
        super("Application");
        setElements();
        setVisible(true);
    }

    private void setElements() {
        this.setSize(300, 160);
        mainPanel = new JPanel();
        usersComboBox = new JComboBox();
        loginButton = new JButton("Log in");
        label = new JLabel("Select user:");

        this.add(mainPanel);
        mainPanel.setLayout(new BorderLayout(0, 10));
        mainPanel.add(label, PAGE_START);
        mainPanel.add(usersComboBox, CENTER);
        mainPanel.add(loginButton, PAGE_END);

        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new BasicUserAccount((Account) usersComboBox.getSelectedItem());
            }
        });
    }

    public void updateUsers(ArrayList users) {
        this.users = users;
        usersComboBox.removeAllItems();
        users.stream().forEach(usersComboBox::addItem);
        this.repaint();
    }


}
