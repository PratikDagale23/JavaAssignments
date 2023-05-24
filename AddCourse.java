import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class student {
    private String name;
    private String grade;
    private List<String> courses;

    public student(String name, String grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    public void addCourse(String course) {
        courses.add(course);
    }

    public void removeCourse(String course) {
        courses.remove(course);
    }

    public void displayCourses() {
        System.out.println("Courses for " + name + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }
}

public class AddCourse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter student name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student grade: ");
        String grade = scanner.nextLine();

        student student = new student(name, grade);

        while (true) {
            System.out.println("\n1. Add Course");
            System.out.println("2. Remove Course");
            System.out.println("3. Display Courses");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter course name to add: ");
                    String courseToAdd = scanner.nextLine();
                    student.addCourse(courseToAdd);
                    System.out.println("Course added successfully.");
                    break;
                case 2:
                    System.out.print("Enter course name to remove: ");
                    String courseToRemove = scanner.nextLine();
                    student.removeCourse(courseToRemove);
                    System.out.println("Course removed successfully.");
                    break;
                case 3:
                    student.displayCourses();
                    break;
                case 4:
                    System.out.println("Exiting program.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
