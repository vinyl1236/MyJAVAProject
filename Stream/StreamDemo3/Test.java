package Stream.StreamDemo3;

import java.util.Arrays;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        /*HashMap<String,Integer> hm = new HashMap<>();
        hm.put("111",1);
        hm.put("222",2);
        hm.put("333",3);
        hm.put("444",4);
        hm.put("555",5);

        hm.entrySet().stream().forEach(System.out::println);

         */

        int[] arr = {1,2,3,4,5,6,7};
        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("------------------");
        String[] arr2 = {"111","222","333","444","555","11"};
        Arrays.stream(arr2).forEach(System.out::println);
        System.out.println("------------------");
        Integer[] arr3 = {1,2,3,4,5,6,7};
        Arrays.stream(arr3).forEach(System.out::println);
        System.out.println("------------------");
        Stream.of(arr).forEach(System.out::println);
    }
}
