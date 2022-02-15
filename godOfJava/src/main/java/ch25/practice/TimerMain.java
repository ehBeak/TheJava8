package ch25.practice;

public class TimerMain {
    public static void main(String[] args) {
        TimerThread timerThread = new TimerThread();
        timerThread.start();
    }
}
