package ch25;

public class RunThreads {

    public static void main(String[] args) {
        RunThreads threads = new RunThreads();
        threads.runBasic();
        threads.runMultiThreads();
    }

    // 쓰레드를 실행하는 2가지 방법
    public void runBasic() {
        RunnableSample runnable = new RunnableSample();
        new Thread(runnable).start();

        ThreadSample thread = new ThreadSample();
        thread.start();
        System.out.println("RunTreads.runBasic");
    }

    // 순차적으로 쓰레드가 실행되는 것이 아니다.
    public void runMultiThreads() {
        RunnableSample[] runnable = new RunnableSample[5];
        ThreadSample[] thread = new ThreadSample[5];

        for (int i = 0; i < 5; i++) {
            runnable[i] = new RunnableSample();
            thread[i] = new ThreadSample();

            new Thread(runnable[i]).start();
            thread[i].start();
        }

        System.out.println("RunThreads.runMultiThreads"); // 메소드가 끝난다고 쓰레드가 다 끝나는 것은 아님
    }

    /* 출력
    * RunnableSample.run
    RunTreads.runBasic !!
    ThreadSample.run
    ThreadSample.run
    RunnableSample.run
    RunnableSample.run
    ThreadSample.run
    RunnableSample.run
    ThreadSample.run
    RunThreads.runMultiThreads !!
    ThreadSample.run
    ThreadSample.run
    RunnableSample.run
    RunnableSample.run
    * */

}
