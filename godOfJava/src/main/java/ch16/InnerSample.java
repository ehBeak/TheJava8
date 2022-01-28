package ch16;

public class InnerSample {
    public static void main(String[] args) {
        // static nested 객체 생성 - 외부 객체 생성없이 생성가능
        OuterOfStatic.StaticNested staticNested = new OuterOfStatic.StaticNested();
        staticNested.getValue();

        // 내부 클래스 객체 생성 - 외부 객체가 있어야 생성가능
        OuterOfInner outerOfInner = new OuterOfInner();
        OuterOfInner.Inner inner = outerOfInner.new Inner();
        inner.getValue();
    }
}
