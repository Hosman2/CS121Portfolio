import java.util.ArrayList;
import java.util.LinkedList;

public class Student {
    private String firstName;
    private String lastName;
    private String id;
    private String major;
    private String classStanding;
    private String gpa;

    private LinkedList<String> courseLinkedList = new LinkedList<>();

    public Student(String firstName, String lastName, String id, String major, String classStanding, String gpa){
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
        this.major = major;
        this.classStanding = classStanding;
        this.gpa = gpa;
    }


    public StringBuilder getCourseStringB(){
        StringBuilder sb  = new StringBuilder();
        for (String course: courseLinkedList){
            sb.append(course + "\n");
        }
        return sb;
    }
    public void addCourse(String courseName){
        this.courseLinkedList.add(courseName);

    }

    public void removeCourse(String courseName){
        this.courseLinkedList.remove(courseName);
    }


    public void sortCourseList(){
        String temp;
        for(int i = 1; i < courseLinkedList.size(); i++){
            for (int j = i; j > 0; j--){
                if(courseLinkedList.get(j).compareTo(courseLinkedList.get(j - 1)) < 0){
                    temp = courseLinkedList.get(j);
                    courseLinkedList.set(j, courseLinkedList.get(j - 1));
                    courseLinkedList.set(j - 1, temp);
                }
            }

        }
    }
    @Override
    public String toString(){
        return String.format("Name: %s %s\nID: %s\nMajor: %s\nClass Standing: %s\nGPA: %s",firstName, lastName, id, major, classStanding, gpa);
    }
}
