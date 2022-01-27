package ch14;

public class CustomException {

    public static void main(String[] args) {
        CustomException customException = new CustomException();
        try {
            customException.throwMyException(13);
        } catch (MyException mye) {
            mye.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }

        customException.throwMyRuntimeException(12);// 그래도 try-catch문으로 감싸주자


    }

    public void throwMyException(int number) throws MyException{
        if (number > 12) {
            throw new MyException("number is over than 12");
        }

    }

    public void throwMyRuntimeException(int number) {
        throw new MyRuntimeException("number is over than 12");
    }
}
