package ch13;

/* enum클래스와 switch, 값 넘기기 */
public class OverTimeManager {
    public static void main(String[] args) {
        OverTimeManager overTimeManager = new OverTimeManager();
        overTimeManager.getOverTimeAmount(OverTimeValues.FIVE_HOURS); // enum 값 넘기기

    }

    public int getOverTimeAmount(OverTimeValues value) {
        switch (value) {
            case THREE_HOURS:
                return 18000;
            case FIVE_HOURS:
                return 100000;
            default:
                return 0;
        }
    }
}
