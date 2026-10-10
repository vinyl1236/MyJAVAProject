package FileIO.MyZipStream.ZipStreamDome1;

import java.io.*;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

public class Test {
    public static void main(String[] args) throws IOException {
        File src = new File("D:\\bbb.zip");
        File dest = new File("D:\\ccc");

        unzip(src,dest);
    }
    public static void unzip(File src,File dest) throws IOException {
        ZipInputStream zis = new ZipInputStream(new FileInputStream(src));
        ZipEntry ze;
        while ((ze=zis.getNextEntry())!= null) {
            System.out.println(ze);
            if (ze.isDirectory()) {
                File file = new File(dest,ze.toString());
                file.mkdirs();
            }else{
                FileOutputStream fos = new FileOutputStream(new File(dest,ze.toString()));
                int len;
                while((len=zis.read())!=-1){
                    fos.write(len);
                }
                fos.close();
                zis.closeEntry();
            }
        }
        zis.close();
    }
}
