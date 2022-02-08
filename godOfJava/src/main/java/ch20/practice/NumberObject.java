package ch20.practice;

public class NumberObject {

    public static void main(String[] args) {
        NumberObject numberObject = new NumberObject();
        numberObject.parseLong("r1024");
        numberObject.parseLong("1234");
        numberObject.printOtherBase(1024L);
    }

    public long parseLong(String data) {
        try {
            long res = Long.parseLong(data);
            System.out.println(Long.parseLong(data));
            return res;
        } catch (Exception e) {
            System.out.println(data + " is not a number");
            return -1L;
        }
    }

    public void printOtherBase(long value) {
        System.out.println("Original:" + value);
        System.out.println("Binary  :" + Long.toBinaryString(value));
        System.out.println("Hex     :" + Long.toHexString(value));
        System.out.println("Octal   :" + Long.toOctalString(value));
    }
}
