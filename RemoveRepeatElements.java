import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class RemoveRepeatElements {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();

        int[] array = new int[size];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            array[i] = scanner.nextInt();
        }

        int[] result = removeDuplicates(array);

        System.out.println("Original array: " + Arrays.toString(array));
        System.out.println("Array with repeated elements removed: " + Arrays.toString(result));
    }

    public static int[] removeDuplicates(int[] array) {
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < array.length; i++) {
            if (!list.contains(array[i])) {
                list.add(array[i]);
            }
        }

        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }

        return result;
    }
}
