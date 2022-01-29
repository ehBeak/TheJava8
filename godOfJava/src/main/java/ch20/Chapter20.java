package ch20;

/* java.lang 패키지 */
public class Chapter20 {

    /* 자바랭 패키지에 들어있는 예외
     *  1. OutOfMemoryError(OOME)
     *  2. StackOverflowError */

    /* 자바랭 패키지에 들어있는 기본 어노테이션
     *  Deprecated, Override, SuppressWarnings */

    /* 숫자를 처리하는 클래스들
     *  1. Character과 Boolean을 제외한 숫자 처리 클래스 ==> Wrapper 클래스, Number추상 메소드 확장
     *  2. 기본 자료형처럼 사용가능, 컴파일러가 자동 형변환 해줌
     *  3. Character클래스를 제외하고는 공통적인 메소드 제공 : parse타입명(), valueOf()
     *
     *  new 연산자를 사용하지 않아도 값을 처리하도록 만든 이유
     *  1. 매개 변수를 참조 자료형으로만 받는 메소드를 처리하기 위해 ??
     *  2. 제네릭과 같이 기본 자료형을 사용하지 않는 기능을 사용하기 위해
     *  3. MIN_VALUE와 MAX_VALUE와 같이 클래스에 선언된 상수 값을 사용하기 위해
     *  4. 문자열을 숫자로, 숫자를 문자열로 쉽게 변환하고 2,8,10,16 진수 변환ㅇ르 쉽게 처리하기 위해 */

    /* System 클래스 : 시스템에 대한 정보를 확인하는 클래스
     *  1. static변수로 PrintStream과 InputStream을 사용
     *  2. 시스템 속성값 관리 :java.util.Properties 클래스를 사용한 getProperty("key")
     *  3. 시스템 환경값 조회 : getenv()
     *  4. GC수행 : gc(), runFinalization()
     *  5. JVM 종료 : exit()
     *  6. 현재시간 조회: currentTimeMillis(), nanoTime() 기타 관리용 메서드 */

    /* java.util.Properties 클래스
    *  1. Hashtable 상속 */

    /* PrintStream 클래스, InputStream 클래스 */

    public static void main(String[] args) {

    }
}
