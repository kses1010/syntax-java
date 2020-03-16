package syntax.chapter7.page315;

public class CaptionTvTest {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.setChannel(10);
        ctv.channelUp();
        System.out.println(ctv.getChannel());
        ctv.displayCation("Hello, world");
        ctv.setCaption(true);
        ctv.displayCation("Hello, world");
    }
}
