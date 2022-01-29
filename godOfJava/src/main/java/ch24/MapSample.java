package ch24;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        MapSample mapSample = new MapSample();
        mapSample.checkHashMap();
        mapSample.checkKeySet();
        mapSample.checkValues();
        mapSample.checkHashMapEntry();
    }

    public void checkHashMap() {
        HashMap<String, String> map = new HashMap<>();
        map.put("A", "a");
        System.out.println(map.get("A")); // a
        System.out.println(map.get("B")); // null
        map.put("A", "1");
        System.out.println(map.get("A")); // 1
    }

    public void checkKeySet() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<String> keySet = map.keySet();
        for (String key : keySet) {
            System.out.println(map.get(key)); // 순서대로 X
        }
    }

    public void checkValues() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Collection<String> values = map.values();
        for (String value : values) {
            System.out.println(value);
        }
    }

    public void checkHashMapEntry() {
        HashMap<String, String> map = new HashMap<String, String>();
        map.put("A", "a");
        map.put("B", "b");
        map.put("C", "c");

        Set<Map.Entry<String, String>> entries = map.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
