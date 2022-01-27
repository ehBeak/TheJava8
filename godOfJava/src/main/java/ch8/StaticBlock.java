package ch8;

/* static 블록은 생성자가 불리지 않더라도, 클래스에 대한 참조가 발생하자마자 호출된다. */
public class StaticBlock {
    static int data = 1;

    public StaticBlock() {
        System.out.println("StaticBlock.StaticBlock");
    }

    // static 블록은 선언된 순서대로 호출된다., static한 것들만 호출가능
    static {
        System.out.println("*** first static block ***");
        data = 3;
    }

    static {
        System.out.println("*** second static block ***");
        data = 5;
    }

    public static int getData() {
        return data;
    }


    public static void main(String[] args) {
        StaticBlock.makeStaticBlockObject();
    }

    public static void makeStaticBlockObject() {
        System.out.println("creating block1");
        StaticBlock staticBlock1 = new StaticBlock();
        System.out.println("created block1");

        System.out.println("====================");

        System.out.println("creating block2");
        StaticBlock staticBlock2 = new StaticBlock();
        System.out.println("created block2");

    }
}
