package Arrays;

import java.util.Arrays;

public class CountDuplicatesInArray {
    public static void main(String[] args) {
        int[] values = { 7, 2, 6, 1, 4, 7, 4, 5, 4, 7, 7, 3, 1 };
        duplicate(values);
    }

    public static void duplicate(int numbers[]) {
        Arrays.sort(numbers);
        int previous = numbers[0] - 1;

        int dupCount = 0;

        for (int i = 0; i < numbers.length; ++i) {
            if (numbers[i] == previous) {
                ++dupCount;
            } else {
                previous = numbers[i];
            }
        }
        System.out.println("There were " + dupCount + " duplicates in the array.");
    }
}
