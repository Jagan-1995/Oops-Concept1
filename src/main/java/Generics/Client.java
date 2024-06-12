package Generics;

import java.util.HashMap;

public class Client {
    public static void main(String[] args) {
        Pair p1 = new Pair();
        /*
        By default, if you don't pass the data types, it can take any values
        it'll be of object type
        Also known as Raw types
         */
        p1.first = "ABC";
        p1.second = 9876;

        Pair<Integer, String> p2 = new Pair<>();
        p2.first = 16;
        p2.second = "Jagan";
        String res = p2.second;
        /*
        is it applying for a compile time check also??
         */
        Pair<Integer, String> p3 = new Pair</* after Java 8 it is Optional */ Integer, String>();

        HashMap hm = new HashMap();
        hm.put("Jagan","Baskar");
        hm.put(12,90.8);
        hm.put("hi",007);

        HashMap<Integer, String> hm2 = new HashMap<>();
        hm2.put(11, "Baskar");
        hm2.put(99, "something");

        /*
        For CPP
        vector<int> v;
        map<int, int> mp;
        Pair<int, int> p1;
         */

        // Backward compatability - older things should not break

        /*
        Generics  will help us to fail fast (at compile time, it will apply data type check)
         */

        Pair<Integer, Integer> p11 = new Pair<>();
        Pair<Integer, String > p12 = new Pair<>();
        Pair<Integer, Long> p13 = new Pair<>();
        Pair<Integer, Double> p14 = new Pair<>();

        p11.doSomethingNonStatic(50);
        Pair.<String,Integer>doSomethingStatic("hi",23);
        Pair.doSomethingStatic("anything", 55);

//        Pair.doSomethingStatic(25);
        /*
        Static method can't refer class level generic data type as to call these
        methods, we don't need an object and because of which we will not able to
        know the respective data type you're reffering to
         */

        Integer res1 = p13.doSomethingForLearning(88);

        Long res2 = p13.doSomethingForLearning(9999L);
        Integer res3 = p13.<Integer>doSomethingForLearning(66);
    }
}
