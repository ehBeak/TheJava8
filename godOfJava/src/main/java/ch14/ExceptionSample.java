package ch14;

public class ExceptionSample {
    public static void main(String[] args) {
        ExceptionSample exceptionSample = new ExceptionSample();
        exceptionSample.arrayOutOfBounds();
    }

    public void arrayOutOfBounds() {
        try {
            int[] intArray = new int[5];
            System.out.println(intArray[5]);
        } catch (Exception e) {
            System.err.println("Exception occur");
        }
        System.out.println("this code must run");
    }




}
