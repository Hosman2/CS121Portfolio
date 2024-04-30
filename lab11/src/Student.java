import java.util.ArrayList;
public class Student {
    private String name;
    private int credits;
    private ArrayList<Course> courseArrayList = new ArrayList<>();

    public Student(String name, int credits){
        this.name = name;
        this.credits = credits;
    }
    public String getName(){
        return name;
    }
    public ArrayList<Course> getcourseArrayList(){
        return this.courseArrayList;
    }
    public StringBuilder getCourseStringB(){
        StringBuilder sb  = new StringBuilder();
        for (Course course: courseArrayList){
            sb.append(course.toString());
        }
        return sb;
    }
    public void addCourse(Course course){
        this.courseArrayList.add(course);
    }

    public void removeCourse(Course course){
        this.courseArrayList.remove(course);
    }
    public Course getCourse(String courseName){
        Course foundCourse = null;
//enhanced for loop
        for(Course course: courseArrayList){
            if(course.getCourseName().equals(courseName)){
                foundCourse = course;
                break;
            }
        }
        return foundCourse;
    }
    @Override
    public String toString(){
        return String.format("Name: %s\nCredits: %d\n",name,credits);
    }
}
