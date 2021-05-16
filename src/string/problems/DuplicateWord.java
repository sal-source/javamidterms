package string.problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";
        Map<String, Integer> dupAcurance = new HashMap<>();
        dupAcurance = duplicatAccurance(st);
        System.out.println(dupAcurance);
        long average = avrage(st);
        System.out.println(average);
    }

    public static Map<String, Integer> duplicatAccurance(String Givenstring) {
        Map<String, Integer> map = new HashMap<String, Integer>();
        String st1 = Givenstring;
        String s = st1.toLowerCase();
        String s1 = s.replace(".", "");
        String[] arrays = s1.split(" ");
        Arrays.sort(arrays);

        for (int i = 0; i < arrays.length - 1; i++) {
            int count = 1;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[i].equalsIgnoreCase(arrays[j])) {
                    count++;
                } else break;
            }
            if (count > 1) {
                map.put(arrays[i], +count);
                i += (count - 1);
            }
        }

        return map;

    }

    public static long avrage(String givingstring) {
        String st1 = givingstring;
        String s = st1.replace(".", "");
        String[] arr = s.split(" ");
        long avg = 0;
        int sum = 0;
        for (int i = 0; i <= arr.length - 1; i++) {

            sum = (sum + arr[i].length());
            avg = sum / arr.length;
        }


        return avg;
    }


}