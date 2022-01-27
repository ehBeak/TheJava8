package ch14;

public class MultiCatchSample {

    public static void main(String[] args) {
        MultiCatchSample multiCatchSample = new MultiCatchSample();
        multiCatchSample.multiCatch_outOfBounds(); // "ArrayIndexOutOfBoundsException occur"
        multiCatchSample.multiCatch_nullPointer(); // "NullPointerException occur"
        multiCatchSample.multiCatch_exception(); // "Exception occur"

        // catch블록의 마지막은 Exception으로 묶어주는 것이 안전한 프로그램이 된다.
    }

    public void multiCatch_outOfBounds() {
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occur");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occur");
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }

    public void multiCatch_X() {

        /* catch 블록의 순서는 매우 중요하다. */
        int[] intArray = new int[5];

        try {
            System.out.println(intArray[5]);
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occur");
        } catch (Exception e) {
            System.out.println("Exception occur");
        } /*catch (ArrayIndexOutOfBoundsException e) { ==> Already been caught
            System.out.println("ArrayIndexOutOfBoundsException occur");
        } */
    }

    public void multiCatch_nullPointer() {
        int[] intArray = null;

        try {
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occur");
        } catch (NullPointerException e) {
            System.out.println("NullPointerException occur");
        } catch (Exception e) {
            System.out.println("Exception occur");
        }
    }

    public void multiCatch_exception() {
        int[] intArray = null;

        try {
            System.out.println(intArray[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException occur");
        }/* catch (NullPointerException e) {
            System.out.println("NullPointerException occur");
        }*/ catch (Exception e) {
            System.out.println("Exception occur");
        }
    }


}
