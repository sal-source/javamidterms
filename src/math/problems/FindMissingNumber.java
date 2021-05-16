package math.problems;

import java.util.Arrays;

public class FindMissingNumber {

    public static void main(String[] args) {


        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int[] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missing = finder(array);
        System.out.println(missing);
    }

    public static int finder(int[] a) {
        int[] arr = a;
        int miss = 10;
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= arr.length - 1; i++) {
            if (arr[i] != i + 1) {
                miss = i + 1;
                break;

            }

        }
        return miss;

    }
}