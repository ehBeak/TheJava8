package ch15;

import java.nio.charset.StandardCharsets;

public class StringSample {

    public static void main(String[] args) {
        StringSample stringSample = new StringSample();
        stringSample.convert();
        stringSample.convertUTF16_X();
        // 글자가 깨지는 현상을 방지하기 위해서는
        // byte배열로 생성할 때 사용한 캐릭터 셋을 문자열로 저장할 때에도 동일하게 사용하기
        stringSample.convertUTF16_O();
        stringSample.convertEUCKR();
    }

    public void convert() {
        try {
            String korean = "한글"; // "한글"이라는 값을 가진 korean(String)객체 생성

            byte[] array1 = korean.getBytes(); // korean객체를 byte배열로 만듦
            printByteArray(array1);

            String korean2 = new String(array1); // byte배열을 갖는 객체 생성 : String(byte[] bytes)
            System.out.println(korean2); // byte[] 값으로 생성한 String객체 출력

            /* "한글"이라는 값이 그대로 출력
            *  1. getBytes() 메소드는 플랫폼의 기본 캐릭터 셋으로 변환,
            *  2. String(byte[] bytes) 생성자도 플랫폼의 기본 캐릭터 셋으로 변환을 하기 때문
            * */

        } catch (Exception e) {

        }
    }

    public void printByteArray(byte[] bytes) {
        for (byte data : bytes) {
            System.out.println(data + " ");
        }
        System.out.println("bytes.length == " + bytes.length);
    }

    public void convertUTF16_X() {

        try {// UnsupportedEncodingException
            String korean = "한글";

            byte[] array1 = korean.getBytes("UTF-16");
            printByteArray(array1);

            String korean2 = new String(array1);
            System.out.println(korean2);

        } catch (Exception e) {
        }
    }

    public void convertUTF16_O() {

        try {
            String korean = "한글";

            byte[] array1 = korean.getBytes("UTF-16"); // 한글 두 글자 6바이트 사용
            printByteArray(array1);

            String korean2 = new String(array1, "UTF-16"); // byte로 변환 했을 때랑 동일하게 캐릭터 셋 사용
            System.out.println(korean2);

        } catch (Exception e) {
        }
    }

    public void convertEUCKR() {

        try {
            String korean = "한글";

            byte[] array1 = korean.getBytes("EUC-KR"); // 한글 두글자는 4바이트 사용
            printByteArray(array1);

            String korean2 = new String(array1, "EUC-KR");
            System.out.println(korean2);

        } catch (Exception e) {
        }
    }
}
