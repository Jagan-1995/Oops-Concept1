package LambdasStreams;

import org.w3c.dom.ls.LSOutput;

public class HelloWorldPrint implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World");
    }
}
