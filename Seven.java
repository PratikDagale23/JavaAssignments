import java.util.Scanner;

class MyCalculator {
    public long power(int n, int p) throws Exception {
        if (n < 0 || p < 0) {
            throw new Exception("n or p should not be negative");
        } else if (n == 0 && p == 0) {
            throw new Exception("n and p should not be zero");
        } else {
            return (long) Math.pow(n, p);
        }
    }
}

public class Seven {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        System.out.print("Enter the value of p: ");
        int p = scanner.nextInt();

        MyCalculator calculator = new MyCalculator();

        try {
            long result = calculator.power(n, p);
            System.out.println("Result: " + result);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

        scanner.close();
    }
}
