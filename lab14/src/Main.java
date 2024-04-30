public class Main {
    public static void main(String[] args) {
        Student student = new Student("Cameron", "Hosler", "1234", "Computer Science", "Freshman", "3.56");
            student.addCourse("CS120");
            student.addCourse("ENG 103");
            student.addCourse("HIST 150");
        System.out.println(student);
        System.out.println("Unsorted:");
        System.out.println(student.getCourseStringB());
        System.out.println("Sorted:");
        System.out.println(student.getCourseStringB());
        student.removeCourse("HIST 150");
        System.out.println("Removed:");
        System.out.println(student.getCourseStringB());

    }
}
