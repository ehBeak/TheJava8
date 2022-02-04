package ch27.network;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

import static java.io.File.separator;

public class NioSample {
    public static void main(String[] args) {
        NioSample nioSample = new NioSample();
        nioSample.basicWriteAndRead();
    }

    public void basicWriteAndRead() {
        String fileName = "D:" + separator + "spring" + separator + "thejava8" +
                separator + "godOfJava" + separator + "text" + separator + "nio.txt";
        try {
            writeFile(fileName, "My first NIO sample.");
            readFile(fileName);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 1. FileOuputStream에서 채널 얻기
    // 2. 문자열을 byte 배열로 만들고 ByteBuffer에 담기
    // 3. 채널의 write()로 버퍼의 내용 쓰기
    public void writeFile(String fileName, String data) throws Exception {
        // FileOutputStream에서 Channel객체 받기
        FileChannel channel = new FileOutputStream(fileName).getChannel();
        byte[] byteData = data.getBytes();
        // 저장할 문자의 바이트 문자열을 넘겨준다. ByteBuffer의 wrap함수 호출해서 버퍼에 저장
        ByteBuffer buffer = ByteBuffer.wrap(byteData);
        // 채널 객체에 버퍼를 넘겨주면 쓴다.
        channel.write(buffer);
        channel.close();
    }


    public void readFile(String fileName) throws Exception {
        // FileInputStream에서 Channel객체 받기
        FileChannel channel = new FileInputStream(fileName).getChannel();
        // 버퍼 할당
        ByteBuffer buffer = ByteBuffer.allocate(1024);
        // 채널의 내용을 읽고 버퍼에 저장
        channel.read(buffer);
        // 버퍼에 담겨 있는 데이터의 가장 앞으로 이동
        buffer.flip();
        // 차례로 한바이트씩 호출
        while (buffer.hasRemaining()) {
            System.out.println((char) buffer.get());
        }
        channel.close();
    }
}
