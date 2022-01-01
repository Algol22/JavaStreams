package Stream;

import java.util.stream.Stream;

public class MyConcat {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1,2,3,4,4);
        Stream<Integer> stream2 = Stream.of(4,4,5,2,2);

        Stream<Integer> stream3 = Stream.concat(stream1,stream2);
        stream3.forEach(System.out::println);
    }
}
