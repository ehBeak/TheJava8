package ch12;

public class ToString {

    /* Object 클래스의 toString()메소드
    *  ==> getClass().getName + '@' + Integer.toHexString(hashCode())
    *  ==> 패키지명.클래스명 + '@' + 해시코드를 16진수로 변환한 값 */

    public static void main(String[] args) {
        ToString thisObject = new ToString();
        thisObject.toStringMethod(thisObject);
        thisObject.toStringMethod2();
    }

    public void toStringMethod(Object obj) {
        System.out.println(obj); // ch12.ToString@7d6f77cc
        System.out.println(obj.toString()); // ch12.ToString@7d6f77cc
        System.out.println("plus " + obj); // plus ch12.ToString@7d6f77cc
    }

    public void toStringMethod2() {
        System.out.println(this); // ch12.ToString@7d6f77cc
        System.out.println(toString()); // ch12.ToString@7d6f77cc
        System.out.println("plus " + this); // plus ch12.ToString@7d6f77cc
    }

}
