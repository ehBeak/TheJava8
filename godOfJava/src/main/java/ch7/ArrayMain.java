package ch7;

public class ArrayMain {
    public static void main(String[] args) { // 시작할 때 전달할 값들 넘겨주는 용도
        System.out.println("===args===");
        for (String s : args) {
            System.out.println(s);
        }
    }
}
