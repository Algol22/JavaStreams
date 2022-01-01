package Stream;

import java.util.ArrayList;
import java.util.List;

public class ParallelStream {

    public static void main(String[] args) {
        List<Double> doubleList = new ArrayList<>();
        doubleList.add(1.0);
        doubleList.add(41.0);
        doubleList.add(3.0);
        doubleList.add(31.0);

       double result = doubleList.parallelStream().reduce((ac, el)->ac/el).get();
        System.out.println(result);
    }
}
