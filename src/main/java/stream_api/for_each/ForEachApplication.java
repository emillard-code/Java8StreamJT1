package stream_api.for_each;

import java.util.ArrayList;
import java.util.List;

public class ForEachApplication {

    public static void main( String[] args ) {

        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("Two");
        list.add("Three");
        list.add("Four");
        list.add("Five");

        list.stream().forEach(i -> System.out.println(i));

    }

}