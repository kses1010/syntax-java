package syntax.chapter16.page978;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UdpClient {
    public void start() throws IOException {
        DatagramSocket dgs = new DatagramSocket();
        InetAddress serverAddress = InetAddress.getByName("127.0.0.1");

        // 데이터가 저장될 공간으로 byte배열을 생성한다.
        byte[] msg = new byte[100];

        DatagramPacket outPacket = new DatagramPacket(msg, 1, serverAddress, 7777);
        DatagramPacket inPacket = new DatagramPacket(msg, msg.length);

        dgs.send(outPacket);    // packet 전송
        dgs.receive(inPacket);  // packet 수신

        System.out.println("current server time : " + new String(inPacket.getData()));

        dgs.close();
    }

    public static void main(String[] args) throws IOException {
        new UdpClient().start();
    }
}
