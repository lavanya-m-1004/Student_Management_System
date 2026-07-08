import java.util.ArrayList;
import java.util.Scanner;

class Student {
    int id;
    String name;
    int age;
    String course;

    Student(int id, String name, int age, String course) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.course = course;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("------------------");
    }
}

public class StudMangSys {

    static ArrayList<Student> list = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int choice;

        do {
            System.out.println("\n--- Student Management System ---");
            System.out.println("1. Add Student");
            System.out.println("2. View Student");
            System.out.println("3. Update Student");
            System.out.println("4. Delete Student");
            System.out.println("5. List All Students");
            System.out.println("6. Exit");
            System.out.print("Enter choice: ");

            choice = sc.nextInt();

            switch(choice) {
                case 1:
                    addStudent();
                    break;
                case 2:
                    viewStudent();
                    break;
                case 3:
                    updateStudent();
                    break;
                case 4:
                    deleteStudent();
                    break;
                case 5:
                    listStudents();
                    break;
                case 6:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice");
            }

        } while(choice != 6);
    }

    static void addStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        System.out.print("Enter Name: ");
        String name = sc.next();

        System.out.print("Enter Age: ");
        int age = sc.nextInt();

        System.out.print("Enter Course: ");
        String course = sc.next();

        list.add(new Student(id, name, age, course));

        System.out.println("Student Added Successfully");
    }

    static void viewStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Student s : list) {
            if(s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    static void updateStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Student s : list) {
            if(s.id == id) {

                System.out.print("New Name: ");
                s.name = sc.next();

                System.out.print("New Age: ");
                s.age = sc.nextInt();

                System.out.print("New Course: ");
                s.course = sc.next();

                System.out.println("Updated Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    static void deleteStudent() {

        System.out.print("Enter ID: ");
        int id = sc.nextInt();

        for(Student s : list) {
            if(s.id == id) {
                list.remove(s);
                System.out.println("Deleted Successfully");
                return;
            }
        }

        System.out.println("Student Not Found");
    }

    static void listStudents() {

        if(list.isEmpty()) {
            System.out.println("No Students Available");
        }
        else {
            for(Student s : list) {
                s.display();
            }
        }
    }
}
