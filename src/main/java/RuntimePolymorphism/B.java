package RuntimePolymorphism;

public class B extends A{
    @Override
    void doSomething(String b) {
        System.out.println("Inside B");
    }
}
