package ch8;

/* static 메소드 */
public class ReferenceStatic {

    public String name = "hello";
    public static String staticName = "hello";

    public static void main(String[] args) {

        ReferenceStatic.staticMethod();

    }

    public static void staticMethod() {
        System.out.println("ReferenceStatic.staticMethod");
    }

    // static 메소드는 클래스 변수만 사용할 수 있다.
    public static void staticMethod2() {
//        System.out.println(name); 컴파일 오류
        System.out.println(staticName);
        System.out.println(ReferenceStatic.staticName);
    }
}
