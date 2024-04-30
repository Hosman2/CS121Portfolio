public class Course {
    private String courseName;
    private int courseCredits;


    public Course(String courseName, int courseCredits){
        this.courseName = courseName;
        this.courseCredits = courseCredits;

    }
    public String getCourseName(){
        return courseName;
    }

    @Override
    public String toString(){
        return String.format("Class name: %s\nClass credits: %d\n",
                courseName,courseCredits);
    }
}
