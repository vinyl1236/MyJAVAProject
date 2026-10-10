package FileIO.MyConvertStream.ConvertStreamDome1;

import java.io.*;
import java.nio.charset.Charset;

public class Test {
    public static void main(String[] args) throws IOException {
        /*InputStreamReader isr = new InputStreamReader(new FileInputStream("jbkflie.txt"), "GBK");
        int ch;
        while((ch=isr.read())!=-1){
            System.out.print((char)ch);
        }
        isr.close();

         */
        FileReader fr = new FileReader("jbkflie.txt", Charset.forName("GBK"));
        int ch;
        while((ch=fr.read())!=-1){
            System.out.print((char)ch);
        }
        fr.close();
    }
}
