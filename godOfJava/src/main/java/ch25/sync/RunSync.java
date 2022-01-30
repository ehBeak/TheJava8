package ch25.sync;

public class RunSync {
    public static void main(String[] args) {


        RunSync runSync = new RunSync();
        for (int i = 0; i < 5; i++) {
            runSync.runCommonCalculate(); // Thread 5X2 10개가 plus()사용(꼬임) _ sync사용X
        }

        for (int i = 0; i < 5; i++) {
            runSync.runCommonCalculate_sync(); // sync사용 O
        }

    }

    public void runCommonCalculate() {
        CommonCalculate calc = new CommonCalculate();
        // synchronized를 사용할 때는 같은 객체의 메소드를 참조할 때 유효하다.
        ModifyAmountThread thread1 = new ModifyAmountThread(calc, true);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, true);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // 쓰레드가 종료될 때까지 기다리는 메소드
            thread2.join();
            System.out.println(calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void runCommonCalculate_sync() {
        CommonCalculate calc = new CommonCalculate();

        ModifyAmountThread thread1 = new ModifyAmountThread(calc, false);
        ModifyAmountThread thread2 = new ModifyAmountThread(calc, false);

        thread1.start();
        thread2.start();

        try {
            thread1.join(); // 쓰레드가 종료될 때까지 기다리는 메소드
            thread2.join();
            System.out.println(calc.getAmount());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
