package syntax.chapter10.page549;

import java.text.MessageFormat;

public class MessageFormatEx1 {
    public static void main(String[] args) {
        String msg = "Name: {0} \nTel: {1} \nAge: {2} \nBirthday: {3}";

        Object[] arguments = {
                "Sunny", "010-1234-5678", "29", "04-25"
        };

        String result = MessageFormat.format(msg, arguments);
        System.out.println(result);
    }
}
