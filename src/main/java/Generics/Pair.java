package Generics;

public class Pair<T, V> {
    T first;
    V second;

    void setFirst(T x){
        first = x;
    }

    V getSecond() {
        return second;
    }

    public static<A, B> void doSomethingStatic(A a, B b){

    }

    public void doSomethingNonStatic(V x){

    }

    public <Jagan> Jagan doSomethingForLearning(Jagan p1){
        return p1;
    }
}
