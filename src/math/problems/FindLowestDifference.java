package math.problems;

import java.util.Arrays;

public class FindLowestDifference {

    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        // i did these two methods i don't know exactly what you want as  output
        comparaisonOfLowestof2Arrays();
        lowestOf2Arrays();

    }

    public static void comparaisonOfLowestof2Arrays() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array1));
        System.out.println(Arrays.toString(array2));
        int diff1 = array1[array1.length - 1];
        int diff2 = array2[array2.length - 1];
        for (int i = 0; i < array1.length - 1; i++) {
            if (array1[i + 1] - array1[i] < diff1) {
                diff1 = array1[i + 1] - array1[i];
            }
        }
        System.out.println("the lowest difference  betwen cells of  first array is " + diff1);
        for (int j = 0; j < array2.length - 1; j++) {
            if (array2[j + 1] - array2[j] < diff2) {
                diff2 = array2[j + 1] - array2[j];
            }
        }
        System.out.println("the lowest difference betwen cells of second array is " + diff2);
        if (diff1 <= diff2) {

            System.out.println("the lowest difference betwen two arrays " + diff1);
        } else {
            System.out.println("the lowest difference betwen array1 and array2" + diff2);
        }
    }

    public static void lowestOf2Arrays() {
        int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
        int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};
        Arrays.sort(array1);
        Arrays.sort(array2);
        int diff = array2[array2.length - 1];
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] - array2[i] < diff) {
                diff = array1[i] - array2[i];
            }
        }
        System.out.println("the lowest difference between the two array cell " + diff);
    }
}