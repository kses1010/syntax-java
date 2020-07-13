package syntax.chapter12.page718;

import java.lang.annotation.Annotation;

@Deprecated
@SuppressWarnings("1111") // 유효하지 않은 애너테이션은 무시된다.
@TestInfo(testedBy = "aaa", testDate = @DateTime(yymmdd = "200720", hhmmss = "152730"))
public class AnnotationEx5 {
    public static void main(String[] args) {
        Class<AnnotationEx5> cls = AnnotationEx5.class;

        TestInfo anno = (TestInfo) cls.getAnnotation(TestInfo.class);
        System.out.println("anno.testedBy() = " + anno.testedBy());
        System.out.println("anno.testDate().yymmdd() = " + anno.testDate().yymmdd());
        System.out.println("anno.testDate().hhmmss() = " + anno.testDate().hhmmss());

        for (String str : anno.testTools()) {
            System.out.println("testTools = " + str);
        }
        System.out.println();

        // 적용된 모든 애너테이션을 가져온다.
        Annotation[] annoArr = cls.getAnnotations();

        for (Annotation a : annoArr) {
            System.out.println(a);
        }
    }
}
