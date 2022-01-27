package ch8;

import java.lang.reflect.Member;

/* 값만 전달한다. */
public class ReferencePass {

    public static void main(String[] args) {
        ReferencePass referencePass = new ReferencePass();
        referencePass.callPassByValue();
        referencePass.callPassReference();
    }

    public void callPassByValue() {
        int a = 10;
        String b = "b";

        System.out.println("before passByValue");
        System.out.println("a == " + a); // 10
        System.out.println("b == " + b); // b

        passByValue(a, b);

        System.out.println("after passByValue");
        System.out.println("a == " + a); // 10
        System.out.println("b == " + b); // b => String은 값에 의한 전달?

    }

    public void passByValue(int a, String b) {
        a = 20;
        b = "z";
        System.out.println("in passByValue");
        System.out.println("a == " + a); // 20
        System.out.println("b == " + b); // z
    }

    public void callPassReference() {
        MemberDto member = new MemberDto("sangmin");
        System.out.println("before passByReference");
        System.out.println("member.name == " + member.name); //sangmin

        passByReference(member); //sungchoon

        System.out.println("before passByReference"); //sungchoon
        System.out.println("member.name == " + member.name);

    }

    public void passByReference(MemberDto member) {
        member.name = "sungchoon";
        System.out.println("in passByReference");
        System.out.println("member.name == " + member.name);
    }
}
