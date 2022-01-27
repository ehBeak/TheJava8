package ch8;

public class MethodVarargs {

    public static void main(String[] args) {
        MethodVarargs methodVarargs = new MethodVarargs();
        methodVarargs.calculateNumbersWithArray(new int[]{1, 2, 3, 4}); // ...1
        methodVarargs.calculateNumbers(1, 2, 3, 4, 5); // ...2
        methodVarargs.calculateNumbers(1, 2, 3);
    }

    public void calculateNumbersWithArray(int[] numbers) {

    }

    public void calculateNumbers(int... numbers) {
        // int ...방식은 하나의 메소드에서서 한번만 사용이 가능하고 맨 마지막에 선언한다.
    }



}
