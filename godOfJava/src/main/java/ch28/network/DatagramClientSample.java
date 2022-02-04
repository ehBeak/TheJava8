package ch28.network;

import java.io.BufferedOutputStream;
import java.io.OutputStream;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Date;

public class DatagramClientSample {
    public static void main(String[] args) {
        DatagramClientSample datagramClientSample = new DatagramClientSample();
        datagramClientSample.sendSocketSample();
    }

    public void sendSocketSample() {
        for (int loop = 0; loop < 3; loop++) {
            sendSocketData("?" + new Date());
        }
        sendSocketData("EXIT");
    }

    public void sendSocketData(String data) {
        try {
            DatagramSocket client = new DatagramSocket();
            InetAddress address = InetAddress.getByName("127.0.0.1");
            byte[] buffer = data.getBytes();
            // 서버의 주소와 port번호를 이렇게 지정하면 데이터를 받기 위한 객체가 아니라, 전송하기 위한 객체가 된다.
            DatagramPacket packet = new DatagramPacket(buffer, 0, buffer.length, address, 9999);
            System.out.println("Client:Connecting");

            client.send(packet);//전송
            System.out.println("Client:Sent data");
            client.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
