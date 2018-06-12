package main.thread;

/**
 * 兔子线程
 *
 * @author :liuqi
 * @date :2018-06-12 15:14.
 */
public class Rabit extends Thread {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("rabit run " + i);
        }
    }
}
