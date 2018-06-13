package src.main.thread;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 简单实现
 *
 * @author :liuqi
 * @date :2018-06-13 11:10.
 */
public class CallableAndFuture {
    static class MyThread implements Callable<String> {
        @Override
        public String call() throws Exception {
            return "Hello world";
        }
    }

    public static void main(String[] args) {
        ExecutorService threadPool = Executors.newSingleThreadExecutor();
        Future<String> future = threadPool.submit(new MyThread());
        try {
            System.out.println(future.get());
        } catch (Exception e) {

        } finally {
            threadPool.shutdown();
        }
    }
}
