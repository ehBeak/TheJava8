package ch7;

public class ArrayLength {

    public static void main(String[] args) {
        ArrayLength array = new ArrayLength();
        array.printArrayLength();
    }

    public void printArrayLength() {
        int[] oneDim = new int[3];
        int[][] twoDim = new int[4][2];

        System.out.println(oneDim.length); // 3
        System.out.println(twoDim.length); // 4 : 1차원의 크기를 알려준다.

        // 2차원의 크기를 알고 싶다면?
        System.out.println(twoDim[0].length);
        System.out.println(twoDim[1].length); // 2

//        System.out.println(twoDim[0][0].length); => 값은 length를 사용할 수 없다.
    }
}
