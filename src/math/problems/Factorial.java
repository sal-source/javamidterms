package math.problems;

import java.util.Scanner;

public class Factorial {

    public static void main(String[] args) {
        // YOU CAN CHOSE ANY OF THESE METHODS

        // factorWithForloop();
        // factorWithWhileloop();
        factorWithDoWhileloop();

    }

    public static void factorWithForloop() {
        Scanner enter = new Scanner(System.in);
        int number, i;
        long fact = 1;
        System.out.println("Please enter the number that you want factorial");
        number = enter.nextInt();
        enter.close();
        if (number < 0) {
            System.out.println(" There is no factorial number fro negative number (SORRY)");
        } else {
            for (i = number; i >= 1; i--) {
                fact = fact * i;
            }
            System.out.printf("%d! = %d", number, fact);
        }

    }


    public static void factorWithWhileloop() {
        Scanner enter = new Scanner(System.in);
        int number;
        long fact = 1;
        System.out.println("Please enter the number that you want factorial");
        number = enter.nextInt();
        enter.close();
        if (number < 0) {
            System.out.println(" There is no factorial number fro negative number (SORRY)");
        } else {
            int i = number;
            while (i >= 1) {
                fact = fact * i;
                i--;
            }
            System.out.printf("%d! = %d", number, fact);
        }

    }

    public static void factorWithDoWhileloop() {
        Scanner enter = new Scanner(System.in);
        int number;
        long fact = 1;
        System.out.println("Please enter the number that you want factorial");
        number = enter.nextInt();
        enter.close();
        if (number < 0) {
            System.out.println(" There is no factorial number fro negative number (SORRY)");
        } else {
            int i = number;
            do {
                fact = fact * i;
                i--;
            }
            while (i >= 1);


            System.out.printf("%d! = %d", number, fact);
        }

    }
}
/*
 * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
 * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
 *
 */