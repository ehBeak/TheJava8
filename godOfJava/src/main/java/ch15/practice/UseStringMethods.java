package ch15.practice;

import java.util.Locale;

public class UseStringMethods {
    public static void main(String[] args) {
        String str = "The String class represents character strings.";

        UseStringMethods useStringMethods = new UseStringMethods();
        useStringMethods.printWords(str);
        useStringMethods.findString(str, "String");
        useStringMethods.findAnyCase(str, "string");
        useStringMethods.countChar(str, 's');
        useStringMethods.printContainWords(str, "ss");

    }

    // str 문장의 단어들을 출력한다.
    public void printWords(String str) {
        String[] strings = str.split(" ");
        for (String string : strings) System.out.println(string);
    }

    // findStr 로 넘겨준 값과 동일한 단어의 첫번째 위치를 출력
    public void findString(String str, String findStr) {
        System.out.println(findStr + " is appeared at " + str.lastIndexOf(findStr));
    }

    // str 중에서 findStr로 넘겨준 값과 "대소문자 구분 없이" 동일한 단어의 첫 번째 위치 출력
    public void findAnyCase(String str, String findStr) {
        System.out.println(findStr + " is appeared at " + str.toLowerCase(Locale.ROOT).indexOf(findStr));
    }

    public void countChar(String str, char c) {
        char[] chars = str.toCharArray();
        int cnt = 0;

        for (char tmp : chars) {
            if (tmp == c) cnt++;
        }

        System.out.println("char '" + c + "' count is " + cnt);
    }

    public void printContainWords(String str, String findStr) {
        String[] strings = str.split(" ");
        for (String string : strings) {
            if (string.contains(findStr)) {
                System.out.print(string + " is contains ss");
            }
        }

    }
}
