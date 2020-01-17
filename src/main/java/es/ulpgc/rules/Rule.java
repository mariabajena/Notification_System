package es.ulpgc.rules;

public interface Rule {
    void activate();
    void deactivate();
    Boolean isActive();
}
