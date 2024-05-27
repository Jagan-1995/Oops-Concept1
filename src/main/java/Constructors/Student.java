package Constructors;

public class Student {
    int rollNo = 3;
    double psp;
    String univName;
    int roomNo;

    void fillCoffee(Student st){
          st = new Student();
        System.out.println("Something");
    }

//    Student(){
//        rollNo = 0;
//        psp = 0.0;
//        univName = null;
//        roomNo = 0;
//    }
    Student(int rollNo, String univName){
        this.rollNo = rollNo;
        this.univName = univName;
    }

    Student(int rollNo){
        this.rollNo = rollNo;
    }

    Student(){
//        work like default constructor
    }

    Student(Student oldObject){  // copy Constructors
        this.rollNo = oldObject.rollNo;
        this.univName = oldObject.univName;
        this.psp = oldObject.psp;
        this.roomNo = oldObject.roomNo;

    }

    Student(String HeyMan){
        /*
        here you should write valid code
         */
        this.univName = HeyMan;
    }

    /*
    className var1 = new className();
     */
}

/*
Without constructor, we can't create objects
Constructors creates objects
 */