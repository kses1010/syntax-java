package syntax.chapter12.page718;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface DateTime {
    String yymmdd();
    String hhmmss();
}
