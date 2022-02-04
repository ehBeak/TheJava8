package ch28.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.util.Date;

public class SocketClientSample {
    public static void main(String[] args) {
        SocketClientSample socketClientSample = new SocketClientSample();
        socketClientSample.sendSocketSample();
    }

    public void sendSocketSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendSocketData("?" + new Date());
        }
        sendSocketData("EXIT");
    }

    public void sendSocketData(String data) {
        Socket socket = null;

        try {
            System.out.println("Client:Connecting");
            socket = new Socket("127.0.0.1", 9999); // 같은 장비의 해당 포트로 연결
            System.out.println("Client: Connect status=" + socket.isConnected());
            Thread.sleep(1000);

            OutputStream stream = socket.getOutputStream();// 소켓에서 데이터를 서버로 보낼 stream열기
            BufferedOutputStream out = new BufferedOutputStream(stream);//문자로

            byte[] bytes = data.getBytes();
            out.write(bytes); // 데이터 쓰기
            System.out.println("Client:Sent data");
            out.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (socket != null) {
                try {
                    socket.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
