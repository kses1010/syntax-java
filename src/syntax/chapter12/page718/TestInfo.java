package syntax.chapter12.page718;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME) // 실행시에 사용가능하다록 지정.
public @interface TestInfo {
    int count() default 1;
    String testedBy();
    String[] testTools() default "JUNIT";
    TestType testType() default TestType.FIRST;
    DateTime testDate();
}
