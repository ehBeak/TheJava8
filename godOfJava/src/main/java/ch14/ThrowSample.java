package ch14;

/* 발생시킨 예외를 catch문으로 잡기 */
public class ThrowSample {
    public static void main(String[] args) {
        ThrowSample throwSample = new ThrowSample();
        throwSample.throwException(14);
//        throwSample.throwsException(14); ==> 1. throws문으로 위임을 했기 때문에 try-catch문으로 묶어줘야 한다.
//                                             2. main에서도 throws문을 쓴다.
        try {
            throwSample.throwsException(14);
        } catch (Exception e) {

        }

    }

    public void throwException(int number) {
        try {
            if (number > 12) {
                throw new Exception("Number is over than 12"); // ...1) 예외 발생시킴
            }
            System.out.println(number);
        } catch (Exception e) { // ...2) 발생시킨 예외가 catch문에서 잡힘
            e.printStackTrace();
        }
    }
    //==> 만약 해당하는 Exception이 없다면? : 예외를 메소드 밖으로 던진다.
    // 이때 throws 구문을 사용한다.

    public void throwsException(int number) throws Exception { // 예외처리 위임(자신을 호출한 곳에)
        if (number > 12) {
            throw new Exception("Number is over than 12");
        }
        System.out.println(number);
    }
}
