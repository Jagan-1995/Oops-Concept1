package AdderSubtractor;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 100; i++){
            count.value -= i;
        }
        return null;
    }
}
