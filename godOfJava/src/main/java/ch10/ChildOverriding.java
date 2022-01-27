package ch10;

public class ChildOverriding extends ParentOverriding {

    public ChildOverriding() {
        System.out.println("ChildOverriding.ChildOverriding");
    }

    public void printName() {
        System.out.println("ChildOverriding.printName");
    }
/*
    오버라이딩한 메소드의 접근 제어자가 private면 에러
    ==> 자식 메소드(오버라이딩)의 접근제어자가 부모 메소드의 접근제어자보다 축소되면 안된다.
    private void printName() {
        System.out.println("ChildOverriding.printName");
    }
*/

/*
    오버라이딩한 메소드의 리턴값이 다르면 에러
    public String printName() {
        System.out.println("ChildOverriding.printName");
    }
*/
    public void printName2() {
        System.out.println("ChildOverriding.printName2");
    }

    public void printName4() {
        System.out.println("ChildOverriding.printName4");
    }
}
