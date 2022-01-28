package ch16;

public class NestedValueReference {
    public int publicInt = 0;
    protected int protectedInt = 1;
    int justInt = 2;
    protected int privateInt = 3;

    static int staticInt = 4;

    static class StaticNested {
        private int staticNestedInt = 99;

        public void setValue() {
            staticInt = 14; // static nested 클래스는 외부 클래스의 static변수만 참조할 수 있다.
        }
    }

    class Inner { // 내부클래스, 익명클래스

        private int innerInt = 100;

        public void setValue() { // 외부 클래스의 어떤 변수든 참조가능
            publicInt = 20;
            protectedInt = 21;
            justInt = 22;
            privateInt = 23;
            staticInt = 24;
        }
    }

    public void setValue() {
        // 익명클래스도 외부 클래스의 모든 값 참조 가능하다.
        EventListener listener = new EventListener() {
            @Override
            public void onClick() {
                publicInt = 30;
                protectedInt = 31;
                justInt = 32;
                privateInt = 33;
                staticInt = 34;
            }
        };
    }

    public void setValue(int value) { // 외부에서는 모든 내부 클래스의 변수들 참조 가능
        StaticNested staticNested = new StaticNested();
        staticNested.staticNestedInt = value;

        Inner inner = new Inner();
        inner.innerInt = value;
    }


}
