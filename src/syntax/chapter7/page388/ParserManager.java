package syntax.chapter7.page388;

public class ParserManager {

    public static Parseable getParser(String type) {
        if (type.equals("XML")) {
            return new XMLParser();
        }

        return new HTMLParser();
    }
}
