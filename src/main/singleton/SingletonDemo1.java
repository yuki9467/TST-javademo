package src.main.singleton;

/**
 * 单例模式：饿汉式，第一种
 * 缺点：类加载时创建实例，比较消耗系统资源（要是应用没有使用这个实例，系统资源就白白浪费了）
 *
 * @author :liuqi
 * @date :2018-06-13 15:13.
 */
public class SingletonDemo1 {
    private static SingletonDemo1 instance = new SingletonDemo1();

    private SingletonDemo1() {
    }

    public static SingletonDemo1 getInstance() {
        return instance;
    }
}
