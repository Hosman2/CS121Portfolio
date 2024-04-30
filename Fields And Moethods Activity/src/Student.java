public class Student {
    private String name;
    private String id;
    private int grade;
    private String fclass;
    private String lclass;


    public Student(String name, String id, int grade, String fclass, String lclass){
        this.name = name;
        this.id = id;
        this.grade = grade;
        this.fclass = fclass;
        this.lclass = lclass;

    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public int getGrade(){
        return grade;
    }
    public void setGrade(int grade){
        this.grade = grade;
    }
    public String getFclass(){
        return fclass;
    }
    public void setFclass(String fclass){
        this.fclass = fclass;
    }
    public String getLclass(){
        return lclass;
    }
    public void setLclass(String lclass){
        this.lclass = lclass;
    }
}
