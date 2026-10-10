package FileIO.FileModify;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Test {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt");
        StringBuilder sb = new StringBuilder();
        int len;
        while ((len = fr.read()) != -1) {
            sb.append((char) len);
        }
        fr.close();

        /*String str = sb.toString();
        String[] arr = str.split("-");

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(Integer.parseInt(arr[i]));
        }
        Collections.sort(list);
        System.out.println(list);

        FileWriter fw = new FileWriter("test.txt");
        for (int i = 0; i <= list.size() - 1; i++) {
            if(i!=list.size()-1){
                fw.write(list.get(i) + "-");
            }else{
                fw.write(list.get(i)+"");
            }
        }
        fw.close();

         */
        Integer[] arr = Arrays.stream(sb.toString().split("-"))
                .map(Integer::parseInt)
                .sorted()
                .toArray(Integer[]::new);

        FileWriter fw = new FileWriter("test.txt");

        System.out.println(Arrays.toString(arr));
        String s = Arrays.toString(arr)
                .replace(" ", "")
                .replace("[", "")
                .replace("]", "")
                .replace(",", "-");
        System.out.println(s);

        fw.write(s);
        fw.close();
    }
}
