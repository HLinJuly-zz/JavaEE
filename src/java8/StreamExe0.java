package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamExe0 {
    public static void main(String[] args){
        String[] arr = new String[]{"a", "b", "c"};
        Stream<String> stream = Arrays.stream(arr);
        //System.out.println(stream.forEach());
        stream=Stream.of("a", "b", "c");

       // Stream<String> stream = list.stream();

        //list.parallelStream().forEach(element->doWork(element));
        List<String> list = new ArrayList<>();
        list.add("One");
        list.add("OneAndOnly");
        list.add("Derek");
        list.add("Change");
        list.add("factory");
        list.add("justBefore");
        list.add("Italy");
        list.add("Italy");
        list.add("Thursday");
        list.add("");
        list.add("");
        boolean isExist = list.stream().anyMatch(element->element.contains("a"));
        System.out.println(isExist);
        list.stream().forEach(s->System.out.println(s));
        stream.peek(s->System.out.println(s));
    }
}
