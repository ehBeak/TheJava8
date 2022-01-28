package ch15;

import java.io.Serializable;

/* String */
public class Chapter15 {

    /*
     * public final class String
     * extends Object
     * implements Serializable, Comparable<String>, CharSequence
     * */

    /* Serializable
     *  => 해당 인터페이스를 구현하면,
     *  1. 객체를 파일로 저장 가능
     *  2. 객체를 다른 서버에 전송 가능
     * */

    /* Comparable<>
     *  1. compareTo() */

    /* CharSequence
     *  => 이 인터페이스를 구현하면,
     *  1. 해당 클래스가 문자열을 다루기 위한 클래스라는 것을 명시적으로 나타낸다.*/

    /* String문자열을 byte로 변환하기
     *  1. UTF-8 UTF-16 EUC-KR
     *  2. 자바에서 한글이 몇바이트를 점유하는지 알아두는 것은 우리나라에서 개발하면서 매우 중요*/

    /* Charset : 알파벳을 제외한 어떤 나라의 문자 모음 */

    /* UnsupportedEncodingException
     *  1. byte배열이나 String타입의 캐릭터 셋을 받는 생성자
     *  2. getBytes()메소드 중에서 String타입의 캐릭터 셋을 받는 메소드 */

    /* 객체의 null 체크는 반드시 필요 : ex. 매개변수로 넘어오는 객체의 null체크 */

    /* String의 메소드
     * 1. equals, compareTo, contentEquals ...
     * 2. startsWith, endsWith, contains, matches ...
     * 3. indexOf
     * 4. charAt, getChars, codePoint...
     * 5. copyValueOf, toCharArray, subString, subSequence
     * 6. split
     * 7. concat, trim, replace, format */

    /* String의 equals와 ==
     *  1. constant pool : 동일한 값을 가지는 객체가 있으면 재사용한다. */

    /* intern은 사용하지말자 : pool에 있으면 그 값을 반환, 없으면 pool에 생성 (저장공간 부족) */

    /* StringBuffer, StringBuilder : immutable한 String의 단점 보완
    *  1. String은 immutable하다 : +연산을 하면 기존의 객체는 버리고 새로운 객체가 생성되는 것
    *  ==> StringBuffer와 StringBuilder는 객체를 새로 생성하지 않는다. : +대신 append()
    *  2. StringBuffer : Thread safe O , 여러 쓰레드에서 이 변수를 동시에 접근하는 일이 있을 경우
    *  3. StringBuilder : Thread safe X
    *  */

}
