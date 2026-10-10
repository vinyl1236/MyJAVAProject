package Socket.TCP1;

import java.io.DataOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {

        System.out.println("客户端启动成功~~~");
        Socket socket = new Socket("127.0.0.1", 8888);

        OutputStream os = socket.getOutputStream();
        DataOutputStream dos = new DataOutputStream(os);

        dos.writeUTF("大家好");
        dos.close();

        socket.close();
    }
}
