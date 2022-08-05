package stream_api.for_each;

import java.util.HashMap;
import java.util.Map;

public class ForEachMapApplication {

    public static void main( String[] args ) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        map.forEach((key, value) -> System.out.println(key + ": " + value));
        map.entrySet().forEach(i -> System.out.println(i));

    }

}