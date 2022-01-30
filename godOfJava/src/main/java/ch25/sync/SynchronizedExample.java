package ch25.sync;

public class SynchronizedExample {

    int val = 0;
    int interest = 0;

    private Object lock = new Object();
    private Object interestLock = new Object();

    public void sample1() {
        synchronized (lock) {
            val++; // lock은 문지기 역할, 블록안에 값처리는 하나의 쓰레드만 할 수 있음
        }
    }

    public void sample2() {
        synchronized (interestLock) {
            interest++; // interest값도 처리해야할 때 따로 lock변수를 만들자
        }
    }


}
