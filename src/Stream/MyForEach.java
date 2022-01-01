package Stream;

import java.util.Arrays;

public class MyForEach {

    public static void main(String[] args) {

        int[] array = {3,4,5,6,6};
        Arrays.stream(array).forEach(el->{el*=2;
            System.out.print(el);
        });

        Arrays.stream(array).forEach(System.out::print);
        Arrays.stream(array).forEach(Utils::utils);
    }
}

class Utils{
public static void utils(int a){
    a=a+5;
    System.out.println("Element = " +a);
}

}