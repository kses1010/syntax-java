package syntax.chapter14.page826;

public class Student implements Comparable<Student> {
    String name;
    int classRoom;
    int totalScore;

    public Student(String name, int classRoom, int totalScore) {
        this.name = name;
        this.classRoom = classRoom;
        this.totalScore = totalScore;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", classRoom=" + classRoom +
                ", totalScore=" + totalScore +
                '}';
    }

    public String getName() {
        return name;
    }

    public int getClassRoom() {
        return classRoom;
    }

    public int getTotalScore() {
        return totalScore;
    }

    @Override
    public int compareTo(Student s) {
        return s.totalScore - this.totalScore;
    }
}
