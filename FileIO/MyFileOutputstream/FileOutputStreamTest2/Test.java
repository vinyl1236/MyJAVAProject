package FileIO.MyFileOutputstream.FileOutputStreamTest2;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt", true);
        String str = "hello world";
        fos.write(str.getBytes());

        String str2 = "\r\n";
        fos.write(str2.getBytes());

        fos.close();
    }
}
