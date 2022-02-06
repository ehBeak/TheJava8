package ch10.inheritance;

public class Animal {
    String name;
    String kind;
    int legCount;
    boolean hasWing;

    public Animal() {

    }
    public Animal(String kind, int legCount, boolean hasWing) {
        this.kind = kind;
        this.legCount = legCount;
        this.hasWing = hasWing;
    }
    public void move() {
        System.out.println("걷는다.");
    }

    public void sound() {
        System.out.println("소리냄");
    }
}
