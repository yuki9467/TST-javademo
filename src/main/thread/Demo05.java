package src.main.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * 使用collable接口创建线程
 *
 * @author :liuqi
 * @date :2018-06-13 10:22.
 */
public class Demo05 {
    public static void main(String[] args) throws InterruptedException,ExecutionException {
        // 创建两个线程
        ExecutorService ser = Executors.newFixedThreadPool(2);
        Race tortoise = new Race("乌龟",1000);
        Race rabbit = new Race("兔子",500);
        // 获取future对象
        Future<Integer> result1 = ser.submit(tortoise);
        Future<Integer> result2 = ser.submit(rabbit);
        // 2秒
        Thread.sleep(2000);
        // 停止线程体循环
        tortoise.setFlag(false);
        rabbit.setFlag(false);
        // 获取值
        int num1 = result1.get();
        int num2 = result2.get();
        System.out.println("乌龟跑了 " + num1 + "步");
        System.out.println("兔子跑了 " + num2 + "步");
        // 停止服务
        ser.shutdownNow();
    }
}
