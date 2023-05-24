import java.util.Arrays;
import java.util.Scanner;

public class ConsoleStore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = new String[10];

        System.out.println("Enter 10 strings:");
        for (int i = 0; i < 10; i++) {
            strings[i] = scanner.nextLine();
        }

        // Sort the strings in ascending order
        Arrays.sort(strings);

        System.out.println("Sorted strings:");
        for (String str : strings) {
            System.out.println(str);
        }

        // Combine two strings
        System.out.print("Enter the first string: ");
        String firstString = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String secondString = scanner.nextLine();

        String combinedString = firstString.concat(secondString);
        System.out.println("Combined string: " + combinedString);

        // Reverse the first string and display it
        StringBuilder reversedString = new StringBuilder(firstString).reverse();
        System.out.println("Reversed first string: " + reversedString);
    }
}
