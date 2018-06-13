package src.main.thread;

/**
 * 使用匿名内部类的方式创建线程
 *
 * @author :liuqi
 * @date :2018-06-12 15:02.
 */
public class ThreadDemo {
    // 继承thread类实现多线程
    public static void main(String[] args) {
        new Thread() {
            @Override
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println(Thread.currentThread().getName() + "--"
                            + x);
                    System.out.println("rabit run " + "--"
                            + x);
                }
            }
        }.start();
        ;
        new Thread() {
            @Override
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println(Thread.currentThread().getName() + "--"
                            + x);
                    System.out.println("tortoise run " + "--"
                            + x);
                }
            }
        }.start();
        ;
        // 实现runnable接口，创建多线程并启动
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int x = 0; x < 5; x++) {
                    System.out.println(Thread.currentThread().getName() + "--"
                            + x);
                }
            }
        }) {
        }.start();
    }
}
