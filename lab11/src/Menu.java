import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    StudentRecord StudentRecord = new StudentRecord();

    public void displayMenu(){
        boolean keepGoing = true;
        while(keepGoing) {
            System.out.println("********* MENU *********\nPlease make a selection\n1) Add a Student\n2) Remove a Student\n3) Display Student Info\n4) Display All Student Info\n5) Exit");
            String userInput;
            userInput = scanner.nextLine();
            if (userInput.equals("1")) {
                createStudent();
            }else if(userInput.equals("2")) {
                deleteStudent();
            }else if(userInput.equals("3")){
                displayStudent();
            }else if (userInput.equals("4")){
                displayAllStudent();
            }else if (userInput.equals("5")){
                System.out.println("Exiting........");
                break;
            }else{
                System.out.println("Invalid Entry");
            }


        }}



    private void createStudent(){
        boolean keepGoing = true;
        Student student;
        Course course;

        System.out.println("Enter the name of the Student: ");
        String name = scanner.nextLine();
        System.out.println("Enter the credits the Student has: ");
        int credits = Integer.parseInt(scanner.nextLine());
        student  = new Student(name,credits);
        StudentRecord.addStudent(student);
        while(keepGoing) {
            System.out.println("Enter a Course name or press q if finished: ");
            String courseName = scanner.nextLine();
            if (courseName.equals( "q")){
                break;
            }else {
                System.out.println("Enter the course credits: ");
                int courseCredit = Integer.parseInt(scanner.nextLine());
                course = new Course(courseName,courseCredit);
                student.addCourse(course);
            }
            StudentRecord.addStudent(student);
            System.out.printf("%s has been added\n", name);

        }


    }
    private void deleteStudent() {
        String name;

        System.out.println("Name of Student you want to delete: ");
        name = scanner.nextLine();
        Student student = StudentRecord.getStudent(name);
        if (student == null) {
            System.out.println("Student is not found");
        } else {
            StudentRecord.removeStudent(student);
            System.out.printf("%s has been removed\n", name);

        }
    }
    private void displayStudent(){

        String name;
        Student student;
        System.out.println("Enter the name to see info: ");
        name = scanner.nextLine();
        student = StudentRecord.getStudent(name);
        if (student == null){
            System.out.println("Student not found");
        }else{
            //System.out.println(student.toString());
            System.out.println(student);
            System.out.println();
        }
    }
    private void displayAllStudent(){
        ArrayList<Student> studentArrayList = StudentRecord.getStudentArrayList();
        for (int i = 0; i < studentArrayList.size(); i++){
            System.out.printf("%d. %s\n", i + 1, studentArrayList.get(i));
        }
    }


}
