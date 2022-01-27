package ch10;

public class ParentArg {


    public ParentArg() {

    }

    public ParentArg(String name) {
        System.out.println("ParentArg.ParentArg(Constructor)-String");
    }

    public ParentArg(InheritancePrint obj) {
        System.out.println("ParentArg.ParentArg(Constructor)-Inheritance");
    }

    public void printName() {
        System.out.println("ParentArg.printName");
    }
}
