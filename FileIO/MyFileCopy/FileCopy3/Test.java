package FileIO.MyFileCopy.FileCopy3;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {
        File aaa = new File("D:\\aaa");
        File bbb = new File("D:\\bbb");
        copydir(aaa, bbb);
    }

    public static void copydir(File src, File dest) throws IOException {
        if(!dest.exists()){
            dest.mkdirs();
        }
        File[] files = src.listFiles();
        for (File file : files) {
            if(file.isFile()){
                FileInputStream fis = new FileInputStream(file);
                FileOutputStream fos = new FileOutputStream(new File(dest, file.getName()));

                int len;
                byte[] bytes = new byte[1024*1024*5];
                while((len = fis.read(bytes)) != -1){
                    fos.write(bytes, 0, len);
                }
                fos.close();
                fis.close();
            }else{
                copydir(file, new File(dest, file.getName()));
            }
        }
    }
}
