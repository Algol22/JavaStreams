package Stream;

import java.util.Arrays;

public class MethodChaining {

    public static void main(String[] args) {
        int [] array = {1,4,2,6,3,6,2,5};


       int result = Arrays.stream(array).filter(el->el%2==1)
                .map(el->
                {if(el%3==0){el=el/3;} return el;})
                .reduce((a,e)->(a+e)).getAsInt();

        System.out.println(result);
    }

}
