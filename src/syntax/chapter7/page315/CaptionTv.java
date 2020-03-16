package syntax.chapter7.page315;

public class CaptionTv extends Tv{
    private boolean caption;

    public void displayCation(String text) {
        if (caption) {
            System.out.println(text);
        }
    }

    public void setCaption(boolean caption) {
        this.caption = caption;
    }
}
