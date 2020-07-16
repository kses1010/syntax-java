package syntax.chapter16.page953;

import java.net.MalformedURLException;
import java.net.URL;

public class NetWorkEx2 {
    public static void main(String[] args) throws MalformedURLException {
        URL url = new URL("httP;//www.codechobo.com:80/sample/hello.html?referer=codechobo#index1");
        System.out.println("url.getAuthority() : " + url.getAuthority());
    }
}
