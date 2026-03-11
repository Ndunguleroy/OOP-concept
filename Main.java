
import java.util.Scanner;

public class Main {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Simple School System");
        System.out.println("--------------------");

        // 5 student objects
        Student[] students = new Student[5];
        students[0] = new Student("Brian", 21, "Male", "Computer Science", 1001);
        students[1] = new Student("Lucy", 22, "Female", "Information Technology", 1002);
        students[2] = new Student("Cathy", 20, "Female", "Software Engineering", 1003);
        students[3] = new Student("David", 23, "Male", "Networking", 1004);
        students[4] = new Student("Ella", 21, "Female", "AI & ML", 1005);

        //  5 teacher objects
        Teacher[] teachers = new Teacher[5];
        teachers[0] = new Teacher("Mr. James", 40, "Male", "Programming", 70000);
        teachers[1] = new Teacher("Ms. Linda", 35, "Female", "Database", 65000);
        teachers[2] = new Teacher("Mr. Peter", 50, "Male", "Networking", 75000);
        teachers[3] = new Teacher("Ms. Susan", 38, "Female", "AI & ML", 72000);
        teachers[4] = new Teacher("Mr. Robert", 45, "Male", "Software Engineering", 73000);

        // ask user display
        System.out.println("\nEnter student number to display (1-5): ");
        int studentChoice = sc.nextInt();

        if(studentChoice >= 1 && studentChoice <= 5){
            System.out.println("\nStudent Details:");
            students[studentChoice - 1].displayInfo();
            students[studentChoice - 1].study();
        } else {
            System.out.println("Invalid student choice");
        }

        // teacher to display
        System.out.println("\nEnter teacher number to display (1-5): ");
        int teacherChoice = sc.nextInt();

        if(teacherChoice >= 1 && teacherChoice <= 5){
            System.out.println("\nTeacher Details:");
            teachers[teacherChoice - 1].displayInfo();
            teachers[teacherChoice - 1].teach();
        } else {
            System.out.println("Invalid teacher choice");
        }

        // polymorphism demonstration
        System.out.println("\nPolymorphism Example:");
        Person p;

        p = students[studentChoice - 1];
        p.displayInfo();

        System.out.println();

        p = teachers[teacherChoice - 1];
        p.displayInfo();

        System.out.println("\nEnd of program.");
        sc.close();
    }
}