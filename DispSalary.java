import java.util.Scanner;

class Person3 {
    protected String name;

    public void acceptData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter person's name: ");
        name = scanner.nextLine();
    }
}

class Employee1 extends Person3 {
    private double salary;

    public void acceptData() {
        super.acceptData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter employee's salary: ");
        salary = scanner.nextDouble();
    }

    public boolean isSalaryGreaterThan5000() {
        return salary > 5000;
    }

    public String getName() {
        return name;
    }
}

public class DispSalary {
    public static void main(String[] args) {
        Employee1[] employees = new Employee1[5];

        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            employees[i] = new Employee1();
            employees[i].acceptData();
        }

        System.out.println("\nEmployees with salary greater than 5000:");

        boolean found = false;
        for (Employee1 employee : employees) {
            if (employee.isSalaryGreaterThan5000()) {
                System.out.println(employee.getName());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No employees found with salary greater than 5000.");
        }
    }
}
