package ch13;

/* switch문 방식 외 : 각 상수의 값 지정하기 */
public enum OverTimeValues2 {
    THREE_HOUR(18000),
    FIVE_HOUR(30000);

    private final int amount;

    // 생성자의  접근 제어자는 private, package-private만 사용 가능
    OverTimeValues2(int amount) { // 생성자를 통해 초기화
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }
}
