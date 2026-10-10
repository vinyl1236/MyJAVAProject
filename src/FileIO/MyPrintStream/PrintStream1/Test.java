package FileIO.MyPrintStream.PrintStream1;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException, UnsupportedEncodingException {
        PrintStream ps = new PrintStream(new FileOutputStream("test.txt"),true,"UTF-8");
        ps.println("你好");
        ps.close();
    }
}
