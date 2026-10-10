package FileIO.test1;

import java.io.*;

public class Test2 {
    public static void main(String[] args) throws IOException {
        BufferedReader fr = new BufferedReader(new FileReader("count.txt"));
        String line = fr.readLine();
        int count = Integer.parseInt(line);
        if(count>=0&&count<3){
            System.out.println("欢迎使用本软件，第"+(count+1)+"次使用免费~");
        }else{
            System.out.println("您已使用3次，无法免费使用~");
        }
        fr.close();
        BufferedWriter bw = new BufferedWriter(new FileWriter("count.txt"));
        bw.write((count+1)+"");
        bw.close();
    }
}
