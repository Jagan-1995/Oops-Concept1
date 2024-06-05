package Executors;

public class PrintNumber implements Runnable{

    int noToPrint;
    PrintNumber(int noToPrint){
        this.noToPrint = noToPrint;
    }

    @Override
    public void run() {
        System.out.println("Printing : " + noToPrint + " in Thread : " + Thread.currentThread().getName());
    }
}
