package ch13;

/* 기본 자료형의 final 선언*/
public class FinalVariable {
    final int instanceVariable = 1; // 생성과 동시에 초기화(인스턴스 변수)

    // 매개변수와 지역변수는 final로 선언할 때 반드시 초기화할 필요 없음
    // ==> 매개변수는 이미 초기화가 되어서 넘어오고
    // ==> 지역변수는 메소드 내에서만 참조되니까 변경할 일이 없음
    public void method(final int parameter) {//(매개변수)
        final int localVariable;//(지역변수)
        localVariable = 2;
//        localVariable = 3;  오류
    }
}
