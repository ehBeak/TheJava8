package ch21;

public class WildcardSample {
    public static void main(String[] args) {

        WildcardSample wildcardSample = new WildcardSample();
        wildcardSample.callWildcardMethod();

    }

    public void callWildcardMethod() {
        //wildcardGeneric<?> wildcard = new WildcardGeneric<String>(); ==> 오류
        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        wildcard.setWildcard("A");
        wildcardStringMethod(wildcard);
    }

    public void wildcardStringMethod(WildcardGeneric<?> c) { //Object로 하면 매개변수로 받지를 못함

        Object value = c.getWildcard();
        if (value instanceof String) {
            System.out.println(value);
        }

    }
}
