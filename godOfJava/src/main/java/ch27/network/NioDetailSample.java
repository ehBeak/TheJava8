package ch27.network;

import java.nio.IntBuffer;

public class NioDetailSample {
    public static void main(String[] args) {
        NioDetailSample nioDetailSample = new NioDetailSample();
        nioDetailSample.checkBuffer();
    }

    public void checkBuffer() {
        try {
            IntBuffer buffer = IntBuffer.allocate(1024);
            for (int loop = 0; loop < 100; loop++) {
                buffer.put(loop);
            }

            System.out.println(buffer.capacity()); // 1024
            System.out.println(buffer.limit()); // 1024
            System.out.println(buffer.position()); // 100

            buffer.flip();

            System.out.println("buffer flipped !!");
            System.out.println(buffer.limit()); // 100
            System.out.println(buffer.position()); // 0

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
