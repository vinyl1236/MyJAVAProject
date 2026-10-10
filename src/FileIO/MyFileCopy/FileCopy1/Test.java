package FileIO.MyFileCopy.FileCopy1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        long startTime = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("abc.mp4");
        FileOutputStream fos = new FileOutputStream("copy.mp4");

        int len;
        byte[] buf = new byte[1024 * 1024 * 5];
        while ((len = fis.read(buf)) != -1)
            fos.write(buf, 0, len);

        fos.close();
        fis.close();
        long endTime = System.currentTimeMillis();
        System.out.println((endTime - startTime) + "ms");
    }
}