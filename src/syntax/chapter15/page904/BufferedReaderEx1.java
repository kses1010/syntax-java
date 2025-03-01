package syntax.chapter15.page904;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class BufferedReaderEx1 {
    public static void main(String[] args) {
        FileReader fr = null;
        try {
            fr = new FileReader("BufferedReaderEx1.java");
            BufferedReader br = new BufferedReader(fr);
            String line = "";

            for (int i = 1; (line = br.readLine()) != null; i++) {
                if(line.contains(";")) {
                    System.out.println(i + ":" + line);
                }
            }
            br.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
