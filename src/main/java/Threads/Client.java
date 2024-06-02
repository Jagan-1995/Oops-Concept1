package Threads;

import javax.print.attribute.standard.PrinterInfo;

public class Client {
    static  void doSomething(){
        System.out.println("Printing something in Thread : " + Thread.currentThread().getName());
    }
    public static void main(String[] args) {
//        System.out.println("Thread Name : " + Thread.currentThread().getName());
//        doSomething();
//        System.out.println("Hello World");

//        PrintHelloWorld task1 = new PrintHelloWorld();
//        task1.run();
//         Thread t1 = new Thread(task1);
//         t1.start();

//        PrintNumber task2 = new PrintNumber(1);
//         Thread t2 = new Thread(task2);
//         t2.start();

        /*
        Print all the numbers from 1 to 100 using 100 different treads
         */
        for(int i = 1; i <= 100; i++){
            PrintNumber task = new PrintNumber(i);
            Thread t = new Thread(task);
            t.start();
        }
    }
}
