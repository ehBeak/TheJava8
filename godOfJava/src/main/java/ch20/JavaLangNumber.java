package ch20;

public class JavaLangNumber {

    public static void main(String[] args) {
        JavaLangNumber javaLangNumber = new JavaLangNumber();
        javaLangNumber.numberTypeCheck();
        javaLangNumber.numberTypeCheck2();
    }

    public void numberTypeCheck() {
        String val1 = "3";
        String val2 = "5";

        /* parse타입명 : 기본 자료형을 리턴 */
        byte b1 = Byte.parseByte(val1);
        byte b2 = Byte.parseByte(val2);

        System.out.println(b1 + b2); // 8

        /* valueOf : 참조 자료형을 리턴 */
        Integer refInt1 = Integer.valueOf(val1); // static 메소드
        Integer refInt2 = Integer.valueOf(val2);
        System.out.println(refInt1 + refInt2 + "7"); // 87
    }

    public void numberTypeCheck2() {
        Integer refInt1;
        refInt1 = 100; // new연산을 하지 않아도 값을 할당할 수 있다.
        System.out.println(refInt1.doubleValue());
    }


}
