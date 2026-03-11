
// inherits properties from Person class

public class Student extends Person {

    private String course;
    private int studentID;

    // constructor
    public Student(String name, int age, String gender, String course, int studentID){
        super(name, age, gender); // parent constructor
        this.course = course;
        this.studentID = studentID;
    }

    // getters and setters
    public String getCourse(){
        return course;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public int getStudentID(){
        return studentID;
    }

    public void setStudentID(int studentID){
        this.studentID = studentID;
    }

    // simple student action
    public void study(){
        System.out.println(getName() + " is studying " + course);
    }

    // overriding 
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Course: " + course);
        System.out.println("Student ID: " + studentID);
    }
}