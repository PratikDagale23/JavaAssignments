import java.util.Arrays;
import java.util.Scanner;

public class LongestConsecutiveSequence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of elements in the array: ");
        int n = scanner.nextInt();
        int[] nums = new int[n];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            nums[i] = scanner.nextInt();
        }

        int longestSequenceLength = findLongestConsecutiveSequence(nums);
        System.out.println("Length of the longest consecutive sequence: " + longestSequenceLength);
    }

    public static int findLongestConsecutiveSequence(int[] nums) {
        if (nums == null || nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        int longestSequenceLength = 1;
        int currentSequenceLength = 1;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                if (nums[i] == nums[i - 1] + 1) {
                    currentSequenceLength++;
                } else {
                    longestSequenceLength = Math.max(longestSequenceLength, currentSequenceLength);
                    currentSequenceLength = 1;
                }
            }
        }

        return Math.max(longestSequenceLength, currentSequenceLength);
    }
}
