package Generics;

import java.util.List;

public class Utils {
    public static void simpleDoSomething(Animal animal){

    }

    public static void doSomething(List<? extends Animal> animals){
        for (Animal it : animals){

        }
    }
    /* ? denotes wildcard */

    public static <T extends Animal> T doSomething2(List<T> animals){
        return animals.get(0);
    }

    public static void printAnimalNames(List<? extends Animal> animals){
        for (Animal animal : animals){
            System.out.println("Animal name is : " + animal.name);
        }
    }

    public static <T extends A>void testInterface(List<T>){

    }

    /*
    ? extends Animal - anything which is of type animal or children of animal
    ? super Dog - useful when we're concerned about only animals attributes
    
     */
}
