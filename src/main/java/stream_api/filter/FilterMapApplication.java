package stream_api.filter;

import java.util.HashMap;
import java.util.Map;

public class FilterMapApplication {

    public static void main( String[] args ) {

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "One");
        map.put(2, "Two");
        map.put(3, "Three");
        map.put(4, "Four");
        map.put(5, "Five");

        map.entrySet().stream().filter(i -> i.getKey() % 2 == 0).forEach(i -> System.out.println(i));

    }

}