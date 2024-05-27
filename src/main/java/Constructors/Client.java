package Constructors;

public class Client {
    public static void main(String[] args) {
//        Student st1 = new Student(21,"kit");
//
//        Student st2 = new Student(50);
//        st2.roomNo = 6;
//
//        Student st3 = new Student();
//
//        Student st4 = new Student();

        Student st1 = new Student();
        st1.roomNo = 1;
        st1.univName = "kce";
        st1.rollNo = 8;
        st1.psp = 78.0;

        st1.fillCoffee(st1);

//        Student st2 = new Student(); // Another way of copying
//        st2.roomNo = 1;
//        st2.univName = "kce";
//        st2.rollNo = 8;
//        st2.psp = 78.0;

        Student st1Copy = new Student(st1);

        /*
        I want to create a new object with exact same set of values for the attributes
         */
        Student st2 = st1;
//        st2.rollNo = 100;

        System.out.println(st1);
        System.out.println(st2);


    }
}
