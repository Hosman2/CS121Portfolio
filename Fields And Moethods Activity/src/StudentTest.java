public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student("Cameron Hosler", "230942", 11, "English", "Math");
        System.out.println(student1.getName());
        student1.setName("Trevor Tompkins");
        System.out.println(student1.getName());

        System.out.println(student1.getId());
        student1.setId(("12412"));
        System.out.println(student1.getId());

        System.out.println(student1.getGrade());
        student1.setGrade(12);
        System.out.println(student1.getId());

        System.out.println(student1.getFclass());
        student1.setFclass("Science");
        System.out.println(student1.getFclass());

        System.out.println(student1.getLclass());
        student1.setLclass("English");
        System.out.println(student1.getLclass());


    }

}
