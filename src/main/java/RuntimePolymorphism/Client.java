package RuntimePolymorphism;

import java.util.ArrayList;
import java.util.List;

public class Client {

    public static void main(String[] args) {
        B b = new B();
        b.doSomething("Here I'm");

        A a = new A();
        a.doSomething("You found me");

        A a1 = new B(); // Runtime polymorphism
        a1.doSomething("now who will be called");  // to type cast ((B)a1)

        List<A> ls = new ArrayList<>();
        ls.add(new A());
        ls.add(new B());
        ls.add(new C());

        for(A it : ls){
            it.doSomething("output");
        }
    }
}
