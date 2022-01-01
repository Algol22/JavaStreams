package Stream;

import java.util.stream.Stream;

public class Distinct {
    public static void main(String[] args) {
        Stream<Integer> stream1 = Stream.of(1, 2, 3, 4, 4);
        stream1.distinct().forEach(System.out::println);

    }
}
