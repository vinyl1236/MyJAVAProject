package FileIO.FileEncryption;

import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        /*FileInputStream fis = new FileInputStream("123enc.jpg");
        FileOutputStream fos = new FileOutputStream("1234.jpg");
        int len;
        while ((len = fis.read()) != -1) {
            fos.write(len^2);
        }
        fos.close();
        fis.close();

         */
        StringBuilder sb = new StringBuilder("123456");
        sb.append("char");

        System.out.println(sb);

    }
}
