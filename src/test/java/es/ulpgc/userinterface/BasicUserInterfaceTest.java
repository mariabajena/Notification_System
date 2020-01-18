package es.ulpgc.userinterface;

import es.ulpgc.account.Account;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;

public class BasicUserInterfaceTest {
    BasicUserInterface bui;

    @Before
    public void setUp(){
        this.bui = new BasicUserInterface();
    }

    @Test
    public void usersUpdatedShouldAnswerWithTrue() {
        ArrayList<Account> users = new ArrayList<>();
        Account u1 = mock(Account.class);
        users.add(u1);

        bui.updateUsers(users);
        assertTrue(bui.users.contains(u1));
    }
}
