package Stream.StreamDemo4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list,1,2,3,4,5,6,7);

        ArrayList<Integer> list2 = new ArrayList<>();
        Collections.addAll(list2,8,9,10,11,12,13,14);

        Stream.concat(list.stream(),list2.stream()).forEach(System.out::println);
        System.out.println("------------------");
        Integer[] arr = Stream.concat(list.stream(),list2.stream()).toArray(Integer[]::new);
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("------------------");
        Object[] arr2 = list.stream().toArray();
        Arrays.stream(arr2).forEach(System.out::println);

    }
}
