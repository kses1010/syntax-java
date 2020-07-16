package syntax.chapter16.page957;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;

public class NetWorkEx4 {
    public static void main(String[] args) {
        URL url = null;
        BufferedReader br = null;
        String address = "https://www.naver.com";
        String line = "";

        try {
            url = new URL(address);
            br = new BufferedReader(new InputStreamReader(url.openStream()));
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
