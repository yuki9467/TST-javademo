package src.main.thread;

/**
 * 乌龟线程
 *
 * @author :liuqi
 * @date :2018-06-12 15:17.
 */
public class Tortoise extends Thread {
    @Override
    public void run(){
        for (int i = 0; i < 5; i++) {
            System.out.println("Tortoise run " + i);
        }
    }
}
