package syntax.chapter15.page906;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class InputStreamReaderEx {
    public static void main(String[] args) {
        String line = "";
        try {
            InputStreamReader isr = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(isr);

            System.out.println("사용중인 OS의 인코딩 : " + isr.getEncoding());

            do {
                System.out.println("문장을 입력하세요. 마치려면 q를 입력하세요.>");
                line = br.readLine();
                System.out.println("입력한 문장: " + line);
            } while (!line.equalsIgnoreCase("q"));

            br.close();
            System.out.println("프로그램 종료");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
