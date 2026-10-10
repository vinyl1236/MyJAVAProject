package FileIO.MyConvertStream.ConvertStreamDome4;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Test {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("test.txt");
        InputStreamReader isr = new InputStreamReader(fis);
        BufferedReader br = new BufferedReader(isr);
        //int ch;
        //while ((ch = isr.read()) != -1) {
        //    System.out.print((char)ch);
        //}
        String line = br.readLine();
        System.out.println(line);
        fis.close();
        isr.close();
    }
}
