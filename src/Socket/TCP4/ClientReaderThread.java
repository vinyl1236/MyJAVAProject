package Socket.TCP4;

import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;

public class ClientReaderThread extends Thread {
    private Socket socket;

    public ClientReaderThread(Socket socket) {
        this.socket = socket;
    }
    @Override
    public void run() {
        try {
            InputStream is = socket.getInputStream();
            DataInputStream dis = new DataInputStream(is);
            while(true){
                try{
                    String s = dis.readUTF();
                    System.out.println(s);
                }catch(IOException e){
                    System.out.println(socket.getRemoteSocketAddress()+"下线");
                    Server.onlineClients.remove(socket);
                    dis.close();
                    socket.close();
                    break;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
