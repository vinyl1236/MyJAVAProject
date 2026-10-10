package FileIO.MyFileCopy.FileCopy2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
     FileReader fr = new FileReader("test.txt");
     FileWriter fw = new FileWriter("test2.txt");
     int len;
     char[] buffer = new char[1024*1024*5];
     while ((len = fr.read(buffer)) != -1) {
        fw.write(buffer, 0, len);
     }
     fr.close();
     fw.close();
    }
}
