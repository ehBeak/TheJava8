package ch14;

public class ThrowableSample {
    public static void main(String[] args) {
        ThrowableSample sample = new ThrowableSample();
        sample.throwable();
    }

    public void throwable() {
        int[] intArray = new int[5];

        try {
//            intArray = null;
            System.out.println(intArray[5]);
        } catch (Throwable t) {
            System.out.println(t.getMessage());
            System.out.println(t.toString());
            t.printStackTrace(); // 로그가 쌓이기 때문에 운영할 시스템에는 사용 권장하지 않음(꼭 필요할 때만)
        }
    }
}
