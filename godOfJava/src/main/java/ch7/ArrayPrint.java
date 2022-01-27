package ch7;

public class ArrayPrint {

    public static void main(String[] args) {
        ArrayPrint arr = new ArrayPrint();

        arr.printString(); // new연산으로 객체를 동적 생성한 것을 바로 출력
        arr.print(); // 참조 자료형으로 출력
        // 출력 형태는 같다.

    }

    public void printString() { // [L: 참조자료형 배열 , .String 타입; 주소값
        System.out.println("===== 객체를 생성하자마자 바로 출력======");
        System.out.println("strings = " + new String[0]); // [Ljava.lang.String;@64cee07
        System.out.println("array = " + new ArrayPrint[0]); // [Lch7.ArrayPrint;@6c629d6e
        System.out.println("int array " + new int[0]); // [I@3f102e87
    }

    public void print() {
        System.out.println("======참조자료형과 객체생성 값=======");
        String[] str = new String[0];
        System.out.println("str = " + str); // [Ljava.lang.String;@27abe2cd : 같다.
    }
}
