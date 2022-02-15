package ch25.practice;

import java.util.Date;

public class TimerThread extends Thread{
    @Override
    public void run() {
        printCurrentTime();
    }

    public void printCurrentTime() {
        for (int loop = 0; loop < 10; loop++) {
            Date date = new Date();

            System.out.println(date + " " + (System.currentTimeMillis() - (System.currentTimeMillis() % 1000)));
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}
