package ch10;

public class ParentOverriding {

    public ParentOverriding() {
        System.out.println("ParentOverriding.ParentOverriding");
    }

    public void printName() {
        System.out.println("ParentOverriding.printName");
    }

    protected void printName2() {
        System.out.println("ParentOverriding.printName2");
    }

    protected void printName3() {
        System.out.println("ParentOverriding.printName3");
    }

    private void printName4() {
        System.out.println("ParentOverriding.printName4");
    }

    private void printName5() {
        System.out.println("ParentOverriding.printName5");
    }
}
