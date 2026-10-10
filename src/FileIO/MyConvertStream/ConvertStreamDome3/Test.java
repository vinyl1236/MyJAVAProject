package FileIO.MyConvertStream.ConvertStreamDome3;

import java.io.*;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("test.txt"),"GBK");
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("testcopy.txt"),"UTF-8");
        int ch;
        while((ch=isr.read())!=-1){
            osw.write(ch);
        }
        isr.close();
        osw.close();

         */
        FileReader fr = new FileReader("test.txt", Charset.forName("GBK"));
        FileWriter fw = new FileWriter("testcopy.txt", Charset.forName("UTF-8"));
        int c;
        while ((c = fr.read()) != -1) {
            fw.write(c);
        }
        fr.close();
        fw.close();
    }
}
