package src.main.singleton;

/**
 * 单例模式：懒汉式，第二种
 * 缺点：线程安全但是很影响性能，每次调用getInstance方法的时候都必须获得Singleton的锁，而实际上，当单例实例被创建以后，其后的请求没有必要再使用互斥机制了
 *
 * @author :liuqi
 * @date :2018-06-13 15:20.
 */
public class SingletonDemo3 {
    private static SingletonDemo3 instance;

    private SingletonDemo3() {
    }

    public static synchronized SingletonDemo3 getInstance() {
        if(instance == null){
            instance = new SingletonDemo3();
        }
        return instance;
    }
}
