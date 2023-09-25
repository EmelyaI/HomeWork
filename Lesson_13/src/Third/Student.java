package Third;

public class Student {
    private String name;
    private String group;
    private int course;
    private int mathMark;
    private int englishMark;
    private int physicMark;

    public Student(String name, String group, int course, int mathMark, int englishMark, int physicMark) {
        this.name = name;
        this.group = group;
        this.course = course;
        this.mathMark = mathMark;
        this.englishMark = englishMark;
        this.physicMark = physicMark;
    }

    public String getName() {
        return name;
    }

    public String getGroup() {
        return group;
    }

    public int getCourse() {
        return course;
    }

    public int getMathMark() {
        return mathMark;
    }

    public int getEnglishMark() {
        return englishMark;
    }

    public int getPhysicMark() {
        return physicMark;
    }

    public int getAvgGrade() {
        return (mathMark + englishMark + physicMark) / 3;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", group='" + group + '\'' +
                ", course=" + course +
                ", mathMark=" + mathMark +
                ", englishMark=" + englishMark +
                ", physicMark=" + physicMark +
                '}';
    }
}