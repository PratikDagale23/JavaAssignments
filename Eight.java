import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Eight{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of entries in the phone book
        int entries = scanner.nextInt();
        scanner.nextLine();

        // Create a HashMap to store the phone book entries
        Map<String, String> phoneBook = new HashMap<>();

        // Read the phone book entries
        for (int i = 0; i < entries; i++) {
            String name = scanner.nextLine();
            String phoneNumber = scanner.nextLine();
            phoneBook.put(name, phoneNumber);
        }

        // Read the queries until end-of-file
        while (scanner.hasNextLine()) {
            String query = scanner.nextLine();
            if (phoneBook.containsKey(query)) {
                System.out.println(query + " " + phoneBook.get(query));
            } else {
                System.out.println("Not found");
            }
        }

        scanner.close();
    }
}
