package syntax.chapter15.page879;

import java.io.FileInputStream;
import java.io.IOException;

public class FileViewer {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream(args[0]);
        int data = 0;
        while ((data = fis.read()) != -1) {
            char c = (char) data;
            System.out.println(c);
        }
    }
}
