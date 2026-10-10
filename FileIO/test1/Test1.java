package FileIO.test1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("count.txt");

        int b = fis.read();
        if(b>='0'&&b<'3'){
            System.out.println("欢迎使用本软件，第"+(b-'0'+1)+"次使用免费~");
            FileOutputStream fos = new FileOutputStream("count.txt");
            fos.write(b-'0'+1+'0');
            fos.close();
        }else{
            System.out.println("您已使用3次，无法免费使用~");
        }
        fis.close();
    }

}
