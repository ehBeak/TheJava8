package ch21;

public class GenericWildcardSample {
    public static void main(String[] args) {
        GenericWildcardSample genericWildcardSample = new GenericWildcardSample();

        WildcardGeneric<String> wildcard = new WildcardGeneric<>();
        genericWildcardSample.genericMethod(wildcard, "data");
    }

    public <T> void genericMethod(WildcardGeneric<T> c, T addValue) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }

    public <S, T extends Car> void genericMethod(WildcardGeneric<T> c, T addValue, S add) {
        c.setWildcard(addValue);
        T value = c.getWildcard();
        System.out.println(value);
    }
}
