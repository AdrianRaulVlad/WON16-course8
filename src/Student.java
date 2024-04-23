public class Student {
    private static float sumOfGrades;
    private static int numberOfStudents;

    private String name;
    private float grade;

    Student(String name, float grade) {

    }

    public String getName() {
        return this.name;
    }

    public float getGrade() {
        return this.grade;
    }

    public static float getAverage() {
        return sumOfGrades / numberOfStudents;
    }

    public static void main(String[] args) {
        Student s1 = new Student("Gigi", 10);
        Student s2 = new Student("Teo", 8);
    }
}
