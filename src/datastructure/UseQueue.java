package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

    public static void main(String[] args) {
        /*
         * Demonstrate how to use Queue that includes add,peek,remove,pool elements.
         * Use For Each loop and while loop with Iterator to retrieve data.
         *
         */
        // we will try to use que for restaureant , it go first in first to serve
        Queue<String> list = new LinkedList<String>();
        list.add("menad");
        list.add("Arab");
        list.add("Hamid");
        list.add("Sofiane");
        list.add("Loussif");
        list.add("Hamid");
        list.add("Sofiane");
        System.out.println("-------------dispalay the que by using the name of the que---------------------");
        System.out.println(list);
        System.out.println("---------------dispaly by using each for looop-------------------");
        for (String s : list) {
            System.out.println(s);
        }

        System.out.println("----------------------dispaly by using Iterator------------------------");
        Iterator ita = list.iterator();
        while (ita.hasNext()) {
            System.out.println(ita.next());
        }
        System.out.println("-----we use method poll() to take out the next int the line  and serve that person--------");
        System.out.println("---------we polled menad  from the the line---------------- ");
        System.out.println(list.poll());
        System.out.println(list);
        System.out.println("--------we use the method peek() to serve persone in the line without taking him out------");
        System.out.println("-------we peeked arab to serve but still in queue------------------------");
        System.out.println(list.peek());
        System.out.println(list);
        System.out.println("-----------removing from the queue is removing the first in the que ----------");
        list.remove();
        System.out.println(list);


    }

}