package Socket.UDP1;

import java.io.IOException;
import java.net.*;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(7777);
        byte[] bytes = "hello,大家好，我是唱片".getBytes();
        DatagramPacket packet = new DatagramPacket(bytes, bytes.length, InetAddress.getLocalHost(), 6666);

        socket.send(packet);
        System.out.println("客户端发送完毕~~~");
        socket.close();
    }
}
