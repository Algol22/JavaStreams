package Stream;

import java.util.Arrays;

public class MySorted {
    public static void main(String[] args) {
        int[] array = {1,3,4,2,1,5,5,2};
        array = Arrays.stream(array).sorted().toArray();
        System.out.println(Arrays.toString(array));
    }

}
