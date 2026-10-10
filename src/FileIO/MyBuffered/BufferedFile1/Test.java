package FileIO.MyBuffered.BufferedFile1;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream("test.txt"));
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("testcopy.txt"));
        int len = 0;
        byte[] bytes = new byte[1024 * 1024 * 5];
        while ((len = bis.read(bytes)) != -1) {
            bos.write(bytes, 0, len);
        }
        bos.close();
        bis.close();
    }
}
