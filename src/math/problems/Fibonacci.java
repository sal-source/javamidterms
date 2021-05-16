package math.problems;

public class Fibonacci {

    public static void main(String[] args) {
         /*
          Write 40 Fibonacci numbers with java.
          0,1,1,2,3,5,8,13
         */
        // fibonacci Definition THe value of n is is the sum of two percedente numbers ,f(0)=0 and f(1)=1;

        int a = 0;
        int b = 1;
        int sum;
        System.out.println("The value of " + 0 + " in Fiboncci = " + 0);
        System.out.println("The value of " + 1 + " in Fiboncci = " + 1);
        for (int i = 2; i <= 40; i++) {
            sum = a + b;
            a = b;
            b = sum;
            System.out.println("The value of " + i + " in Fiboncci = " + sum);

        }

    }
}