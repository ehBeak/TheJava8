package ch17;

/* 어노테이션이란? */
public class Chapter17 {

    /* 미리 정해져 있는 (사용가능한)어노테이션들은 딱 3개 뿐
     *  1. @Override : 오버라이드 함
     *  2. @Deprecated : deprecated된거라고 말해주는 것
     *  3. @SuppressWarnings : 경고 안해줘도 ㄱㅊ */

    /* 메타 어노테이션 : 어노테이션을 선언하기 위한 어노테이션
     *  1. @Target : 어노테이션을 어떤 것에 적용할 지 선언
     *  2. @Retention : 어노테이션 정보가 얼마나 오래 유지되는지
     *  3. @Documented : 해당 어노테이션에 대한 정보가 javadocs(API)문서에 포함된다는 것
     *  4. @Inherited : 모든 자식 클래스에서 부모 클래스의 어노테이션을 사용 가능하다
     * */

    // @interface : 어노테이션을 선언할 때 사용

    /* 어노테이션은 상속이 안돼요 */


}
