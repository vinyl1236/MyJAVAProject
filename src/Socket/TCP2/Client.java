package Socket.TCP2;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("客户端启动成功~~~");
        Scanner sc = new Scanner(System.in);
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        while (true) {
            System.out.println("请说:");
            String s = sc.nextLine();
            if (s.equals("exit")) {
                System.out.println("成功下线");
                socket.close();
                break;
            }

            dos.writeUTF(s);
            dos.flush();
        }
    }
}
