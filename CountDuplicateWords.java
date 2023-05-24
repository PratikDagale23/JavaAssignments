import java.util.Scanner;

public class CountDuplicateWords {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        String[] words = inputString.toLowerCase().split("\\s+");
        int count = 0;

        for (int i = 0; i < words.length; i++) {
            boolean isDuplicate = false;

            for (int j = i + 1; j < words.length; j++) {
                if (words[i].equals(words[j])) {
                    isDuplicate = true;
                    break;
                }
            }

            if (isDuplicate) {
                count++;
                // Set the duplicate word to an empty string to avoid counting it again
                words[i] = "";
            }
        }

        System.out.println("Number of Duplicate Words: " + count);
    }
}
