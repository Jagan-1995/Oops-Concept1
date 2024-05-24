package ObjectAndClass;

public class Client {

    public static void main(String[] args) {
        Student st1 = new Student();
        /*
        new Student() creates an object of Student class and returns
        the object reference. The object contains copy of all the attributes
        present inside the class
         */

        st1.name = "Jagan";
        st1.psp = 98.6;
        st1.univName = "Scaler";

        Student st2 = new Student();
        st2.name = "Baskar";
        st2.psp = 99.8;
        st2.batch_id = 1;

        System.out.println(st1);
        System.out.println(st2);

        st2 = st1;


    }

}
