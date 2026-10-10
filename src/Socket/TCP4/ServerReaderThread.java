package Socket.TCP4;

import java.io.*;
import java.net.Socket;

public class ServerReaderThread extends Thread {
    private Socket socket;

    public ServerReaderThread(Socket socket) {
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
                    seedmsgtoAll(s);
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

    private void seedmsgtoAll(String s) throws IOException {
        for (Socket socket : Server.onlineClients) {
            OutputStream os = socket.getOutputStream();
            DataOutputStream dos = new DataOutputStream(os);
            dos.writeUTF(s);
            dos.flush();
        }
    }
}
