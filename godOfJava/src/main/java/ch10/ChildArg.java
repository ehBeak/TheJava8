package ch10;

public class ChildArg extends ParentArg {


    public ChildArg() {
        System.out.println("ChildArg.ChildArg");
    }

    public ChildArg(String name) {
        // super() 은 생성자의 가장 첫 줄에 선언되어야만 한다.
        super(name); // 부모클래스의 생성자를 호출한다는 의미
        //super(null); ==> reference to ParentArg is ambiguous
        System.out.println("ChildArg.ChildArg");
    }

}
