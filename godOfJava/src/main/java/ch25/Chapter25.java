package ch25;

public class Chapter25 {


    public static void main(String[] args) {

    }

    // synchronized를 선언하면 동일한 객체의 이 메소드에 여러개의 쓰레드가 접근해도 한순간에는 하나의 쓰레드만 이 메소드를 수행한다.
    int amount = 0;

    public synchronized void plus(int value) { //
        amount += value;
    }

    // synchronized를 사용할 때 : 2개 이상의 쓰레드가 같은 객체의 메소드 등을 참조할때, 변수의 값을 바꿀 때

    // Thread safe

    /* interrupt() : InterruptedException을 일으키면서 쓰레드를 중단시킨다(join과 sleep은 이 메소드를 호출하기도 한다.)
    * */

    /* Object 클래스에 선언된 쓰레드와 관련있는 메소드들 : wait, notify, notifyAll*/

}
