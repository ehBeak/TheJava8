package ch25;

public class RunSupportThreads {

    public static void main(String[] args) {
        RunSupportThreads runSupportThreads = new RunSupportThreads();
        runSupportThreads.checkThreadState1();
        runSupportThreads.checkJoin();
    }

    public void checkThreadState1() {
        SleepThread thread = new SleepThread(2000); // 2000밀리초 sleep상태인 쓰레드 생성
        try {
            System.out.println("thread state : " + thread.getState()); // NEW
            thread.start(); // NEW -> RUNNABLE
            System.out.println("thread state(after start) : " + thread.getState()); // RUNNABLE

            // Sleeping Thread-0
            Thread.sleep(1000); // 1초 대기 RUNNABLE -> TIMED_WAITING
            System.out.println("thread state(after 1sec) : " + thread.getState()); // TIME_WAITING

            thread.join(); // 종료될 때까지 대기
            thread.interrupt(); // 중지 : TIME_WAITING -> TERMINATED
            System.out.println("thread state(after join) : " + thread.getState()); // TERMINATED
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }

    public void checkJoin() {
        SleepThread thread = new SleepThread(2000); // NEW
        try {
            thread.start(); // NEW -> RUNNABLE
            // thread.sleep() : RUNNABLE -> TIMED_WAITING
            thread.join(500); // 500밀리초 대기 TIME_WAITING
            thread.interrupt(); // TIME_WAITING -> TERMINATE : [EXCEPTION] 2초동안 sleep상태라 interrupt일으킬 수 있어서?
            System.out.println(thread.getState()); // TERMINATE
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }
    }
}
