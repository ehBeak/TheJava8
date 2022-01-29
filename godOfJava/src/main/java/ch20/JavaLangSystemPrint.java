package ch20;

public class JavaLangSystemPrint {
    public static void main(String[] args) {
        JavaLangSystemPrint javaLangSystemPrint = new JavaLangSystemPrint();
        javaLangSystemPrint.printNull();
    }

    public void printNull() {
        Object obj = null;
        System.out.println(obj); // println에서는 단순히 null.toString()을 사용안함, String.valueOf(obj)출력함
        System.out.println(obj + " is object's value"); // 더하기 연산은 StringBuilder 씀 new StringBuilder().append(obj).append("")

        // String.valueOf() : null이면 null 출력
        // StringBuilder는 +연산대신 append를 사용하는데, println이 자동으로 StringBuilderㅣ를 사용함
    }

    public void printNullByToString() {
        Object obj = null;
        System.out.println(obj.toString()); // null이니까 예외 발생
    }
}
