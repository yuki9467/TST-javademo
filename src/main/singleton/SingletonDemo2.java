package src.main.singleton;

/**
 * 单例模式：懒汉式，第一种
 * 缺点：线程不安全
 *
 * @author :liuqi
 * @date :2018-06-13 15:17.
 */
public class SingletonDemo2 {
    private static SingletonDemo2 instance;

    private SingletonDemo2() {
    }

    public static SingletonDemo2 getInstance() {
        if (instance == null) {
            instance = new SingletonDemo2();
        }
        return instance;
    }
}
