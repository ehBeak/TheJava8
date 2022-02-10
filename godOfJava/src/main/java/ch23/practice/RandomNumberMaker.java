package ch23.practice;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomNumberMaker {
    public static void main(String[] args) {
        RandomNumberMaker randomNumberMaker = new RandomNumberMaker();
        for (int i = 0; i < 10; i++) {
            HashSet<Integer> sixNumber = randomNumberMaker.getSixNumber();
            System.out.println(sixNumber.toString());
        }
    }

    public HashSet<Integer> getSixNumber() {
        HashSet<Integer> integers = new HashSet<>();
        Random random = new Random();
        while (true) {
            int tempNumber = random.nextInt(45);
            integers.add(tempNumber);
            if(integers.size()==6) break;
        }

        return integers;
    }
}
