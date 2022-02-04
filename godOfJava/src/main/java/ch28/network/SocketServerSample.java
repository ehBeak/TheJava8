package ch28.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;

public class SocketServerSample {
    public static void main(String[] args) {
        SocketServerSample socketServerSample = new SocketServerSample();
        socketServerSample.startServer();
    }

    public void startServer() {
        ServerSocket server = null;
        Socket client = null;

        try {
            server = new ServerSocket(9999); // 포트 번호 9999인 소켓객체 생성
            while (true) {
                System.out.println("Server:Waiting for request.");
                client = server.accept(); // 서버소켓에서 요청 대기 (Socket객체 리턴)
                System.out.println("Server:Accepted.");

                InputStream stream = client.getInputStream(); // 데이터를 받기위해 client쪽과 연결된 소켓에 stream 열었다.
                BufferedReader in = new BufferedReader(new InputStreamReader(stream));// 문자열로 받기위함

                String data = null;
                StringBuilder receivedData = new StringBuilder();
                while ((data = in.readLine()) != null) {
                    receivedData.append(data);
                }
                System.out.println("Received data:" + receivedData);

                in.close();
                stream.close();
                client.close();
                if (receivedData != null && "EXIT".equals(receivedData.toString())) {
                    System.out.println("Stop SocketServer");
                    break;
                }
                System.out.println("-----------");
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (server != null) {
                try {
                    server.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
