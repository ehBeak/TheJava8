package ch14;

public class Chapter14 {

    /* try-catch 문 : 예외를 처리하는 방법*/

    /* try-catch를 사용하면서 처음에 적응하기 힘든 변수 선언 */

    /* finally : 코드의 중복성을 피하기 위해서 */

    /* 두개 이상의 catch */

    /* java.lang.Exception */

    /* 예외의 종류
     *  1. checked exception : Exception을 바로 확장(extends)
     *  2. error : 자바 프로그램 밖에서 발생한 예외( != java.lang.Exception : 프로그램 안에서 발생한 예외)
     *     => Error와 Exception의 차이
     *        1) 프로그램 밖에서 발생, 프로그램 안에서 발생
     *        2) 프로그램이 멈추는가? 프로그램을 계속 실행할 수 있는가?
     *        3) Error는 프로세스에 영향을 주고 Exception은 쓰레드에 영향을 준다.
     *  3. runtime exception (혹은 unchecked exception)
     *       : 예외가 발생할 것을 미리 감지하지 못했을 때 발생
     *       : RuntimeException을 확장한 예외들
     * */

    /* java.lang.Throwable ==> toString(), getMessage(), printStackTrace() */

    /* throw : 예외를 발생시키는 방법
     *  throws구문 : 예외를 위임 */

    /* 예외 만들기 Throwable을 반드시 상속 받아야 한다. */

    /* 자바 예외 처리 전략
    *  1. 내가 만든 예외가 항상 발생하지 않고, 실행시 발생할 확률이 높으면 RuntimeException을 상속해서
    *     checkedException으로 만들자
    *  2. RuntimeException은 try-catch문이나 throws문을 쓰지 않아도 컴파일 에러가 안뜬다.
    *  3. catch 블록에서 아무 처리도 하지 않는 것은 반드시 피하자
    *  ==> 임의의 예외 클래스를 만들 때는, try-catch문으로 묶어줄 필요가 있을 경우에만 Exception클래스를 확장
    *  ==> 일반적으로 실행시 예외를 처리할 수 있는 경우네는 RuntimeException클래스를 확장
    *  ==> catch문을 공백으로 두지 말자. */


}
