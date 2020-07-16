package syntax.chapter15.page884;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamEx1 {
    public static void main(String[] args) {
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream("123.txt");
            // 버퍼크기를 5로 함.
            BufferedOutputStream bos = new BufferedOutputStream(fos, 5);
            // 파일 123.txt의 1부터 9까지 출력한다.
            for (int i = '1'; i <= '9'; i++) {
                bos.write(i);
            }
            bos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
