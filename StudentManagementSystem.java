import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagementSystem {

    static Scanner scanner = new Scanner(System.in);
    static ArrayList<Student> students = new ArrayList<>();

    public static void main(String[] args) {

        while (true) {

            System.out.println("\n===== STUDENT MANAGEMENT SYSTEM =====");
            System.out.println("1. Add Student");
            System.out.println("2. View All Students");
            System.out.println("3. Search Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    addStudent();
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent();
                    break;

                case 4:
                    deleteStudent();
                    break;

                case 5:
                    System.out.println("Thank you!");
                    scanner.close();
                    return;

                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

    static void addStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        scanner.nextLine();

        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Age: ");
        int age = scanner.nextInt();

        System.out.print("Enter Mark 1: ");
        double mark1 = scanner.nextDouble();

        System.out.print("Enter Mark 2: ");
        double mark2 = scanner.nextDouble();

        System.out.print("Enter Mark 3: ");
        double mark3 = scanner.nextDouble();

        Student student =
                new Student(id, name, age, mark1, mark2, mark3);

        students.add(student);

        System.out.println("Student added successfully!");
    }

    static void viewStudents() {

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student student : students) {
            student.displayStudent();
        }
    }

    static void searchStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {
                student.displayStudent();
                return;
            }
        }

        System.out.println("Student not found.");
    }

    static void deleteStudent() {

        System.out.print("Enter Student ID: ");
        int id = scanner.nextInt();

        for (Student student : students) {

            if (student.getId() == id) {

                students.remove(student);

                System.out.println("Student deleted successfully!");
                return;
            }
        }

        System.out.println("Student not found.");
    }
}