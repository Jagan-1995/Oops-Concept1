package Singleton;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {

    public static void main(String[] args) {
//        Lock lock = new ReentrantLock();
        DatabaseConnection dbc1 = DatabaseConnection.getInstance(); // (lock)
        DatabaseConnection dbc2 = DatabaseConnection.getInstance(); // (lock)

        System.out.println(dbc1);
        System.out.println(dbc2);
    }
}
