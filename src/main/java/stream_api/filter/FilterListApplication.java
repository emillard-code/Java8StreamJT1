package stream_api.filter;

import java.util.ArrayList;
import java.util.List;

public class FilterListApplication {

    public static void main( String[] args ) {

        List<String> list = new ArrayList<>();

        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.stream().filter(t -> t.startsWith("F")).forEach(i -> System.out.println(i));

    }

}