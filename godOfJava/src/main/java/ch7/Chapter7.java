package ch7;

/* 배열 */
public class Chapter7 {

    public static void main(String[] args) {

        /* 배열 선언, 초기화 */
        int[] arr1;
        int arr2[];

        int[] arr3 = new int[3];

        int[] arr4 = null; // 사용할 때는 반드시 초기화해 줘야한다.

        /* ArrayIndexOutOfBoundsException : 할당하지 않은 공간을 참조하거나 할당할 때 */

        /* 배열의 기본값 */
        // 기본 자료형 : 기본값 O
        // 참조 자료형 : 기본값 없이 null
        String[] strings = new String[2];
        System.out.println(strings[1]); // null
        System.out.println(strings); // 주소값

        boolean[] bool = new boolean[1];
        System.out.println("bool == " + bool[0]);

        /* 2차원 배열의 선언 */
        int [][] twoDim;
        twoDim = new int[2][3];

        int []twoDim2[];
        int twoDim3[][];

        /* 2차원 배열에서 의미하는 것 */
        System.out.println(twoDim[0][0]);// int값
        System.out.println(twoDim[0]);// int 배열(3개의 공간)

        /* 2차원 배열의 초기화 방법 */
        int [][]twoDim4 = new int[2][]; // 이후 twoDim4[0]의 배열의 크기도 정해줘야함
        twoDim4[0] = new int[3];
        twoDim4[1] = new int[2]; // 다른 행에서 크기를 다르게 지정할 수 있다.
//        int [][]twoDim5 = new int[][]; 컴파일 오류
//        int [][]twoDim6 = new int[][1]; 컴파일 오류


        /* 배열의 길이 */
        System.out.println(arr3.length);

        /* for문과 배열 */
        // 배열의 길이는 length를 사용하고, for문 안에서 length를 호출하지 말자

        /* 이중포문과 for루프 */
        for (int[] arr : twoDim4) { // 배열의 위치정보가 필요하면 변수를 따로 선언하기.
            for (int a : arr) {
                System.out.println(a);
            }
        }

    }



}
