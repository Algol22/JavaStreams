package Stream;

import java.util.*;
import java.util.stream.Collectors;

public class MyMap {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("hi");
        list.add("bye");

        list.set(1,"oops");

//        System.out.println(String.valueOf(list.get(0).length()));

        List <Integer> list2 = list.stream().map(element->element.length()).collect(Collectors.toList());
        System.out.println(list2);

        int[] array ={5,4,3,2,1};
        Arrays.stream(array).map(element->{if(element%3==0) {
            element = element/3;
        }
        return element;
        }).toArray();

//        System.out.println(Arrays.toString(array));


        Set <String> set = new TreeSet<>();
        set.add("hi");
        set.add("bye");
        System.out.println(set);

       Set <Integer> set2 = set.stream().map(i->i.length()).collect(Collectors.toSet());
        List <Integer> set3 = set.stream().map(i->i.length()).collect(Collectors.toList());
        System.out.println(set2);
        System.out.println(set3);
    }
}
