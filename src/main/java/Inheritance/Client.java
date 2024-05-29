package Inheritance;

public class Client {
    public static void main(String[] args) {
//        User user1 = new User();
//        user1.userName = "Scaler";
//        user1.email = "abc@gmail.com";
//        user1.name = "Jagan";

        Instructor i1 = new Instructor();
//        System.out.println(i1.email);
        i1.email = "jack@gmail.com";
        i1.userName = "";
        i1.name = "";
        i1.avgRating = 4.99;
        i1.batchName = "June 23 Beginner";
//        i1.scheduleClass();

        D d = new D();


    }
}
