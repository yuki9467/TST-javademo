package src.main.singleton;

/**
 * 单例模式：饿汉式写法
 *
 * @author :liuqi
 * @date :2018-06-13 15:00.
 */
public class HungrySingleton {
    /**
     * 程序启动时就加载创建对象
     */
    private static final HungrySingleton newInstance = new HungrySingleton();

    /**
     * 私有构造方法
     */
    private HungrySingleton() {
    }
    /**
     * 提供公有访问函数
     *
     * @return Example
     */
    public static HungrySingleton getInstance() {
        return newInstance;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        // 新建5个线程，测试getInstance方法是否获取同一个HungrySingleton对象
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(HungrySingleton.getInstance());
                }
            }).start();
        }
    }
}
