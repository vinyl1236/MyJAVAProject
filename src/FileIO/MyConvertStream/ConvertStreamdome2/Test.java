package FileIO.MyConvertStream.ConvertStreamdome2;

import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        /*OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("test.txt"),"GBK");
        osw.write("你好你好");
        osw.close();

         */
        FileWriter fw = new FileWriter("test.txt", Charset.forName("GBK"));
        fw.write("你好你好");
        fw.close();
    }
}
