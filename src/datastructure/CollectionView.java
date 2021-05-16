package datastructure;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class CollectionView {

    public static void main(String[] args) {
        /*
         Map is created and inserted some data.Retrieve the Collection view of values present in map
         */
        HashMap<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "NYC");
        map.put(2, "LA");
        map.put(3, "Denver");
        map.put(4, "Boston");
        map.put(5, "San Jose");
        map.put(6, "Seattle");
        System.out.println("-------retrieve collection value in map by using name of map and method values()----------");
        System.out.println(map.values());
        System.out.println("-------retrieve collection value in map by using inhanced for loop method values()--------");
        for (Map.Entry m : map.entrySet()) {

            System.out.println(m.getValue());
        }

        System.out.println("-------retrieve collection value in map by using Iterator  method values()--------");
        Iterator ita = map.entrySet().iterator();
        while (ita.hasNext()) {
            Map.Entry value = (Map.Entry) ita.next();
            System.out.println(value.getValue());
        }


    }

}