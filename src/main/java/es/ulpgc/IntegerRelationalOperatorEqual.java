package es.ulpgc;

public class IntegerRelationalOperatorEqual implements RelationalOperator {

    @Override
    public boolean evaluate(Object leftObject, Object rightObject) {
          return (int) leftObject == (int) rightObject;
    }
}
