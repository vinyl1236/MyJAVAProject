package FileIO.FileReader;

import java.io.*;

public class Test {
    public static void main(String[] args) throws IOException {
        //FileWriter fr = new FileWriter("test.txt");

        //fr.write("\r\n");
        //fr.write("你好");

        /*FileOutputStream fos = new FileOutputStream("Test.txt");
        fos.write("你好".getBytes(StandardCharsets.UTF_8));
        FileInputStream fis = new FileInputStream("Test.txt");
        int len;
        byte[] buffer = new byte[1024*1024*5];
        while ((len = fis.read(buffer)) != -1) {
            System.out.println(new String(buffer, 0, len, StandardCharsets.UTF_8));
        }
        fis.close();
        fos.close();

         */
        FileReader fr = new FileReader("test.txt");
        fr.read();
        FileWriter fw = new FileWriter("test.txt");
        fw.write(97);
        fw.flush();



        int len;
        char[] buffer = new char[1024*1024*5];
        while ((len = fr.read(buffer)) != -1) {
            System.out.print(new String(buffer,0,len));
        }
        fr.close();
    }
}
