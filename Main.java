import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter the last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter the employee ID: ");
        String employeeId = scanner.nextLine();

        System.out.print("Enter the job title: ");
        String jobTitle = scanner.nextLine();

        Person person = new Person(firstName, lastName);
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());

        Employee employee = new Employee(firstName, lastName, employeeId, jobTitle);
        System.out.println("First Name: " + employee.getFirstName());
        System.out.println("Last Name: " + employee.getLastName());
        System.out.println("Employee ID: " + employee.getEmployeeId());
    }
}
