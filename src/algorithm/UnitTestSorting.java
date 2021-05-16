package algorithm;

import org.testng.Assert;

public class UnitTestSorting {

    /*
       This class is about Unit testing for Sorting Algorithm.
      */
    public static void main(String[] args) {
        int[] unSortedArray = {6, 9, 2, 5, 1, 0, 4};
        int[] sortedArray = {0, 1, 2, 4, 5, 6, 9};
        //Create Sort object
        Sort sort = new Sort();
        //apply unsorted array to selectionSort.
        sort.selectionSort(unSortedArray);
        //verify if the unsorted array is sorted by the selection sort algorithm.
        try {
            Assert.assertEquals(sortedArray, unSortedArray, "Array is not Sorted");
        } catch (Exception ex) {
            ex.getMessage();
        }

        //Now implement Unit test for rest of the soring algorithm...................below

        //InsertionSort
        sort.insertionSort(unSortedArray);
        System.out.println("After Insertion Sort");
        for (int i : unSortedArray) {
            System.out.print(i + " ");
        }
        System.out.println();

//BubbleSort
        sort.bubbleSort(unSortedArray);
        System.out.println("After BubbleSort");
        for (int j : unSortedArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        //MergeSort
        sort.MergeSort(unSortedArray);
        System.out.println("After MergeSort");
        for (int x : unSortedArray) {
            System.out.print(x + " ");
        }
        System.out.println();

//HeapSort
        sort.heapSort(unSortedArray);
        System.out.println("After Heapsort");
        for (int y : unSortedArray) {
            System.out.print(y + " ");
        }
        System.out.println();

//BucketSort
        sort.bucketSort(unSortedArray);
        System.out.println("After BucketSort");
        for (int h : unSortedArray) {
            System.out.print(h + " ");
        }
        System.out.println();

//ShellSort
        sort.shellSort(unSortedArray);
        System.out.println("After ShellSort");
        for (int h : unSortedArray) {
            System.out.print(h + " ");
        }


    }
}