package ch15;

public class CheckCompare {
    public static void main(String[] args) {
        CheckCompare checkCompare = new CheckCompare();
        checkCompare.checkCompare();

    }

    public void checkCompare() { // Comparable 인터페이스에 존재, 정렬시 사용
        String text = "a";
        String text2 = "b";
        String text3 = "c";

        System.out.println(text2.compareTo(text)); // 1
        System.out.println(text2.compareTo(text3)); // -1
        System.out.println(text.compareTo(text3)); //-2
    }
}
