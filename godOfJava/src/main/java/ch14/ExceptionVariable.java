package ch14;

public class ExceptionVariable {
    public static void main(String[] args) {
        ExceptionVariable sample = new ExceptionVariable();
        sample.checkVariable();
        sample.checkVariable_solution();
    }

    public void checkVariable() {
        int[] intArray = new int[5];
        try {
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length);
        }
        System.out.println("this code must run");
    }

    public void checkVariable_X() {

        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            //System.out.println(intArray.length); // try 블록 안에서 선언되었기 때문에 catch블록에서는 알 수 없다
        }
        System.out.println("this code must run");
    }

    /* 위의 메소드 해결 방법 */
    public void checkVariable_solution() {
        int[] intArray = null;
        try {
            intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.out.println(intArray.length); // 5출력
            //==> 처음에는 null을 초기화 했지만, try문에서 객체를 참조했기 때문에 그대로 간다.
        }
        System.out.println("this code must run");
    }
}
