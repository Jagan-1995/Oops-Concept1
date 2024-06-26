package AdderSubtractorSynchronized;

import java.util.concurrent.Callable;

public class Subtractor implements Callable<Void> {

    private Count count;

    Subtractor(Count count){
        this.count = count;
    }

    @Override
    public Void call() throws Exception {
        for(int i = 1; i <= 10000; i++){
            synchronized (count){
                count.value -= i;
            }

        }
        return null;
    }
}
