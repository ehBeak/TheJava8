package ch23;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetSample {
    public static void main(String[] args) {

        SetSample sample = new SetSample();
        String[] cars = new String[]{
                "A", "B", "C", "D", "A", "B", "C"
        };

        System.out.println(sample.getCarKinds(cars));
    }

    public int getCarKinds(String[] cars) {
        // 매개변수로 받았을 때는 null 처리하자(NullPointerException)
        if (cars == null) {
            return 0;
        }
        if (cars.length == 1) {
            return 1;
        }

        HashSet<String> strings = new HashSet<>();
        for (String car : cars) {
            strings.add(car);
        }
        printCarSet(strings);

        return strings.size();
    }

    // foreach 문을 사용한 set 출력
    public void printCarSet(Set<String> carSet) {
        for (String str : carSet) {
            System.out.print(" tmp == " + str); // 순서에 상관없이 출력
        }
        System.out.println();
    }

    // Iterator객체를 사용한 set 출력
    public void printCarSet2(Set<String> carSet) {
        Iterator<String> iterator = carSet.iterator(); // iterator라는 메소드로 iterator객체 생성
        while (iterator.hasNext()) { // 다음 데이터가 존재하는지 확인
            System.out.print(" " + iterator.next()); // next로 다음 데이터 가리킴
        }
        System.out.println();
    }




}
