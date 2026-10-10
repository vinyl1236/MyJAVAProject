package FileIO.MyFileOutputstream.FileOutputStreamTest1;

import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("test.txt");
        fos.write(97);
        fos.close();
    }
}
