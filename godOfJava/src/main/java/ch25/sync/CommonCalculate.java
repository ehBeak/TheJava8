package ch25.sync;

public class CommonCalculate {

    private int amount;

    public CommonCalculate() {
        amount = 0;
    }

    public void plus(int value) {
        amount += value;
    }

    public void plus_sync(int value) {
        synchronized (this) { // synchronized를 필요 부분만 처리한다.
            amount += value;
        }
    }

    public synchronized void minus(int value) {
        amount -= value;
    } // synchronized

    public int getAmount() {
        return amount;
    }
}
