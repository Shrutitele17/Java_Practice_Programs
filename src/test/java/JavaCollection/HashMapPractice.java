
//Java HashMap class implements the map interface by using a hashtable. It inherits AbstractMap class and implements Map interface.

//The important points about Java HashMap class are:
//
//A HashMap contains values based on the key.
//It contains only unique elements.
//It may have one null key and multiple null values.
//It maintains no order.
//hashmap is non-synchronised  -- not thread safe
//It gives Concurrent modification exception -- in case of Fail - Fast condition

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class HashMapPractice {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer,String>();
        hm.put(1,"Shruti");
        hm.put(2,"Sumit");
        hm.put(3,"Amit");

     for(Map.Entry<Integer, String> m : hm.entrySet())
     {
        // System.out.println(m.getKey() + " " + m.getValue());
         hm.replace(1,"Shruti","Anjali");
         System.out.println(m.getKey() + " " + m.getValue());
     }
        //System.out.println(m.getKey() + " " + m.getValue());
//        for(int num:hm.keySet())
//        {
//            System.out.println(hm.values());
//        }



    }

}
