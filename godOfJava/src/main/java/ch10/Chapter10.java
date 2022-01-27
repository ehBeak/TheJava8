package ch10;

/* 상속 */
public class Chapter10 {

    // 자식 클래스 객체 생성시, 부모 클래스의 생성자 호출 -> 자식 클래스의 생성자 호출

    /* super */

    public static void main(String[] args) {
        /* 메소드 overriding */
        ChildOverriding childOverriding = new ChildOverriding();
        // 자식 -> 부모 : 접근제어자는 상속될수록 점점 축소되면 안된다.
        childOverriding.printName(); // public -> public
        childOverriding.printName2(); // public -> protected
        childOverriding.printName4(); // public -> private [Overriding X]
        childOverriding.printName3(); // x -> protected
//        childOverriding.printName5(); // x -> private


        /* 참조 자료형의 형 변환 */
        ParentCasting parent = new ChildCasting();
//        ChildCasting child = new ParentCasting(); ==> X : 기본자료형의 down casting과 비슷 int a = (int) LongType

        ParentCasting parentCasting = new ParentCasting();
        ChildCasting childCasting = new ChildCasting();

        ParentCasting parentCasting2 = childCasting;
        ChildCasting childCasting2 = (ChildCasting) parentCasting; // int a = (int) LongType
        //==> 컴파일 단계에서는 정상적이지만, 실행시 ClassCastException 예외 발생

        /* 명시적 형 변환시 문제가 없는 경우(예외가 발생하지 않는 경우) */
        ChildCasting childCasting3 = new ChildCasting();
        ParentCasting parentCasting3 = childCasting3;
        ChildCasting child = (ChildCasting) parentCasting3; // 원래 참조하던 값이 자식 객체인 경우

        /* 형변환을 사용하는 경우 */

        /* 다형성
        *  형 변환을 하더라도, 실제 호출되는 것은 원래 객체에 있는 메소드가 호출된다. */
        ParentCasting parentCasting4 = new ParentCasting();
        ParentCasting parentCasting5 = new ChildCasting();

        parentCasting4.printName(); // ParentCasting.printName
        parentCasting5.printName(); // ChildCasting.printName
    }
}
