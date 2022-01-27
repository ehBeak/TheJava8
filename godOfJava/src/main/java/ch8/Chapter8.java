package ch8;

/* 참조 자료형 */
public class Chapter8 {
    /* 생성자 (생성자가 꼭 있어야 객체가 생성되는 것은 아니다. 안그런 클래스도 있다.) */
    /* DTO : 데이터를 다른 서버로 전달
     *  VO : 데이터를 담아 두기 위한 목적 ( < DTO)*/

    /* this */

    /* method overloading */

    /* 메소드가 종료되는 조건
     *  1. return
     *  2. 메소드의 모든 문장 실행
     *  3. 예외가 발생(throw) */

    /* static
     *  static 메소드 : 객체를 생성하지 않아도 메소드를 호출 할 수 있음
     *  static 블록 : 어떤 클래스의 객체를 생성하면서 딱 한 번만 불려야 하는 코드 */
    static { // 클래스 내부에서, 메소드 밖에서
        // 딱 한번만 수행되는 코드
    }

    /* Pass by value, Pass by reference
    *  기본 자료형 : Pass by value(호출한 메소드의 데이터에 영향이 안감)
    *  참조 자료형 : Pass by reference(호출한 메소드의 데이터에도 영향이 감)*/

    String b = "b";
    String b1 = new String("b");
    //? String이 아닌 다른 참조 자료형들도 이처럼 호출된 메소드에서 다른 객체로 대체하여 처리하면 기존 값은 바뀌지 않는다.


}
