package syntax.chapter10.page546;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatEx3 {
    public static void main(String[] args) throws ParseException {
        DateFormat df = new SimpleDateFormat("yyyy년 MM월 dd일");
        DateFormat df2 = new SimpleDateFormat("yyyy/MM/dd");

        Date d = df.parse("2020년 07월 08일");
        System.out.println(df2.format(d));
    }
}
