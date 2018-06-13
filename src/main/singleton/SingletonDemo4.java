package src.main.singleton;

/**
 * 单例模式：懒汉式，第三种，双重检验锁
 * 缺点：看似已经解决上述问题，但是对于jvm来说仍然可能会发生错误,在JDK1.5之后，双重检查锁定才能够正常达到单例效果
 *
 * @author :liuqi
 * @date :2018-06-13 15:26.
 */
public class SingletonDemo4 {
    private static SingletonDemo4 instance;

    private SingletonDemo4() {
    }

    public static synchronized SingletonDemo4 getInstance() {
        if(instance == null){
            synchronized (instance){
                if (instance == null){
                    instance = new SingletonDemo4();
                }
            }
        }
        return instance;
    }
}
