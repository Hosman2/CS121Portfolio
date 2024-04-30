import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<Student> studentArrayList = new ArrayList<>();

    public void addStudent(Student student){
        this.studentArrayList.add(student);
    }
    public void removeStudent(Student student){
       studentArrayList.remove(student);
    }
    public ArrayList<Student> getStudentArrayList(){
        return this.studentArrayList;
    }
    public Student getStudent(String studentName){
        Student foundStudent = null;
        for(Student student : studentArrayList){
            if(student.getName().equals(studentName)){
                foundStudent = student;
                break;
            }
        }
        return foundStudent;
    }

    public StringBuilder getAllStudents() {
        StringBuilder studentStringBuilder = new StringBuilder();

        for (Student student : studentArrayList) {
            studentStringBuilder.append(student.toString()).append("\n");
        }
        return studentStringBuilder;
    }
}
