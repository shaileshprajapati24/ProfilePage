package Day5_Exception.Day8;

import java.util.HashMap;
// import java.util.TreeMap;

public class map{
    public static void main(String[] args) {
        HashMap<String,Integer> hm = new HashMap<String,Integer>();
        hm.put("ravi", 10);
        hm.put("ravi1", 10);
        hm.put("ravi2", 10);
        hm.put("ravi", 101);
        System.out.println(hm);
        System.out.println(hm.put("rk",12));
        System.out.println(hm.put("ravi",12));
        System.out.println(hm.keySet());
hm.put(null, 123);
hm.put(null, 125); //it allows one null value 


         TreeMap<String, Integer> tm = new TreeMap<String,Integer>();
        //  is doesn't allow null value

        tm.put("ravi", 10);
        tm.put("ravi1", 10);
        tm.put("ravi2", 10);
        tm.put("ravi", 101);
        // System.out.println(tm);


    }
}