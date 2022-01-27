package ch9;

//import ch9.sub.SubStatic;

import ch9.sub.SubStatic;


//import static ch9.sub.SubStatic.CLASS_NAME;
//import static ch9.sub.SubStatic.SubStaticMethod;
import static ch9.sub.SubStatic.*;

/* 패키지와 접근 제어자 */
public class Chapter9 {
    /* 자바는 해당 패키지의 가장 상위 디렉터리, 즉 root 디렉터리에서 실행을 해야만 한다는 약속이 있다.*/

    public static void main(String[] args) {

        /* import */
//        SubStatic.SubStaticMethod();

        /* import static */
        SubStaticMethod();
        String className = CLASS_NAME;

        /* static 메소드나 변수가 중복되는 상황
        *  ==> import static으로 가져온 것보다 자기 자신의 static 메소드나 변수가 우선이 된다.*/

        /* 접근 제어자
        *  public > protected > package-private > private */

        /* 클래스에 접근 제어자를 선언할 때 유의점
        *  public으로 선언한 클래스는 자바 파일과 이름이 같아야한다. */
    }
}
