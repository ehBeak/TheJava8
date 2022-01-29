package ch22;

import java.util.ArrayList;

public class Chapter22 {

    /* 자료구조
    *  1. list : ArrayList(Not Thread Safe) Vector(Thread Safe), Stack, LinkedList
    *  2. set
    *  3. queue
    *  ===> 1,2,3 Collection이라는 인터페이스 구현(java.util)
    *  4. map */

    public static void main(String[] args) {
        /* ArrayList */
        ArrayList<String> strings = new ArrayList<>();
        ArrayList<String> strings1 = new ArrayList<>(100); // 초기 저장공간 설정
        ArrayList<String> strings2 = new ArrayList<>(strings); // 생성시 값 복사해서 넣기
        ArrayList<String> strings3 = strings1; // strings1을 strings3가 참조(따로가 아님)-shallow copy
        //ArrayList는 중복된 값을 넣을 수 있다.

        // 배열 추출하기
        strings2.add("A");
        strings2.add("A");
        String[] strings4 = strings2.toArray(new String[0]);

        String[] strings5 = new String[1];
        String[] strings6 = strings2.toArray(strings5);

        for (String str : strings4) {
            System.out.println(str);
        }
        System.out.println("==================");
        for (String str : strings6) {
            System.out.println(str);
        }
        //=> 배열의 크기가 ArrayList크기 > 배열크기 : 모두 null로
        //              ArrayList크기 < 배열 크기 : 모두 출력
        //               배열크기[0] : 모두 출력

    }

}
