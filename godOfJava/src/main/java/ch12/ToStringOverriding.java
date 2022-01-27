package ch12;

public class ToStringOverriding {

    @Override
    public String toString() {
        return "ToString class";
    }

    public static void main(String[] args) {
        ToStringOverriding toStringOverriding = new ToStringOverriding();
        toStringOverriding.toStringMethod(toStringOverriding);
        toStringOverriding.toStringMethod2();
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj);
        System.out.println(obj.toString());
        System.out.println("plus " + obj);
    }

    public void toStringMethod2() {
        System.out.println(this);
        System.out.println(toString());
        System.out.println("plus " + this);
    }
}
