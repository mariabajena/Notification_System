package es.ulpgc.userinterface;

import es.ulpgc.account.Account;
import es.ulpgc.rules.Rule;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class BasicUserAccountTest {
    BasicUserAccount bua;
    Account user;

    @Before
    public void setUp(){
        Account user = mock(Account.class);
        this.user = user;
        this.bua = new BasicUserAccount(user);
    }

    @Test
    public void userAssignedShouldAnswerWithTrue() {
        assertEquals(bua.user, user);
    }

    @Test
    public void rulesActivatedShouldAnswerWithTrue() {
        bua.user.rulesActivate();
        assertTrue(bua.user.getRules().stream().allMatch(Rule::isActive));
    }
}