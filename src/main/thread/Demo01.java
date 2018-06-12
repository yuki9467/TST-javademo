package main.thread;

/**
 * 创建线程的第一种方式：继承thread类，重写run()方法
 *
 * @author :liuqi
 * @date :2018-06-12 15:12.
 */
public class Demo01 {
    public static void main(String[] args) {
        Rabit r = new Rabit();
        Tortoise t = new Tortoise();
        // 调用start方法启动线程,不要调用run方法由内部自己调用
        r.start();
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("main --> " + i);
        }
    }
}
