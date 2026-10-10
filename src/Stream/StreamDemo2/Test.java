package Stream.StreamDemo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        /*list.add("111");
        list.add("222");
        list.add("333");
        list.add("144");
        list.add("555");
        list.add("11");
        list.add("11");
         */
        Collections.addAll(list,"111","222","333","144","555","11");


        list.stream().filter(s -> s.startsWith("1")).filter(s->s.length()==3).forEach(System.out::println);
        System.out.println("------------------");
        list.stream().sorted().forEach(System.out::println);
        System.out.println("------------------");
        list.stream().sorted((s1,s2)->s2.compareTo(s1)).forEach(System.out::println);
        System.out.println("------------------");
        list.stream().sorted().distinct().forEach(System.out::println);
        System.out.println("-----------------");
        list.stream().map(Integer::parseInt).forEach(System.out::println);
        System.out.println("-----------------");
        list.stream().map(s->Integer.parseInt(s)).forEach(System.out::println);
        System.out.println("-----------------");
        list.stream().map(s->"数字是:"+s).forEach(System.out::println);
        System.out.println("-----------------");
        list.stream().map(s->Integer.parseInt(s)).max(Integer::compareTo).map(s->"最大值是:"+s).ifPresent(System.out::println);
        System.out.println("-----------------");
        list.stream().map(s->Integer.parseInt(s)).min(Integer::compareTo).map(s->"最小值是:"+s).ifPresent(System.out::println);
        System.out.println("-----------------");
        System.out.println("元素个数是:"+list.stream().count());
        System.out.println("-----------------");
        System.out.println("元素总和是:"+list.stream().map(s->Integer.parseInt(s)).reduce(0,(a,b)->a+b));
        System.out.println("-----------------");
        System.out.println("元素总积是:"+list.stream().map(s->Integer.parseInt(s)).mapToLong(Integer::longValue).reduce(1L,(a,b)->a*b));
        System.out.println("-----------------");
        System.out.println("排序后的列表是:"+list.stream().sorted().collect(Collectors.toList()));
        System.out.println("-----------------");
        System.out.println("排序后的集合是:"+list.stream().sorted().collect(Collectors.toSet()));
        System.out.println("-----------------");
        System.out.println("排序后的映射是:"+list.stream().sorted().collect(Collectors.toMap(s->s,s->Integer.parseInt(s))));
    }
}
