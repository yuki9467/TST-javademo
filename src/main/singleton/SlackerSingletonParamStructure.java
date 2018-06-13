package src.main.singleton;

/**
 * 单例模式：懒汉式写法，有参构造方法
 *
 * @author :liuqi
 * @date :2018-06-13 14:42.
 */
public class SlackerSingletonParamStructure {
    /**
     * 私有构造方法：有参
     */
    private SlackerSingletonParamStructure(String str) {
        System.out.println(str);
    }
    /**
     * 创建内部类
     */
    private static class ExampleChild {
        // 内部类加载时初始化一次
        private static final SlackerSingletonParamStructure newInstance = new SlackerSingletonParamStructure("testInfo");
    }

    /**
     * 提供公有访问函数
     *
     * @return SlackerSingletonParamStructure
     */
    public static SlackerSingletonParamStructure getInstance() {
        // 调用内部类 进行初始化对象操作
        return ExampleChild.newInstance;
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        // 新建5个线程，测试getInstance方法是否获取同一个SlackerSingletonParamStructure对象
        for (int i = 0; i < 5; i++) {
            new Thread(new Runnable() {
                @Override
                public void run() {
                    System.out.println(SlackerSingletonParamStructure.getInstance());
                }
            }).start();
        }
    }
}
