package Stream;

import java.util.ArrayList;
import java.util.List;

public class MyReduce {

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(4);
        list.add(1);
        list.add(6);

      int result =  list.stream().reduce((accumulator, element)->
                accumulator*element).get();
        System.out.println("result" + result);
        //2 4 1 6
        //accumulator = 2  8 8 48
        //element  = 4  1 6
    }
}
