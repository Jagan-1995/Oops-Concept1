package Collections;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        /*
        Collection interface is the root interface of the Collections Framework.
        Mainly 3 interface List, Queue, Set extends from the collection
        interface

         */

        /*
        List Interface -> ArrayList, LinkedList, Stack, Vector
         */

        /*
        ArrayList - Resizable implementation of List Interface
        Not thread safe
        ArrayList is actually implemented using Arrays
         */

        List<String> ls1 = new ArrayList<>();
        ls1.add("Jagan");
        ls1.add("Baskar");
        ls1.add("Sharath");
        ls1.add("Bharath");
        ls1.add("Sindhu");
        System.out.println(ls1);

        /*
        LinkedList is implemented using Doubly LinkedList
        not thread safe
        Random access using index is slower in LinkedList as compared to in Array List
         */
        List<String> ls2 = new LinkedList<>();

        /*
        Vector Thread safe
        preferable in multi threaded environment
         */
        List<String> ls3 = new Vector<>();

        /*
        Stack is Extended from Vector only, supports LIFO
        Thread safe
         */
        List<String> ls4 = new Stack<>();

        /*
        Set Interface - Not thread safe
        No duplicate elements
        constant time operation for search, insert, delete - O(1)
         */

        // No order confirmation, random
        Set<String> s1 = new HashSet<>();
        s1.add("Jagan");
        s1.add("Baskar");
        s1.add("Sharath");
        s1.add("Bharath");
        s1.add("Sindhu");
        System.out.println(s1);

        // Oder will be retained
        Set<String> s2 = new LinkedHashSet<>();
        s2.add("Jagan");
        s2.add("Baskar");
        s2.add("Sharath");
        s2.add("Bharath");
        s2.add("Sindhu");
        System.out.println(s2);

        // Natural Ordering - Lexicographical order
        Set< String> s3 = new TreeSet<>();
        s3.add("Jagan");
        s3.add("Baskar");
        s3.add("Sharath");
        s3.add("Bharath");
        s3.add("Sindhu");
        System.out.println(s3);

        /*
        EnumSet - Enum?
        Enum are nothing but constants. Whenever you've some perdefined strings
        or constants, you have enum
         */

        Payment p1 = new Payment();
        p1.status = PaymentStatus.APPROVED;

        Payment p2 = new Payment();
        p2.status = PaymentStatus.REJECTED;

        /*
        ENUMSET is to play around with enums
         */
        Set<PaymentStatus> s4 = EnumSet.allOf(PaymentStatus.class);
        System.out.println(s4);

        EnumSet<PaymentStatus> s5 = EnumSet.of(PaymentStatus.WHICH_ONE, PaymentStatus.PENDING, PaymentStatus.APPROVED, PaymentStatus.DONE);
        EnumSet<PaymentStatus> s6 = EnumSet.complementOf(s5);
        System.out.println(s5);
        System.out.println(s6);

        /*
        Queue Interface
         */

        /*
        -1 -> first element comes first
        +1 -> second element appears first in final output
        0 -> doesn't matter
         */
        Queue<String> q1 = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        q1.add("Jagan");
        q1.add("Baskar");
        q1.add("Sharath");
        q1.add("Bharath");
        q1.add("Sindhu");

        /*
        Priority queue is nothing but heap data structure
        min heap and max heap, by default pq is min heap
         */
        System.out.println(q1.peek());
        while(q1.size() > 0){ // !q1.isEmpty()
            System.out.println(q1.peek());
            q1.poll();
        }
        // i want to make it work like a max heap

        /*
        Comparable and Comparator Interfaces
         */

        Collections.sort(ls1, new Comparator<String>() {
            @Override
            public int compare(String s, String t1) {
                return t1.compareTo(s);
            }
        });
        System.out.println(ls1);

        List<Student> ls5 = new ArrayList<Student>();

        Student st1 = new Student("Jagan", 100, "Scaler");
        Student st2 = new Student("Baskar", 200, "DSML");
        Student st3 = new Student("Raman", 100, "ABC");

        ls5.add(st1);
        ls5.add(st2);
        ls5.add(st3);

        Collections.sort(ls5);
        Collections.sort(ls5, new StudentPSPComparator());
        Collections.sort(ls5, new StudentPSPUnivNameComparator());
//        Collections.sort(ls5, new Comparator<Student>() {
//            @Override
//            public int compare(Student student, Student t1) {
//                return 0;
//            }
//        });

        for (Student s : ls5){
            System.out.println(s.name + " " + s.psp + " " + s.univName);
        }

        /*
        Comparator Interface
         */

        /*
        To add Syntatic sugar to code, there's a beautiful thing is
        known as Lambda. It makes your code less bulky
         */



    }
}
