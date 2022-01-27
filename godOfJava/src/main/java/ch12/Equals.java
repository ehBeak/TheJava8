package ch12;

import ch8.MemberDto;

public class Equals {
    public static void main(String[] args) {
        Equals equals = new Equals();
        equals.equalMethod();// different
    }

    public void equalMethod() {
        MemberDto obj1 = new MemberDto("SangJun");
        MemberDto obj2 = new MemberDto("SangJun");

        if (obj1 == obj2) {
            System.out.println("same");
        } else {
            System.out.println("different");
        }

    }
}
