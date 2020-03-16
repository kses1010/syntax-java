package syntax.chapter7.page388;

public class HTMLParser implements Parseable {

    @Override
    public void parse(String fileName) {
        System.out.println(fileName + "- HTML parsing completed.");
    }
}
