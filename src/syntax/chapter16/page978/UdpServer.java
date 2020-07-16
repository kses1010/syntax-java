package syntax.chapter16.page978;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UdpServer {
    public void start() throws IOException {
        // 7777 포트 소켓 생성
        DatagramSocket socket = new DatagramSocket(7777);
        DatagramPacket inPacket;
        DatagramPacket outPacket;

        byte[] inMsg = new byte[10];
        byte[] outMsg;

        while (true) {
            // 데이터를 수신하기 위핸 패킷생성.
            inPacket = new DatagramPacket(inMsg, inMsg.length);

            // 패킷을 통해 데이터를 수신.
            socket.receive(inPacket);

            // 수신한 패킷으로부터 client의 IP주소와 Port를 얻는다.
            InetAddress address = inPacket.getAddress();
            int port = inPacket.getPort();

            // 서버의 현재 시간을 시분초 형태 ([hh:mm:ss]) 로 반환.
            SimpleDateFormat sdf = new SimpleDateFormat("[hh:mm:ss]");
            String time = sdf.format(new Date());
            outMsg = time.getBytes();

            // 패킷을 생성. client에게 전송(send) 한다.
            outPacket = new DatagramPacket(outMsg, outMsg.length, address, port);
            socket.send(outPacket);
        }
    }

    public static void main(String[] args) {
        try {
            new UdpServer().start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
