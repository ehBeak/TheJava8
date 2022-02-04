package ch32;

public interface PreviousInterface {
    static final String name = "GodOfJavaBook";
    static final int since = 2013;
    String getName();
    int getSince();

    // 하위 호환성의 이유로 default 예약어 추가
    default String getEmil() {
        return name + "@godOfJava.com";
    }

}
