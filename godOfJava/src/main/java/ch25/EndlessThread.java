package ch25;

public class EndlessThread extends Thread {

    @Override
    public void run() {
        while (true) {
            try {
                System.out.println(System.currentTimeMillis());
                Thread.sleep(1000); // static sleep()
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
