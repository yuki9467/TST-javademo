package src.main.thread;

/**
 * 真实角色
 *
 * @author :liuqi
 * @date :2018-06-12 17:39.
 */
public class Programer implements Runnable {
    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("一边coding: ");
        }
    }
}
