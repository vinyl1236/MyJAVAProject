package Socket.UDP2;

import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Client {
    public static void main(String[] args) throws IOException {
        DatagramSocket socket=new DatagramSocket(7777);

        Scanner sc=new Scanner(System.in);

        while(true){
            System.out.println("请说:");
            String msg = sc.nextLine();
            if("exit".equals(msg)){
                System.out.println("成功下线");
                socket.close();
                break;
            }

            byte[] bytes = msg.getBytes();
            DatagramPacket packet = new DatagramPacket(bytes,
                    bytes.length,
                    InetAddress.getLocalHost(),
                    6666);

            socket.send(packet);
        }
    }
}
