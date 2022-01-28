package ch15;

public class CheckSplit {

    public static void main(String[] args) {
        CheckSplit checkSplit = new CheckSplit();
        checkSplit.checkSplit();
        checkSplit.checkBlank();

    }

    public void checkSplit() {
        String text = "Java technology is both a programming language and a platform";
        String[] splitArray = text.split(" ");
        for (String tmp : splitArray) {
            System.out.println(tmp);
        }
    }

    /* 문자열의 공백 여부 확인 */
    public void checkBlank() {
        String text = "a ";
        String text2 = "a";

        if (text != null && text.trim().length() > 0) {
            System.out.println("공백 있음");
        }

        if (text != null && text2.trim().length() == text2.length()) {
            System.out.println("공백 없음");
        }
    }

}
