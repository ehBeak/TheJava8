package ch27;

public class Chapter27 {
    /* Serializable : 이 인터페이스를 구현하면 JVM에서 해당 객체는 저장하거나 다른 서버로 전송할 수 있도록 함
     *  1. Serializable을 구현하면 serialVersionUID값을 지정하자(static Long)
     *  2. serialVersionUID : 해당 객체의 버전 명시 (클래스의 이름이 같더라도 이 ID가 다르면 다른 클래스로 인식)
     *  3. serialVestionUID의 변수의 개수나 타입이 다르면 다른 클래스로 인식  */

    /* ObjectInputStream, ObjectOutputStream */

    /* Serializable을 구현한 객체
     *  1. 해당 인터페이스를 구현하지 않고 Object관련 Stream을 사용하면?
     *  2. 해당 인터페이스를 구현한 후 객체의 변수를 바꾸면?
     *  3. UID를 지정한 후 객체의 변수를 바꾸면?
     * ==> 데이터가 바뀌면(변수 등이 바뀌면) serialVersionUID를 변경하는 습관을 가져야 한다. */

    /* transient와 Serializable의 관계
     *  1. 객체를 저장하거나 다른 JVM으로 보낼 때, transient라는 예약어를 사용하여 선언한 변수는 Serializable의 대상에서 제외된다.
     *  2. ex) 패스워드(보안상 중요한 변수나 꼭 저장해야 할 필요가 없는 변수)*/

    /* NIO
     *  1. Stream대신 Channel과 Buffer사용
     *  2. Channel : 중간에서 물건을 처리(도매상)
     *  3. Buffer : (소매상) */

    /* NIO의 Channel : Channel객체를 생성해서 read(), write() 메소드 사용 */

    /* NIO의 Buffer
    *  1. 버퍼의 상태 및 속성 관련 : capacity, limit, position
    *  2. 위치 변경 : flip, mark, reset, rewind, remaining, clear */
}
