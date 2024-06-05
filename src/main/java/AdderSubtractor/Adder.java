package AdderSubtractor;

import java.util.concurrent.Callable;

public class Adder implements Callable<Void> {

    private Count count;
    Adder(Count count){
        this.count = count;
    }
    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100; i++){
            count.value += i;
        }
        return null;
    }
}
