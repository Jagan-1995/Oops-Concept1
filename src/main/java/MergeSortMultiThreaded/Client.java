package MergeSortMultiThreaded;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService ex = Executors.newCachedThreadPool();

        List<Integer> ls = List.of(8,3,6,1,9,2,7,4,10,5);

        Sorter t = new Sorter(ls, ex);

        Future<List<Integer>> res = ex.submit(t);

        ls = res.get();

        System.out.println(ls);
    }
}
