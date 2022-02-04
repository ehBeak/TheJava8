package ch32;

import java.util.Optional;
import java.util.function.Supplier;

public class Chapter32 {
    /* java8에서 추가된 것들 */
    public static void main(String[] args) {

    }

    // Optional클래스의 객체를 생성하는 방법
    private void createOptionalObjects() {
        // 1. 데이터가 없는 Optional객체를 생성하려면 이ㅘ 같이 empty메소드 사용
        Optional<String> emptyString = Optional.empty();

        // 2. 만약 null이 추가될 수 있는 상황이라면, ofNullable 메소드를 사용한다
        String common = null;
        Optional<String> nullableString = Optional.ofNullable(common);

        // 3. 반드시 데이터가 들어갈 수 있는 상황에는 of()메소드를 사용한다.
        common = "common";
        Optional<String> commonString = Optional.of(common);
    }

    // Optional 클래스가 비어 있는지 확인하는 메소드
    private void checkOptionalData() {
        System.out.println(Optional.of("present").isPresent()); // true
        System.out.println(Optional.ofNullable(null).isPresent()); // false
    }

    // 값을 꺼내는 방법
    private void getOptionalData(Optional<String> data) throws Exception {

        // 1. get()사용, 데이터가 없을 경우 null이 리턴
        String result1 = data.get();

        // 2. orElse(기본값)사용, 값이 없을 때 기본값 지정가능
        String defaultValue = "default";
        String result2 = data.orElse(defaultValue);

        // 3. orElseGet(Supplier)사용, Supplier 인터페이스 사용하여 값 꺼내는 방법(기본값 설정)
        Supplier<String> stringSupplier = new Supplier<String>() {
            @Override
            public String get() {
                return "GodOfJava";
            }
        };
        String result3 = data.orElseGet(stringSupplier);

        // 4. orElseThrow(Supplier) 사용, 데이터가 없을 경우 예외를 발생시키고 싶을 때
        Supplier<Exception> exceptionSupplier = new Supplier<Exception>() {
            @Override
            public Exception get() {
                return new Exception();
            }
        };
        String result4 = data.orElseThrow(exceptionSupplier);
    }
}
