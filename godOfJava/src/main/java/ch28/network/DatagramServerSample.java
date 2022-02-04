package ch28.network;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.ServerSocket;
import java.net.Socket;

public class DatagramServerSample {
    public static void main(String[] args) {
        DatagramServerSample sample = new DatagramServerSample();
        sample.startServer();
    }

    public void startServer() {
        DatagramSocket server = null;

        try {
            server = new DatagramSocket(9999); // 포트 번호 9999인 소켓객체 생성
            int bufferLength = 256;
            byte[] buffer = new byte[bufferLength];
            DatagramPacket packet = new DatagramPacket(buffer, bufferLength); // 데이터 받을 패킷생성

            while (true) {
                System.out.println("Server:Waiting for request.");
                server.receive(packet);// 대기하다가 넘어오면 받기
                int dataLength = packet.getLength();// 패킷 크기 확인
                System.out.println("Server:Accepted.");

                String data = new String(packet.getData(), 0, dataLength);// byte배열 문자열로 변경
                if (data.equals("EXIT")) {
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
