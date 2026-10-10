package Socket.UDP2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class Server {
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动~~~");
        DatagramSocket socket = new DatagramSocket(6666);
        byte[] buf = new byte[1024*64];
        DatagramPacket packet = new DatagramPacket(buf,buf.length);

        while (true){
            socket.receive(packet);
            int len = packet.getLength();
            String rs = new String(buf,0,len);
            System.out.println(rs);

            System.out.println(packet.getAddress().getHostAddress());
            System.out.println(packet.getPort());
        }

    }
}
