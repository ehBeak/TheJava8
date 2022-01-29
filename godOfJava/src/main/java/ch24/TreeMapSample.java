package ch24;

import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* 정렬 가능 :  SortedMap 이라는 인터페이스 구현했기 때문 */
public class TreeMapSample {
    public static void main(String[] args) {

    }
    public void checkTreeMap() {
        TreeMap<String, String> map = new TreeMap<>();
        //==> key정렬 : 숫자>알파벳 대문자>알파벳 소문자>한글
        map.put("A", "a");
        map.put("가", "1");
        map.put("1", "f");
        map.put("a", "g");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
