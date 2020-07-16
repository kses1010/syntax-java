package syntax.chapter14.page826;

import java.util.Comparator;
import java.util.stream.Stream;

public class StreamEx1 {
    public static void main(String[] args) {
        Stream<Student> studentStream = Stream.of(
                new Student("김", 3, 300),
                new Student("이", 1, 200),
                new Student("박", 2, 100),
                new Student("손", 2, 150),
                new Student("전", 1, 200),
                new Student("조", 1, 290),
                new Student("한", 3, 180)
        );

        studentStream.sorted(Comparator.comparing(Student::getClassRoom) // 반별 정렬
                .thenComparing(Comparator.naturalOrder()))               // 기본 정렬
                .forEach(System.out::println);
    }
}
