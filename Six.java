import java.util.Scanner;

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}

class Adder extends Arithmetic {
    // No need to define any additional methods in this class
}

public class Six {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Adder adder = new Adder();

        // Print the superclass name
        System.out.println("My superclass is: " + adder.getClass().getSuperclass().getName());

        // Read two integers from the user
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // Perform addition and print the result
        int sum = adder.add(num1, num2);
        System.out.println("Sum: " + sum);

        scanner.close();
    }
}

