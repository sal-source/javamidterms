package math.problems;

import java.util.ArrayList;

public class PrimeNumber {

    public static void main(String[] args) {
        /*
         * Find list of Prime numbers from number 2 to 1 million.
         * Try the best solution as possible.Which will take less CPU life cycle.
         * Out put number of Prime numbers on the given range.
         *
         *
         * Use MySql Database to store data and retrieve data.
         *
         */

        // prime number definition: is  natural number that is grater than 1 which has only 2 factors 1 and itself
        ArrayList<Integer> PrimeNumber = new ArrayList<>();
        int count = 0;
        int j;
        for (j = 2; j <= 100; j++) {
            boolean flag = true;
            for (int i = 2; i < j; i++) {
                if (j % i == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                PrimeNumber.add(j);
                //System.out.print(j+" ;");
            }
        }
        System.out.println(PrimeNumber);
    }
}

