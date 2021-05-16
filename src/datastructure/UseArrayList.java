package datastructure;

import java.util.ArrayList;
import java.util.Iterator;

public class UseArrayList {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         * Store all the sorted data into one of the databases.
         *
         */
        ArrayList<String> etudiant = new ArrayList<>();

        System.out.println("-----------how to add values in a ---------------");
        // we use method add()
        etudiant.add("Salim");
        etudiant.add("Ayaln");
        etudiant.add("Tass");
        etudiant.add("Yannis");
        etudiant.add("Waylan ");
        // there are to many ways to display the ArraylList
        System.out.println("----------- diplay just with name of arraylist--------------");
        System.out.println(etudiant);
        System.out.println("-----------display with for loop-------------");
        for (int i = 0; i < etudiant.size(); i++) {
            String s = etudiant.get(i);

            System.out.println(s);
        }
        System.out.println("--------display with inhenced for loop----------------");
        for (String r : etudiant) {
            System.out.println(r);
        }
        System.out.println("------------- with Iteratorcalsss--------------");
        Iterator ita = etudiant.iterator();
        while (ita.hasNext()) {
            String s = ita.next().toString();
            System.out.println(s);
        }
        System.out.println("-------------  read by using while loop-----------------");
        int j = 0;
        while (j < etudiant.size()) {

            System.out.println(etudiant.get(j));
            j++;
        }
        System.out.println("----------------dispaly by using do while loop-----------");
        int k = 0;
        do {
            System.out.println(etudiant.get(k));
            k++;
        }
        while (k < etudiant.size());

        System.out.println("---------------- how to add value for existing Arraylist");
        // we use the method add() and automaticly wil be added in after thw last index that have a value
        etudiant.add("hamida");
        System.out.println(etudiant);
        System.out.println("---------- how to add value at specifique index---------------------");
        // with overlooded add method(index, value) add but this time taking two parametres
        // the value of the index we update will shift to next index till the end of the array
        etudiant.add(0, "meziane");
        System.out.println(etudiant);

        System.out.println("remove  the value by specifying with index ");
        etudiant.remove(0);
        System.out.println(etudiant);
        System.out.println("--------------remove by using object value you want to remove is working just for String list --------------- ");
        etudiant.remove("hamida");
        System.out.println(etudiant);

        System.out.println("--------------add value by using forloop------------------- ");
        ArrayList<Integer> number = new ArrayList<>();
        for (int i = 10; i >= 1; i--) {
            number.add(i);

        }
        System.out.println(number);
        number.remove(9);
        System.out.println(number);


    }

}