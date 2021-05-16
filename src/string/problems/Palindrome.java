package string.problems;

import java.util.Arrays;
import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        /*
          If a String is reversed and it remains unchanged, that is called Palindrome. For example, MOM,DAD,MADAM are
          Palindrome. So write java code to check if a given String is Palindrome or not.
         */
        Scanner enter = new Scanner(System.in);
        System.out.println("Enter a string");
        String s = enter.nextLine();
        enter.close();
        char[] arr = s.toCharArray();
        char[] arr1 = new char[arr.length];
        for (int i = arr.length - 1; i >= 0; i--) {
            arr1[arr.length - 1 - i] = arr[i];
        }
        if (Arrays.equals(arr, arr1)) {
            System.out.println(s + " is plaindrom");
        } else {
            System.out.println(s + " is not plaindrom");
        }

    }
}
