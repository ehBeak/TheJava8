package ch16;

public class OuterOfStatic {

    // Static nested 클래스
    static class StaticNested { // 이 클래스 외부의 변수를 사용할 수 없다.
        private int value = 0;

        public int getValue() {
            return value;
        }

        public void setValue(int value) {
            this.value = value;
        }
    }

}
