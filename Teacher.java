// Teacher class extending Person

public class Teacher extends Person {

    private String subject;
    private double salary;

    // constructor
    public Teacher(String name, int age, String gender, String subject, double salary){
        super(name, age, gender);
        this.subject = subject;
        this.salary = salary;
    }

    // getters and setters
    public String getSubject(){
        return subject;
    }

    public void setSubject(String subject){
        this.subject = subject;
    }

    public double getSalary(){
        return salary;
    }

    public void setSalary(double salary){
        this.salary = salary;
    }

    // teacher action
    public void teach(){
        System.out.println(getName() + " is teaching " + subject);
    }

    // method overriding
    public void displayInfo(){
        super.displayInfo();
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}