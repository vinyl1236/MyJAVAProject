package Stream.StreamDemo1;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        /*List<String> list = List.of("zhangsan", "lisi", "wangwu", "zhaoliu");

        for (String s : list) {
            System.out.println(s);
        }
        System.out.println("-----------------");

        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
        System.out.println("-----------------");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        Map<String, Integer> map = Map.of("a", 1, "b", 2, "c", 3);

        Set<String> strings = map.keySet();
        for (String key : strings) {
            Integer value = map.get(key);
            System.out.println(key + " : " + value);
        }
        System.out.println("-----------------");
        Set<Map.Entry<String, Integer>> entries = map.entrySet();
        for (Map.Entry<String, Integer> entry : entries) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("------------------");

         */
        HashMap<String, String> hm = new HashMap<>();
        hm.put("a", "1");
        hm.put("b", "2");
        hm.put("c", "3");
        hm.put("d", "4");
        hm.put("e", "5");
        hm.put("f", "6");
        hm.put("g", "7");
        hm.put("h", "8");
        hm.put("i", "9");
        hm.put("j", "10");
        hm.put("k", "11");

        //Map<Object, Object> objectObjectMap = Map.ofEntries(hm.entrySet().toArray(new Map.Entry[0]));
        Map<String, String> copyOf = Map.copyOf(hm);


    }
}
