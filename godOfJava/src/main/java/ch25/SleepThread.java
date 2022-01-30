package ch25;

public class SleepThread extends Thread {

    long sleepTime;

    public SleepThread(long sleepTime) {
        this.sleepTime = sleepTime;
    }

    @Override
    public void run() {
        System.out.println("Sleeping : " + getName());
        try {
            Thread.sleep(sleepTime);
            System.out.println("Stopping : " + getName());
        } catch (InterruptedException ie) {
            ie.printStackTrace();
        }


    }
}
