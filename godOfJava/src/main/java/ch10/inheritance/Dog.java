package ch10.inheritance;

public class Dog extends Animal {
    String size;

    public Dog(String kind, int legCount, boolean hasWing, String size) {
        super(kind, legCount, hasWing);
        this.size = size;
    }

    @Override
    public void sound() {
        System.out.println("멍멍");
    }
}
