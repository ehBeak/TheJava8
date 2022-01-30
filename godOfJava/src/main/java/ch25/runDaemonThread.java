package ch25;

public class runDaemonThread {
    public static void main(String[] args) {
        DaemonThread thread = new DaemonThread();
        thread.setDaemon(true); // DaemonThread로 설정
        thread.start(); // JVM이 종료되도 계속 실행(JVM이 데몬 쓰레드가 종료될 때까지 기다리지 않음)
    }
}
