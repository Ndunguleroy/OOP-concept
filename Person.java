// Person class - base class for the system
// demonstrates encapsulation using private variables

public class Person {

    // private fields (data hiding)
    private String name;
    private int age;
    private String gender;

    // constructor
    public Person(String name, int age, String gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getters and setters
    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age > 0){
            this.age = age;
        } else {
            System.out.println("Age must be positive");
        }
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender){
        this.gender = gender;
    }

    // method to display basic info
    public void displayInfo(){
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Gender: " + gender);
    }
}