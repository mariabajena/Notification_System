package es.ulpgc.account;

import es.ulpgc.conditions.Condition;
import es.ulpgc.rules.Rule;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;

public class AccountTest {
    Account account;

    @Before
    public void setUp(){
        this.account = new Account("login");
    }
    @Test
    public void loginAssignedShouldAnswerWithTrue() {
        assertEquals("login", account.getLogin());
    }
    @Test
    public void ruleAddedShouldAnswerWithTrue() {
        Rule rule = mock(Rule.class);
        account.addRule(rule);
        assertTrue(account.rules.contains(rule));
    }
    @Test
    public void rulesActivatedShouldAnswerWithTrue() {
        Rule rule = mock(Rule.class);
        account.rulesActivate();
        assertTrue(account.rules.stream().allMatch(Rule::isActive));
    }

    @Test
    public void rulesDeactivatedShouldAnswerWithTrue() {
        Rule rule = mock(Rule.class);
        account.rulesDeactivate();
        assertTrue(account.rules.stream().noneMatch(Rule::isActive));
    }
}