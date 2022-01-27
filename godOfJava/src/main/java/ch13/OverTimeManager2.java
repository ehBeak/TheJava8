package ch13;

// switch 없이 enum의 값 넘기기
public class OverTimeManager2 {

    public static void main(String[] args) {
        System.out.println(OverTimeValues2.FIVE_HOUR); //FIVE_HOUR
        System.out.println(OverTimeValues2.FIVE_HOUR.getAmount()); // 30000

        OverTimeValues2 val1 = OverTimeValues2.FIVE_HOUR;
        OverTimeValues2 val2 = OverTimeValues2.THREE_HOUR;
        System.out.println(val1.equals(val2)); // false
        System.out.println(val1.compareTo(val2)); // val2가 val1보다 뒤에 있음 +1(매개변수 기준)

        OverTimeValues2[] values = OverTimeValues2.values();
        for (OverTimeValues2 val : values) {
            System.out.println(val);
        }

    }
}
