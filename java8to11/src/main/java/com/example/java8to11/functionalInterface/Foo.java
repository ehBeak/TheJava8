package com.example.java8to11.functionalInterface;

import java.util.function.Function;

public class Foo {

    public static void main(String[] args) {
        /* [1] 추상 메소드 정의 */

        /* 1. 익명 내부 크래스 */
        RunSomething runSomething = new RunSomething() {
            @Override
            public void doIt() {
                System.out.println("Hello");
            }
        };

        /* 2. 익명 내부 클래스 -> 람다 */
        RunSomething runSomething1 = () -> System.out.println("Lamda");

        /* 3. 반환값이 있는 함수형 인터페이스
        *     -> 입력값이 같으면 출력값이 달라지는 여지 만들지 않기.
        *     -> 여지 : 1) 함수의 바깥의 값을 참조하여 쓰는 경우
        *              2) 외부의 값을 변경하는 경우 */
        ReturnSomething returnSomething = (num) -> {
            return num+10;
        };

        ReturnSomething returnSomething1 = (num) -> num+10;

        /* 사용 */
        // 1.
        runSomething.doIt();
        // 2.
        runSomething1.doIt();
        // 3.
        System.out.println(returnSomething.doIt(1));


        /* [2] javaFunctionalInterface */

        /* 1. Function */
        // 1. 함수형 인터페이스 정의(클래스로 구현)
        Plus10 plus10 = new Plus10(); // 2. 구현체 생성
        System.out.println(plus10.apply(1)); // 3. 사용

        Function<Integer,Integer> function = (number)->number+1; // 1.함수형인터페이스 정의(람다식) 2. 생성
        System.out.println(function.apply(1)); // 사용

        /* 함수를 조합할 수 있는 메소드
        *  1. andThen
        *  2. then */

        // 1.
        



    }
}
