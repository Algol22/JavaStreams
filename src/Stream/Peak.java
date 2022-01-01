package Stream;

import java.util.stream.Stream;

public class Peak {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 4);
        System.out.println(stream1.distinct().peek(System.out::println).count());
    }
}
