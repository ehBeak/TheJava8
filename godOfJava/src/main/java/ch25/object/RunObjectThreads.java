package ch25.object;

public class RunObjectThreads {
    public static void main(String[] args) {
        RunObjectThreads threads = new RunObjectThreads();
        //threads.checkThreadState2();
        threads.checkThreadState3();
    }

    public void checkThreadState2() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor); // NEW

        try {
            System.out.println("thread state : " + thread.getState()); // NEW
            thread.start(); // NEW -> RUNNABLE
            System.out.println("thread state(after start) : " + thread.getState()); // RUNNABLE

            // Object 대기(1000밀리초) RUNNABLE -> WAITING
            Thread.sleep(100); // 100밀리초 대기
            System.out.println("thread state(after 0.1 sec) : " + thread.getState()); // WAITING

            synchronized (monitor) {
                monitor.notify();// WAITING -> TIMED_WAITING
            }
            // ~is notified

            Thread.sleep(100); // 100밀리초 대기
            System.out.println("thread state(after notify) : " + thread.getState()); // TIMED_WAITING

            thread.join(); // 종료될 때까지 대기 TIMED_WAITING -> TERMINATE
            System.out.println("thread state(after join) : " + thread.getState()); // TERMINATE
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkThreadState3() {
        Object monitor = new Object();
        StateThread thread = new StateThread(monitor); // NEW
        StateThread thread2 = new StateThread(monitor); // NEW

        try {
            System.out.println("thread state : " + thread.getState()); // NEW1
            thread.start(); // NEW1 -> RUNNABLE1
            thread2.start(); // NEW2 -> RUNNABLE2
            System.out.println("thread state(after start) : " + thread.getState()); // RUNNABLE1

            Thread.sleep(100);
            System.out.println("thread state(after 0.1 sec) : " + thread.getState()); // WAITING1

            synchronized (monitor) {
                monitor.notifyAll(); // Thread-0 is notified, thread2까지 모두 notified
            }

            Thread.sleep(100);
            System.out.println("thread state(after notify) : " + thread.getState()); // TIMED_WAITING1

            thread.join();
            System.out.println("thread state(after join) : " + thread.getState());//TERMINATE1
            thread2.join();
            System.out.println("thread2 state(after join) : " + thread2.getState());//TERMINATE2
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
