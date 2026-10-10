package Socket.TCP4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    public static ArrayList<Socket> onlineClients = new ArrayList<>();
    public static void main(String[] args) throws IOException {
        System.out.println("服务端启动成功~~~");
        ServerSocket serverSocket = new ServerSocket(8888);

        while (true) {
            Socket socket = serverSocket.accept();
            onlineClients.add(socket);
            System.out.println(socket.getRemoteSocketAddress()+"上线");
            new ServerReaderThread(socket).start();

        }
    }
}
